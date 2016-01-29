library("data.table")

selectSosie <- function(data) {
  return(subset(data, data$status >= 0))
}

selectCompile <- function(data) {
  return(subset(data, data$status >= -1))
}

selectAdd <- function(data) {
  return(subset(data, data$name == "add"))
}

selectReplace <- function(data) {
  return(subset(data, data$name == "replace"))
}

selectDelete <- function(data) {
  return(subset(data, data$name == "delete"))
}

selectDiff  <- function(data) {
  return(subset(data, data$diff != 0))
}

selectAllDiff  <- function(data) {
  return(subset(data,  (data$staticDiff == "true" | data$diff != 0 )))
}

size <- function(data) {
  return(length(data$maxDeep))
}

explorationRate <- function(data) {
  return(size(subset(data, data$nbTest != 0 & data$nbTrial != 0)) / size(subset(data, data$nbTest != 0 & data$isCandidate == "true")))
}

nbCandidateStmt <- function(data) {
  return( size(subset(data, data$nbTest != 0 & data$isCandidate == "true")))
}

testFunction <-  function(data) {
  return(length(data$diff))
}


run <- function(allTransformation, selectFunction, sizeSelect, evalFunction, sizeResult) {
  resultSet <- emptyDataFrame(allTransformation);
  
  result <- NULL
  for(i in c(1:sizeResult)) {
    selectedTransformation <- selectFunction(allTransformation, sizeSelect);
    result[[i]] <- evalFunction(selectedTransformation);
  #  resultSet <- add(resultSet, evalFunction(selectedTransformation));
    
  }
  return(rbindlist(result));
}



infoRun <- function(data) {
  info <- data.frame()
  info[1,"nbTrial"] <- size(data)
  
  info[1,"nbAdd"] <- size(selectAdd(data))
  info[1,"%Add"] <- info[1,"nbAdd"] / info[1,"nbTrial"]
  
  info[1,"nbReplace"] <- size(selectReplace(data))
  info[1,"%Replace"] <- info[1,"nbReplace"] / info[1,"nbTrial"]
  
  info[1,"nbDelete"] <- size(selectDelete(data))
  info[1,"%Delete"] <- info[1,"nbDelete"] / info[1,"nbTrial"]
  
  info[1,"nbSosie"] <- size(selectSosie(data))
  info[1,"%Sosie"] <- info[1,"nbSosie"] / info[1,"nbTrial"]
  
  info[1,"nbSosieAdd"] <- size(selectAdd(selectSosie(data)))
  info[1,"%SosieAdd"] <- info[1,"nbSosieAdd"] / info[1,"nbAdd"]
  
  info[1,"nbSosieDelete"] <- size(selectDelete(selectSosie(data)))
  info[1,"%SosieDelete"] <- info[1,"nbSosieDelete"] / info[1,"nbDelete"]
  
  info[1,"nbSosieReplace"] <- size(selectReplace(selectSosie(data)))
  info[1,"%SosieReplace"] <- info[1,"nbSosieReplace"] / info[1,"nbReplace"]
  

  info[1,"nbDiff"] <- size(selectDiff(data))
  info[1,"%Diff"] <- info[1,"nbDiff"] / info[1,"nbSosie"]
  info[1,"nbAllDiff"] <- size(selectAllDiff(data))
  info[1,"%AllDiff"] <- info[1,"nbAllDiff"] / info[1,"nbSosie"]
  
  return(info)
}

zone <- function(data, tDeep, tTest) {
  info <- data.frame()
  
  set <- subset(data, data$nbTest <= tTest)
  info[1,"lowerTestSosie"] <- size(selectSosie(set))/size(set)
  info[1,"lowerTestDiff"] <- size(selectDiff(set))/size(set)
  info[1,"lowerTestDiffCompile"] <- size(selectDiff(set))/size(selectCompile(set))
  positions <- transPerPosition(set, T)
  info[1,"lowerTestPosition"] <- size(subset(set, set$nb > 1))/size(positions)
  
  set <- subset(data, data$nbTest > tTest)  
  info[1,"superiorTestSosie"] <- size(selectSosie(set))/size(set)
  info[1,"superiorTestDiff"] <- size(selectDiff(set))/size(set)
  info[1,"superiorTestDiffCompile"] <- size(selectDiff(set))/size(selectCompile(set))
  positions <- transPerPosition(set, T)
  info[1,"superiorTestPosition"] <- size(subset(set, set$nb > 1))/size(positions)
  
  set <- subset(data, data$meanDeep <= tDeep)
  info[1,"lowerDeepSosie"] <- size(selectSosie(set))/size(set)
  info[1,"lowerDeepDiff"] <- size(selectDiff(set))/size(set)
  info[1,"lowerDeepDiffCompile"] <- size(selectDiff(set))/size(selectCompile(set))
  positions <- transPerPosition(set, T)
  info[1,"lowerDeepPosition"] <- size(subset(set, set$nb > 1))/size(positions)

  set <- subset(data, data$meanDeep > tDeep)  
  info[1,"superiorDeepSosie"] <- size(selectSosie(set))/size(set)
  info[1,"superiorDeepDiff"] <- size(selectDiff(set))/size(set)
  info[1,"superiorDeepDiffCompile"] <- size(selectDiff(set))/size(selectCompile(set))
  positions <- transPerPosition(set, T)
  info[1,"superiorDeepPosition"] <- size(subset(set, set$nb > 1))/size(positions)

  return( signif(info,2))
}

randomSelection <- function(transformations, sizeSelect) {
  result <- emptyDataFrame(transformations);
  size <- size(transformations);
  
  return(transformations[sample(1:size, sizeSelect),])
}

adrSelection <- function(transformations, sizeSelect) {
  result <- emptyDataFrame(transformations);
  adds <- subset(transformations, transformations$name == "add");
  addsSize <- size(adds)
  replaces <- subset(transformations, transformations$name == "replace")
  replacesSize <- size(replaces)
  deletes <- subset(transformations, transformations$name == "delete")
  deletesSize <- size(deletes)
  
  for(i in c(1:sizeSelect)) {
    randomType <- sample(1:5, 1)
    if(randomType == 1) {
      randomSelect <- sample(1:addsSize, 1)
      result <- rbind(result, adds[randomSelect,])
    } else {
      if(randomType == 2) {
        randomSelect <- sample(1:deletesSize, 1)
        result <- rbind(result, deletes[randomSelect,])
      } else {
        randomSelect <- sample(1:replacesSize, 1)
        result <- rbind(result, replaces[randomSelect,])  
      }
    }
  }
  return(result)
}

randomEval <- function(transformations) {
  size <- size(transformations);
  random <- sample(1:size, 1)
  return(transformations[random,]);
}

maxTestEval <- function(transformations) {
  size <- size(transformations)
  index <- sample(1:size, 1)
  maxTest <- 0
  
  for(i in c(1:size)) {
    if(transformations[i, "nbTest"] > maxTest) {
      index <- i
      maxTest <- transformations[i, "nbTest"] 
    }  
  }
  return(transformations[index,]);
}

minTestEval <- function(transformations) {
  size <- size(transformations)
  index <- sample(1:size, 1)
  minTest <- 100000
  
  for(i in c(1:size)) {
    if(transformations[i, "nbTest"] < minTest) {
      index <- i
      minTest <- transformations[i, "nbTest"] 
    }  
  }
  return(transformations[index,]);
}

maxTestmeanDeepEval <- function(transformations) {
  size <- size(transformations)
  index <- sample(1:size, 1)
  maxTestmeanDeep <- 0
  
  for(i in c(1:size)) {
    if(!is.na(transformations[i, "meanDeep"]) & 
         log(transformations[i, "nbTest"] + 1) * transformations[i, "meanDeep"] > maxTestmeanDeep) {
      index <- i
      maxTestmeanDeep <- log(transformations[i, "nbTest"] + 1) * transformations[i, "meanDeep"]
    }  
  }
  return(transformations[index,]);
}

maxDeepEval <- function(transformations) {
  size <- size(transformations)
  index <- sample(1:size, 1)
  maxDeep <- 0
  
  for(i in c(1:size)) {
    if(!is.na(transformations[i, "meanDeep"]) & transformations[i, "meanDeep"] > maxDeep) {
      index <- i
      maxDeep <- transformations[i, "meanDeep"] 
    }
  }
  return(transformations[index,]);
}

minDeepEval <- function(transformations) {
  size <- size(transformations)
  index <- sample(1:size, 1)
  minDeep <- 10000
  
  for(i in c(1:size)) {
    if(!is.na(transformations[i, "meanDeep"]) & transformations[i, "meanDeep"] < minDeep) {
      index <- i
      minDeep <- transformations[i, "meanDeep"] 
    }
  }
  return(transformations[index,]);
}


emptyDataFrame <- function(data) {
  return( data[0,])
}

plotTransMax <- function(data, whiteSosie, file) {
  notNa <- subset(data, !is.na(data$meanDeep) & data$meanDeep >= 0) 
  notSosie <- subset(notNa, !is.na(notNa$meanDeep))
  
  sosie <- selectSosie(notNa)
  pdf(file,height=8.27,width=11.69)
  
  if(whiteSosie) {
    sosie <- selectSosie(notNa)
    plot(log(notSosie$nbTest, base = 10),notSosie$maxDeep, ylab="max depth", xlab="log10(nb test)", main="commons-lang transformation")
    points(log(sosie$nbTest, base = 10),sosie$maxDeep, col="red", pch=20)
  } else {
    plot(log(notNa$nbTest, base = 10),notNa$maxDeep, ylab="max depth", xlab="log10(nb test)", main="commons-lang transformation")
  }
  dev.off()
}

plotStmtMax <- function(data, whiteSosie, file) {
  notNa <- subset(data, !is.na(data$meanDeep) & data$meanDeep != 0) 
  notSosie <- subset(notNa, notNa$nbSosie == 0)
  sosie <- subset(notNa, notNa$nbSosie != 0)
  pdf(file,height=8.27,width=11.69)
  
  if(whiteSosie) {
    plot(log(notSosie$nbTest, base = 10),notSosie$maxDeep, ylab="max depth", xlab="log10(nb test)", main="commons-lang statement")
    points(log(sosie$nbTest, base = 10),sosie$maxDeep, col="red", pch=20)
  } else {
    plot(log(notNa$nbTest, base = 10),notNa$maxDeep, ylab="max depth", xlab="log10(nb test)", main="commons-lang statement")
  }
  dev.off()
}

plotTransMean <- function(data, whiteSosie, file) {
  notNa <- subset(data, !is.na(data$meanDeep) & data$meanDeep >= 0) 
  notSosie <- subset(notNa, !is.na(notNa$meanDeep))
  
  sosie <- selectSosie(notNa)
  pdf(file,height=8.27,width=11.69)
  
  if(whiteSosie) {
    sosie <- selectSosie(notNa)
    plot(log(notSosie$nbTest, base = 10),notSosie$meanDeep, ylab="mean depth", xlab="log10(nb test)", main="commons-lang transformation")
    points(log(sosie$nbTest, base = 10),sosie$meanDeep, col="red", pch=20)
  } else {
    plot(log(notNa$nbTest, base = 10),notNa$meanDeep, ylab="mean depth", xlab="log10(nb test)", main="commons-lang transformation")
  }
  dev.off()
}

plotStmtMean <- function(data, whiteSosie, file) {
  notNa <- subset(data, !is.na(data$meanDeep) & data$meanDeep != 0) 
  notSosie <- subset(notNa, notNa$nbSosie == 0)
  sosie <- subset(notNa, notNa$nbSosie != 0)
#  pdf(file,height=8.27,width= 23.38)
  
  xlimit = c(1, max(sqrt(notNa$nbTest)))
  ylimit = c(0, max(notNa$meanDeep))
  if(whiteSosie) {
    plot(log10(notSosie$nbTest),notSosie$meanDeep, ylab="mean depth", xlab="log10(nb test)", xlim=xlimit, ylim=ylimit)
    points(log10(sosie$nbTest),sosie$meanDeep, col="red", pch=20)
  } else {
    plot(sqrt(notNa$nbTest),notNa$meanDeep, ylab="mean depth", xlab="log10(nb test)", xlim=xlimit, ylim=ylimit)
  }
 # dev.off()
}

writeStmt <- function(data, file) {
  write.csv(subset(data, !is.na(data$medianDeep) & data$medianDeep > 0) , file = file,row.names=FALSE)
}

plotStmt <- function(data, file) {
  notNa <- subset(data, !is.na(data$medianDeep) & data$medianDeep > 0) 
  pdf(file,height=6.27,width= 23.38)
  
  par(fig=c(0,0.95,0,0.9), new=TRUE)

  xlimit = c(0, max(log10(notNa$nbTest)))
  ylimit = c(0, max(notNa$meanDeep))
  plot(log10(notNa$nbTest),notNa$medianDeep, ylab="mean depth", xlab="log10(number of test cases (TC))", xlim=xlimit, ylim=ylimit)
 
  
  #plotStmtMean(data, F, file) 
  par(fig=c(0.9,1,0.018,0.9),new=TRUE)
  boxplot(notNa$medianDeep, axes=F)
 
  par(fig=c(0,0.95,0.65,1), new=TRUE)
  boxplot(log10(notNa$nbTest), horizontal=TRUE, axes=F)
 
  #mtext("commons-lang statements", side=3, outer=TRUE, line=-3) 
  
  dev.off()

}


findPosition <- function(data, onlySosie, nbTestMin, nbTestMax, isMaxDeep, deepMin, deepMax) {
  if(onlySosie) {
    if(colnames(data)[1]== "uuid") {
      d <- selectSosie(data)
    } else {
      d <-  subset(data, data$nbSosie != 0)
    }
  } else {
    d <- data
  }
  if(isMaxDeep) {
    return(subset(d, d$nbTest >= nbTestMin & d$nbTest <= nbTestMax & d$maxDeep >= deepMin & d$maxDeep <= deepMax))
  } else {
    return(subset(d, d$nbTest >= nbTestMin & d$nbTest <= nbTestMax & d$meanDeep >= deepMin & d$meanDeep <= deepMax))
  }
}

transPerPosition <- function(data) {
  allPosition <- union(data$position, data$position)
  result <- data.frame()
  count <- 0
  for(p in allPosition) {
    count <- count + 1 
    result[count, "position"] <- p
    result[count, "trial"] <- sum(subset(data, data$position == p)$nbTrial)
    result[count, "sosie"] <- sum(subset(data, data$position == p & data$nbSosie != 0)$nbSosie)  
  }
  
  return(result)
}

plotAllStmtDeepMean <- function() {
  plotStmtDeepMean(commons.codec_stmt, 1000, T)
  plotStmtDeepMean(commons.collections2_stmt, 1000, F)
  plotStmtDeepMean(gson_stmt, 1000, F)
}

plotStmtDeepMean <- function(data, xaxis, isPlot) {
  notNa <- subset(data, !is.na(data$meanDeep) )
  notNa <-  subset(notNa, notNa$meanDeep != 0)
  sample <- samplePoints(sort(notNa$meanDeep),xaxis)
  multi <- 10/max(sample)
  if(isPlot) {
    plot(sample*multi, type="l")
  } else {
    lines(sample*multi, type="l")
  }
  
}

samplePoints <- function(data, size) {
  result <- vector()
  multi <- length(data)/size
  for(i in 1:size) {
    result[i] <- data[floor(i*multi)]
  }
  return(result)
}

printAllBarPlot <- function(dir, nbGroup) {
  pdf(paste(dir, "sosie-nbTest-log10.pdf", sep="/"),height=8.27,width= 11.69)
  barplotTrans(11,nbGroup, T)
  dev.off()
  
  pdf(paste(dir, "sosie-maxDeep-log10.pdf", sep="/"),height=8.27,width= 11.69)
  barplotTrans(12,nbGroup, T)
  dev.off()
  
  pdf(paste(dir, "sosie-meanDeep-log10.pdf", sep="/"),height=8.27,width= 11.69)
  barplotTrans(13,nbGroup, T)
  dev.off()
  
  pdf(paste(dir, "sosie-trans.pdf", sep="/"),height=8.27,width= 11.69)
  barplotTrans2(T)
  dev.off()
  
  pdf(paste(dir, "diff-nbTest-log10.pdf", sep="/"),height=8.27,width= 11.69)
  barplotTrans(11,nbGroup, T)
  dev.off()
  
  pdf(paste(dir, "diff-maxDeep-log10.pdf", sep="/"),height=8.27,width= 11.69)
  barplotTrans(12,nbGroup, F)
  dev.off()
  
  pdf(paste(dir, "diff-meanDeep-log10.pdf", sep="/"),height=8.27,width= 11.69)
  barplotTrans(13,nbGroup, F)
  dev.off()
  
  pdf(paste(dir, "diff-trans.pdf", sep="/"),height=8.27,width= 11.69)
  barplotTrans2(F)
  dev.off()
}

barplotTrans <- function(xaxis, nbGroup, isSosieTrial) {
  mat <- matrix(nrow = 4, ncol = nbGroup, dimnames = list(c("gson", "codec", "collections","lang"), 1:nbGroup))
 
  count <- 1
  for(i in buildGroup(gson, xaxis, isSosieTrial, nbGroup)) {
    mat[1,count] <- i
    count <- count + 1
  }
  
  count <- 1
  for(i in buildGroup(commons.codec, xaxis, isSosieTrial, nbGroup)) {
    mat[2,count] <- i
    count <- count + 1
  }
  
  count <- 1
  for(i in buildGroup(commons.collections, xaxis, isSosieTrial, nbGroup)) {
    mat[3,count] <- i
    count <- count + 1
  }
  
  count <- 1
  for(i in buildGroup(commons.lang, xaxis, isSosieTrial, nbGroup)) {
    mat[4,count] <- i
    count <- count + 1
  }
  
  ylegend <- "diffSosie/sosie"
  if(isSosieTrial) {
    ylegend <- "sosie/trial"
  }
  barplot(mat, beside = TRUE, col = c("red", "green", "blue", ), names.arg = toupper(colnames(mat))
          , xlab = colnames(commons.codec)[xaxis], ylab = ylegend, legend.text = TRUE)
  }

buildGroup <- function(data, xaxis, isSosieTrial,nbGroup) {
  size <- log10(max(data[,xaxis]))
  
  groupSize <- size/nbGroup
  result <- vector()
  for(i in 1:nbGroup) {  
    set <- subset(data, log10(data[,xaxis]) >  (groupSize * (i - 1)) & log10(data[,xaxis]) <= (groupSize * i))
    if(isSosieTrial) {
      result[i] <- size(selectSosie(set))/size(set)
    } else {
      result[i] <- size(selectDiff(set))/size(selectSosie(set)) 
    }
  }
  
  return(result)
}


barplotTrans2 <- function(isSosieTrial) {
  mat <- matrix(nrow = 4, ncol = 3, dimnames = list(c("gson", "codec", "collections","lang"), c("add", "replace", "delete")))
  
  count <- 1
  for(i in buildGroup2(gson, isSosieTrial)) {
    mat[1,count] <- i
    count <- count + 1
  }
  
  count <- 1
  for(i in buildGroup2(commons.codec, isSosieTrial)) {
    mat[2,count] <- i
    count <- count + 1
  }
  
  count <- 1
  for(i in buildGroup2(commons.collections, isSosieTrial)) {
    mat[3,count] <- i
    count <- count + 1
  }
  
  count <- 1
  for(i in buildGroup2(commons.lang, isSosieTrial)) {
    mat[4,count] <- i
    count <- count + 1
  }
  
  ylegend <- "diffSosie/sosie"
  if(isSosieTrial) {
    ylegend <- "sosie/trial"
  }
  barplot(mat, beside = TRUE, col = c("red", "green", "blue"), names.arg = toupper(colnames(mat))
          , xlab = "type transformation", ylab = ylegend, legend.text = TRUE)
}

buildGroup2 <- function(data, isSosieTrial) {
  result <- vector()
  
  set <- subset(data, data$name == "add")
  if(isSosieTrial) {
    result[1] <- size(selectSosie(set))/size(set)
  } else {
    result[1] <- size(selectDiff(set))/size(selectSosie(set)) 
  }
  
  set <- subset(data, data$name == "replace")
  if(isSosieTrial) {
    result[2] <- size(selectSosie(set))/size(set)
  } else {
    result[2] <- size(selectDiff(set))/size(selectSosie(set)) 
  }
  
  set <- subset(data, data$name == "delete")
  if(isSosieTrial) {
    result[3] <- size(selectSosie(set))/size(set)
  } else {
    result[3] <- size(selectDiff(set))/size(selectSosie(set)) 
  }
  
  return(signif(result,1))
}