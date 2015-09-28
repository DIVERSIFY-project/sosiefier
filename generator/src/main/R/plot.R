plotNbTest <- function(xaxisFunction, yaxisFunction, ylabel, nbGroup) {
  data.codec <- buildGroup(commons.codec, 11, xaxisFunction, lowerMax, yaxisFunction, groupIndex, nbGroup)
  data.collections <- buildGroup(commons.collections, 11, xaxisFunction, lowerMax, yaxisFunction, groupIndex, nbGroup)
  data.lang <- buildGroup(commons.lang, 11, xaxisFunction, lowerMax, yaxisFunction, groupIndex, nbGroup)
  data.gson <- buildGroup(gson, 11, xaxisFunction, lowerMax, yaxisFunction, groupIndex, nbGroup)
  
  ymax <- max(data.codec$value, data.collections$value, data.lang$value, data.gson$value)
  ymin <- min(data.codec$value, data.collections$value, data.lang$value, data.gson$value)
  
  plot(data.codec$value, type="l", ylim = c(ymin, ymax), ylab = ylabel, xlab="Number of Executed Test Cases")
  lines(data.collections$value, col="blue")
  lines(data.lang$value, col="red")
  lines(data.gson$value, col="green")
  
  legend(nbGroup - nbGroup/4, ymax,c("codec","collections","lang", "gson"), # puts text in the legend
         lty=c(1,1,1,1), # gives the legend appropriate symbols (lines)        
         lwd=c(2.5,2.5,2.5,2.5),col=c("black","blue","red", "green")) # gives the legend lines the correct color and width
}

plotDepth <-function(xaxis, xaxisFunction, yaxisFunction, ylabel, nbGroup) {
  data.codec <- buildGroup(commons.codec, xaxis, xaxisFunction, between, yaxisFunction, groupMean, nbGroup)
  data.collections <- buildGroup(commons.collections, xaxis, xaxisFunction, between, yaxisFunction, groupMean, nbGroup)
  data.lang <- buildGroup(commons.lang, xaxis, xaxisFunction, between, yaxisFunction, groupMean, nbGroup)
 # data.gson <- buildGroup(gson, xaxis, xaxisFunction, between, yaxisFunction, groupMean, nbGroup)
  
  xmax <- max(data.codec$group, data.collections$group, data.lang$group)
  xmin <- min(data.codec$group, data.collections$group, data.lang$group)
 
  gsonSubSet <- subset(gson, gson[,xaxis] < xmax) 
  data.gson <- buildGroup(gsonSubSet, xaxis, xaxisFunction, between, yaxisFunction, groupMean, nbGroup)
  
  ymax <- max(data.codec$value, data.collections$value, data.lang$value, data.gson$value)
  ymin <- min(data.codec$value, data.collections$value, data.lang$value, data.gson$value)

  plot(data.codec$group, data.codec$value, type="l", ylim = c(ymin, ymax), xlim = c(xmin, xmax), ylab = ylabel, xlab = colnames(commons.codec)[xaxis])
  lines(data.collections$group, data.collections$value, col="blue")
  lines(data.lang$group, data.lang$value, col="red")
  lines(data.gson$group, data.gson$value, col="green")
  
  legend(nbGroup - nbGroup/4, ymax,c("codec","collections","lang", "gson"), # puts text in the legend
         lty=c(1,1,1,1), # gives the legend appropriate symbols (lines)        
         lwd=c(2.5,2.5,2.5,2.5),col=c("black","blue","red", "green")) # gives the legend lines the correct color and width
}


plotAllDepth <- function(dir, nbGroup) {
  for(xaxis in 11:14) {
    pdf(paste(dir, "SRC-",colnames(commons.codec)[xaxis], "-", nbGroup,".pdf",sep=""),height=8.27,width= 11.69)
    plotDepth(xaxis, identity, sosieficateRateCompile, "Sosieficate Rate Compile", nbGroup)
    dev.off()
  }
}

barplotSosieByTest <- function(data) {
  xdata <- sort(union(data$nbTest, data$nbTest))
  ydata <- vector()
  count <- 1
  for(x in xdata) {
    set <- subset(data, data$nbTest == xdata[count] & data$nbTrial != 0)
    ydata[count] <- sum(set$nbCompile)
   # if(size(subset(set, set$nbCompile != 0)) != 0) { 
   #   ydata[count] <- size(subset(set, set$nbSosie != 0)) / size(subset(set, set$nbCompile != 0))
    #} else {
     # ydata[count] <- 0   
    #}
    count <- count + 1
  }
  print(ydata)
  barplot(ydata)  
} 

buildDataFromTransformation <- function(data, index) {
  result <- data.frame()
  set <- subset(data, data$nbTest != 0)
  tests <- sort(union(set[,index], set[,index]))
  
  for(test in tests) {
    set <- subset(data, data[,index] == test)
    testString <- paste(test)
    result[testString,colnames(data)[index]] <- test
    
    result[testString,"stmt"] <- length(union(set[,"position"], set[,"position"]))
    
    result[testString,"nbTrial"] <- size(set)
    result[testString,"nbCompile"] <- size(subset(set, set$status >= -1))
    result[testString,"nbSosie"] <- size(subset(set, set$status >= 0))
  
  result[testString,"nbDiff"] <- size(subset(set, set$status >= 0 & (set$staticDiff == "true" | set$diff != 0)))
  }
  return(result)
}

buildDataFromTransformation2 <- function(data, dir) {
  result <- buildDataFromTransformation(data, 3)
  write.csv2(result, paste(dir, "-transformationType.csv", sep=""), row.names=FALSE)
  
  result <- buildDataFromTransformation(data, 17)
  write.csv2(result, paste(dir, "-transplatationPoint.csv", sep=""), row.names=FALSE)
  
  result <- buildDataFromTransformation(data, 18)
  write.csv2(result, paste(dir, "-transplant.csv", sep=""), row.names=FALSE)
  
  
}

buildData <- function(data, index, sizeMax) {
  result <- data.frame()
  set <- subset(data, data$nbTest != 0)
  tests <- sort(union(set[,index], set[,index]))
  
  for(test in tests) {
    set <- subset(data, data[,index] == test)
    testString <- paste(test)
    result[testString,colnames(data)[index]] <- test
    
    result[testString,"stmt"] <- size(set)
    result[testString,"stmtTrial"] <- size(subset(set, set$nbTrial != 0))
    result[testString,"stmtCompile"] <- size(subset(set, set$nbCompile != 0))
    result[testString,"stmtSosie"] <- size(subset(set, set$nbSosie != 0))
    result[testString,"stmtMultiSosie"] <- size(subset(set, set$nbSosie > 1))
    
    result[testString,"nbTrial"] <- sum(subset(set, set$nbTrial != 0)$nbTrial)
    result[testString,"nbCompile"] <- sum(subset(set, set$nbCompile != 0)$nbCompile)
    result[testString,"nbSosie"] <- sum(subset(set, set$nbSosie != 0)$nbSosie)
    result[testString,"nbDiff"] <- sum(subset(set, set$nbDiff != 0)$nbDiff) + sum(subset(set, set$nbStaticDiff != 0)$nbStaticDiff) 
  }
  return(result)
}

buildData2 <- function(data, index, sizeMin) {
  result <- data.frame()
  set <- subset(data, data$nbTest != 0)
  selectors <- sort(union(set[,index], set[,index]))
  
  count <- 1
  while(count < length(selectors)) {
    selector <- selectors[count]
    count <- count + 1
    selectorString <- paste(selector)
    set <- subset(data, data[,index] == selector)
    
    result[selectorString,paste(colnames(data)[index], "Min", sep="")] <- selector
    while(count < length(selectors) & sum(set$nbCompile) < sizeMin) {
      selector <- selectors[count]
      count <- count + 1
      set <- rbind(set, subset(data, data[,index] == selector))
    }
    result[selectorString,paste(colnames(data)[index], "Max", sep="")] <- selector
    result[selectorString,paste(colnames(data)[index], sep="")] <-  result[selectorString,1]/2 + result[selectorString,2]/2 
    result[selectorString,"stmt"] <- size(set)
    result[selectorString,"stmtTrial"] <- size(subset(set, set$nbTrial != 0))
    result[selectorString,"stmtCompile"] <- size(subset(set, set$nbCompile != 0))
    result[selectorString,"stmtSosie"] <- size(subset(set, set$nbSosie != 0))
    result[selectorString,"stmtMultiSosie"] <- size(subset(set, set$nbSosie > 1))  
    result[selectorString,"nbTrial"] <- sum(subset(set, set$nbTrial != 0)$nbTrial)
    result[selectorString,"nbCompile"] <- sum(subset(set, set$nbCompile != 0)$nbCompile)
    result[selectorString,"nbSosie"] <- sum(subset(set, set$nbSosie != 0)$nbSosie)
    result[selectorString,"nbDiff"] <- sum(subset(set, set$nbDiff != 0)$nbDiff) + sum(subset(set, set$nbStaticDiff != 0)$nbStaticDiff) 
  }
  result <- subset(result, result$nbCompile > sizeMin)
  return(result)
}

plotLm <- function(data, build, index, sizeMin, functionX, functionY, ylabel, xlabel) {
  result <- build(data, index, sizeMin)
  result <- subset(result, result$nbCompile != 0)
  
  plot(functionX(result) ~ functionY(result), xlab=xlabel, ylab= ylabel)
  lmTmp <- lm(functionX(result) ~ functionY(result))
  
  abline(lmTmp, col = "red")
  summary(lmTmp)
}

plotAllLm <- function(data, build, yfunction, ylabel, xfunction) {
  par(mfrow=c(2,3))
  plotLm(data, build, 7, 100, yfunction, function(data) {return(xfunction(data$nbTest))}, ylabel, "nbTest")
  plotLm(data, build, 8, 100, yfunction, function(data) {return(xfunction(data$nbAssert))}, ylabel, "nbAssert")
  plotLm(data, build, 9, 100, yfunction, function(data) {return(xfunction(data$maxDeep))}, ylabel, "maxDeep")
  plotLm(data, build, 10, 100, yfunction, function(data) {return(xfunction(data$meanDeep))}, ylabel, "meanDeep")
  plotLm(data, build ,11, 100, yfunction, function(data) {return(xfunction(data$medianDeep))}, ylabel, "median")
  plotLm(data, build, 12, 100, yfunction, function(data) {return(xfunction(data$minDeep))}, ylabel, "minDeep")
  
  
}

writeAllPlot <- function(data, dir) {
  sosieRateCompileFunction <- function(data) {return(data$nbSosie/data$nbCompile)}
  
  pdf(paste(dir, "-group-SRC-log.pdf",sep=""),height=8.27,width= 11.69)
  plotAllLm(data, buildData2, sosieRateCompileFunction, "sosie rate compile", function(data) {log(data +1)})
  dev.off()
  pdf(paste(dir, "-group-SRC.pdf",sep=""),height=8.27,width= 11.69)
  plotAllLm(data, buildData2, sosieRateCompileFunction, "sosie rate compile", function(data) {data})
  dev.off()
  
  pdf(paste(dir, "-SRC-log.pdf",sep=""),height=8.27,width= 11.69)
  plotAllLm(data, buildData, sosieRateCompileFunction, "sosie rate compile", function(data) {log(data +1)})
  dev.off()
  pdf(paste(dir, "-SRC.pdf",sep=""),height=8.27,width= 11.69)
  plotAllLm(data, buildData, sosieRateCompileFunction, "sosie rate compile", function(data) {data})
  dev.off()
  
  sosieRateFunction <- function(data) {return(data$nbSosie/data$nbTrial)}
  
  pdf(paste(dir, "-group-SR-log.pdf",sep=""),height=8.27,width= 11.69)
  plotAllLm(data, buildData2, sosieRateFunction, "sosie rate", function(data) {log(data +1)})
  dev.off()
  pdf(paste(dir, "-group-SR.pdf",sep=""),height=8.27,width= 11.69)
  plotAllLm(data, buildData2, sosieRateFunction, "sosie rate", function(data) {data})
  dev.off()
  
  pdf(paste(dir, "-SR-log.pdf",sep=""),height=8.27,width= 11.69)
  plotAllLm(data, buildData, sosieRateFunction, "sosie rate", function(data) {log(data +1)})
  dev.off()
  pdf(paste(dir, "-SR.pdf",sep=""),height=8.27,width= 11.69)
  plotAllLm(data, buildData, sosieRateFunction, "sosie rate", function(data) {data})
  dev.off()
  
  diffRateFunction <- function(data) {return(data$nbDiff/data$nbSosie)}
  
  pdf(paste(dir, "-group-DR-log.pdf",sep=""),height=8.27,width= 11.69)
  plotAllLm(data, buildData2, diffRateFunction, "diff rate", function(data) {log(data +1)})
  dev.off()
  pdf(paste(dir, "-group-DR.pdf",sep=""),height=8.27,width= 11.69)
  plotAllLm(data, buildData2, diffRateFunction, "diff rate", function(data) {data})
  dev.off()
  
  pdf(paste(dir, "-DR-log.pdf",sep=""),height=8.27,width= 11.69)
  plotAllLm(data, buildData, diffRateFunction, "diff rate", function(data) {log(data +1)})
  dev.off()
  pdf(paste(dir, "-DR.pdf",sep=""),height=8.27,width= 11.69)
  plotAllLm(data, buildData, diffRateFunction, "diff rate", function(data) {data})
  dev.off()
}

plotLmForIndex <- function(index, build, yfunction, ylabel, xfunction) {
  par(mfrow=c(2,3))
  
  plotLm(commons.io_stmt, build, index, 100, yfunction, xfunction, ylabel, "commons io")
  plotLm(commons.codec_stmt, build, index, 100, yfunction, xfunction, ylabel, "commons codec")
  plotLm(commons.lang_stmt, build, index, 100, yfunction, xfunction, ylabel, "commons lang")
  plotLm(commons.collections_stmt, build, index, 100, yfunction, xfunction, ylabel, "commons io")
  plotLm(subset(gson_stmt, gson_stmt$maxDeep < 1000), build ,index, 100, yfunction,xfunction, ylabel, "gson")
#  plotLm(data, build, index, 100, yfunction, xfunction, ylabel, "commons io")
}

writeAllLmIndex <- function(dir) {
  sosieRateCompileFunction <- function(data) {return(data$nbSosie/data$nbCompile)}
  sosieRateFunction <- function(data) {return(data$nbSosie/data$nbTrial)}
  
  for(index in 7:13) {
    pdf(paste(dir, colnames(commons.codec_stmt)[index] , "-SRC.pdf",sep=""),height=8.27,width= 11.69)
    plotLmForIndex(7, buildData,  sosieRateCompileFunction, "sosie rate compile", function(data) {return(data$nbTest)})
    dev.off()
    
    pdf(paste(dir, colnames(commons.codec_stmt)[index] , "-group-SRC.pdf",sep=""),height=8.27,width= 11.69)
    plotLmForIndex(7, buildData2,  sosieRateCompileFunction, "sosie rate compile", function(data) {return(data$nbTest)})
    dev.off()
    
    pdf(paste(dir, colnames(commons.codec_stmt)[index] , "-SR.pdf",sep=""),height=8.27,width= 11.69)
    plotLmForIndex(7, buildData,  sosieRateFunction, "sosie rate", function(data) {return(data$nbTest)})
    dev.off()
    
    pdf(paste(dir, colnames(commons.codec_stmt)[index] , "-group-SR.pdf",sep=""),height=8.27,width= 11.69)
    plotLmForIndex(7, buildData2,  sosieRateFunction, "sosie rate", function(data) {return(data$nbTest)})
    dev.off()
  }
}

writeBarplot <- function(data, file) {
  pdf(file,height=8.27,width= 11.69)
  barplotForTransformation(data)
  dev.off()
}
barplotForTransformation <- function(data) {
  tmp <- buildDataFromTransformation(data,3)
  names <- vector()
  dataVector <- vector()
  for(i in 1:3) {
    names[i] <- tmp[i,"name"]
    dataVector[i] <- tmp[i,"nbSosie"]/tmp[i,"nbCompile"] 
  }
  names[4] <- "add diff"
  dataVector[4] <- tmp["add","nbDiff"]/tmp["add","nbCompile"] 
  barplot(dataVector, names.arg = names, ylab= "sosiefication rate")
}

writeAllbarplot <- function(data, dir) {
  sosieRateFunction <- function(data) {return(data$nbSosie/data$nbTrial)}
  
  pdf(paste(dir, "-barplot-SR-", colnames(data)[3] , ".pdf",sep=""),height=8.27,width= 11.69)
  barplotForIndex(data, 3, sosieRateFunction, "sosie rate")
  dev.off()
  
  pdf(paste(dir, "-barplot-SR-", colnames(data)[17] , ".pdf",sep=""),height=8.27,width= 11.69)
  barplotForIndex(data, 17, sosieRateFunction, "sosie rate")
  dev.off()
  
  pdf(paste(dir, "-barplot-SR-", colnames(data)[18] , ".pdf",sep=""),height=8.27,width= 11.69)
  barplotForIndex(data, 18, sosieRateFunction, "sosie rate")
  dev.off()
}

buildGroup <- function(data, xaxis, xaxisFunction, xaxisSelection, yaxisFunction, groupFunction, nbGroup) {
  size <- xaxisFunction(max(data[,xaxis]))
 
  groupSize <- size/nbGroup
  result <- data.frame()
  for(i in 1:nbGroup) {  
    set <- subset(data, xaxisSelection(xaxisFunction(data[,xaxis]), groupSize * (i - 1), groupSize * i))
    result[i, "group"] <- groupFunction(i, groupSize * (i - 1), groupSize * i)
    result[i, "value"] <- yaxisFunction(set)
  }
  
  return(result)
}

barplotTransformationTypeStmtType <- function(data, index) {
  yfct <- function(data) {return(size(selectSosie(data)) / size(data))}
  ylabel <- "sosie rate"
  tmp <- sort(union(data[,index], data[,index]))
  selectors <- vector()
  i <- 1
  for(s in tmp) {
    if(s !="CtUnaryOperatorImpl" & s != "CtBreakImpl" & s != "CtDoImpl" & s!= "CtSynchronizedImpl" & s != "CtConstructorCallImpl") {
      selectors[i] <- s
      i <- i + 1
    }  
  }
  
  result <- mat <- matrix(nrow = 4, ncol = length(selectors),dimnames = list(c("add", "add-diff", "replace", "delete"), selectors))
  
  count <- 1
  names <- vector()
  for(selector in  selectors) {
    names[count] <- substr(selector, 3,nchar(selector) - 4)
    
    set <- subset(data, data[,index] == selector)
    result[1, count] <- yfct(subset(set, set$name== "add"))
    result[2, count] <- size(selectAllDiff(subset(set, set$name== "add")))/size(subset(set, set$name== "add"))
    result[3, count] <- yfct(subset(set, set$name== "replace"))
    result[4, count] <- yfct(subset(set, set$name== "delete"))
                                 
    count <- count +1                                                              
  } 
  
  barplot(result, beside = TRUE, ylab=ylabel, names.arg = names, col=c("red", "black", "blue", "green"), las=2)
  legend("topright", c("add","add-diff", "replace","delete"), # puts text in the legend
         fill = c("red", "black", "blue", "green")) # gives the legend lines the correct color and width
}

writeBarplotTransformationTypeStmtType <- function(data, dir) {
  
 
  pdf(paste(dir, "-barplot-SR-transformationType-", colnames(data)[17] , ".pdf",sep=""),height=8.27,width= 11.69)
  barplotTransformationTypeStmtType(data, 17)
  dev.off()
  
  pdf(paste(dir, "-barplot-SR-transformationType-", colnames(data)[18] , ".pdf",sep=""),height=8.27,width= 11.69)
  barplotTransformationTypeStmtType(data, 18)
  dev.off()
}

identity <- function(x) {return(x)}

between <- function(value, min, max) {
  if(is.na(value)) {
    return(F)
  }
  return(value > min & value <= max)
}

lowerMax <- function(value, min, max) {
  return(value <= max)
}

sosieficateRate <- function(data) {
  if(size(data) == 0) {
    return(0)
  }
  return(size(selectSosie(data))/size(data))  
}

sosieficateRateCompile <- function(data) {
  if(size(selectCompile(data)) == 0) {
    return(0)
  }
  return(size(selectSosie(data))/size(selectCompile(data)))  
}

computationalDiversityRate <- function(data) {
  if(size(data) == 0) {
    return(0)
  }
  return(size(selectDiff(data))/size(selectSosie(data)))
}

groupIndex <- function(index, min, max) {
  return(index)
}

groupMean <- function(index, min, max) {
  return((min + max)/2)
}

barplotAll <- function(dir) {
  for(i in 11:15) {
    pdf(paste(dir, "barplot-SRC-",colnames(commons.codec)[i], "-25.pdf",sep=""),height=8.27,width= 11.69)
    barplotIndex(sosieficateRateCompile, i, 2, "Sosieficate Rate Compile")
    dev.off()
  }
  
  for(i in 11:15) {
    pdf(paste(dir, "barplot-SRC-",colnames(commons.codec)[i], "-50.pdf",sep=""),height=8.27,width= 11.69)
    barplotIndex(sosieficateRateCompile, i, 3, "Sosieficate Rate Compile")
    dev.off()
  }
  
  for(i in 11:15) {
    pdf(paste(dir, "barplot-SRC-",colnames(commons.codec)[i], "-75.pdf",sep=""),height=8.27,width= 11.69)
    barplotIndex(sosieficateRateCompile, i, 4, "Sosieficate Rate Compile")
    dev.off()
  }
}

barplotIndex <- function(evalFunction, index, q, ylegend) {
  mat <- matrix(nrow = 4, ncol = 2, dimnames = list(c("gson", "codec", "collections","lang"), c("lower", "superior")))
  
  mat[1,1] <- lower(gson, index, evalFunction, q)
  mat[1,2] <- superior(gson, index, evalFunction, q)
  
  mat[2,1] <- lower(commons.codec, index, evalFunction, q)
  mat[2,2] <- superior(commons.codec, index, evalFunction, q)
  
  mat[3,1] <- lower(commons.collections, index, evalFunction, q)
  mat[3,2] <- superior(commons.collections, index, evalFunction, q)
  
  mat[4,1] <- lower(commons.lang, index, evalFunction, q)
  mat[4,2] <- superior(commons.lang, index, evalFunction, q)
  
  barplot(mat, beside = TRUE, col = c("red", "green", "blue", "black"), names.arg = toupper(colnames(mat))
          , xlab =colnames(commons.codec)[index],  ylab = ylegend, legend.text = TRUE)
}

barplotQuantile <- function(evalFunction, index,  ylegend) {
  mat <- matrix(nrow = 5, ncol = 4, dimnames = list(c("gson", "codec", "collections","lang", "io"), c("25%", "50%", "70%", "100%")))
  
  mat[1,1] <- lower(gson, index, evalFunction, 2)
  mat[1,2] <- lower(gson, index, evalFunction, 3)
  mat[1,3] <- lower(gson, index, evalFunction, 4)
  mat[1,4] <- evalFunction(gson)
  
  mat[2,1] <- lower(commons.codec, index, evalFunction, 2)
  mat[2,2] <- lower(commons.codec, index, evalFunction, 3)
  mat[2,3] <- lower(commons.codec, index, evalFunction, 4)
  mat[2,4] <- evalFunction(commons.codec)
  
  mat[3,1] <- lower(commons.collections, index, evalFunction, 2)
  mat[3,2] <- lower(commons.collections, index, evalFunction, 3)
  mat[3,3] <- lower(commons.collections, index, evalFunction, 4)
  mat[3,4] <- evalFunction(commons.collections)
  
  mat[4,1] <- lower(commons.lang, index, evalFunction, 2)
  mat[4,2] <- lower(commons.lang, index, evalFunction, 3)
  mat[4,3] <- lower(commons.lang, index, evalFunction, 4)
  mat[4,4] <- evalFunction(commons.lang)
  
  mat[5,1] <- lower(commons.io, index, evalFunction, 2)
  mat[5,2] <- lower(commons.io, index, evalFunction, 3)
  mat[5,3] <- lower(commons.io, index, evalFunction, 4)
  mat[5,4] <- evalFunction(commons.io)
  
  barplot(mat, beside = TRUE, col = c("red", "green", "blue", "black", "bisque"), names.arg = toupper(colnames(mat))
          , xlab =colnames(commons.codec)[index],  ylab = ylegend, legend.text = TRUE)
}


lower <- function(data, index, evalFunction, q) {
  max <- quantile(data[,index])[[q]]
  return(evalFunction(subset(data, data[,index] < max)))
}

superior <- function(data, index, evalFunction, q) {
  max <- quantile(data[,index])[[q]]
  return(evalFunction(subset(data, data[,index] >= max)))
}

barplotData <- function() {
  
  result <- barplotDataPtivate(commons.codec, "codec")
  result <- cbind(result, barplotDataPtivate(commons.lang, "lang"))
  result <- cbind(result, barplotDataPtivate(commons.collections, "collections"))
  result <- cbind(result, barplotDataPtivate(gson, "gson"))
  result <- cbind(result, barplotDataPtivate(commons.io, "io"))
  
  return(result)
}

barplotDataPtivate <- function(data, name) {
  result <- data.frame()
  
  result["trial", name] <- size(data)
  result["compile",  name] <- size(selectCompile(data))
  result["sosie", name] <- size(selectSosie(data))
  result["SRlower25", name] <- lower(data, 11, sosieficateRate, 2)
  result["SRlower50",  name] <- lower(data, 11, sosieficateRate, 3)
  result["SRlower75", name] <- lower(data, 11, sosieficateRate, 2)
  result["SRlower100",  name] <- sosieficateRate(data)
  result["SRClower25", name] <- lower(data, 11, sosieficateRateCompile, 2)
  result["SRClower50",  name] <- lower(data, 11, sosieficateRateCompile, 3)
  result["SRClower75",name] <- lower(data, 11, sosieficateRateCompile, 2)
  result["SRClower100",  name] <- sosieficateRateCompile(data)

  return(result)
}