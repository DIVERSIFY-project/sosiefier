nbOfSosie <- function(data) {
  return(length(subset(data, sosie == 'true')$sosie))  
}

nbOfCompile <- function(data) {
  return(length(subset(data, compile == 'true')$compile))   
}

nbOfTrial <- function(data) {
  return(length(data$sosie)) 
}

chiTestTab <- function(data, index) {
  result <- data.frame ();
  for(i in set(data[,index])) {
    sub <- subset(data, data[,index] == i);
    result["good",paste(i,sep="")] <- nbOfGoodDiversification(sub);
    result["fail",paste(i,sep="")] <- nbOfFailDiversification(sub);
  } 
  return(result)  
}

chiTestTab2 <- function(data, index1, index2) {
  result <- data.frame ();
  count <- 0;
  for(i in set(data[,index1])) {
    for(j in set(data[,index2])) {
      sub <- subset(data, (data[,index1] == i) & (data[,index2] == j));
     
      result["good",paste(i,j,sep="/")] <- nbOfGoodDiversification(sub);
      result["fail",paste(i,j,sep="/")] <- nbOfFailDiversification(sub); 
    }
  }
  return(result)  
}

candidate <- function(data) {
  sum <- 0
  count <- 1
  vec <-vector()
  
  for (i in 1:length(data$type)) {
    key <- paste(data[i,"type"],data[i,"class"],data[i,"method"],data[i,"line"], sep="_")

    if(!(key %in% vec)) {
      sum <- sum + data[i,"candidate"]
      vec[count] <- key
      count <- count + 1
    }
  
  }
  return(sum)
}

nbStmtTested <- function(data) {
  count <- 1
  vec <-vector()
  tested <- 0
  for (i in 1:length(data$type)) {
    key <- paste(data[i,"type"],data[i,"class"],data[i,"method"],data[i,"line"], sep="_")
    
    if(!(key %in% vec)) {
      vec[count] <- key
      count <- count + 1
      tested <- tested + 1
    } 
  }
  return(tested)
}

diversifivationSet <- function(array) {
  result <- data.frame()
  count <- 1
  vec <-vector()
  for (i in 1:length(array$type)) {
    key <- paste(array[i,"type"],array[i,"class"],array[i,"method"],array[i,"line"], sep="_")
    key <- paste(key, array[i,"classReplaceOrAdd"], array[i,"methodReplaceOrAdd"], array[i,"lineReplaceOrAdd"], sep="_")
    if(!(key %in% vec) ) {
      print(count)
      result <- rbind(result, array[i,]) 
      vec[count] <- key
      count <- count + 1
    }
  }
    
    return(result)
}

#compileTime et testTime pour 100 execution
diversiticationStatLine <- function(data, name, result, compileTime, testTime, nbStmt, tested) {
    trial <- nbOfTrial(data)
    sosie <-  nbOfSosie(data);
    compile <- nbOfCompile(data);
    
  #  result[name,"#transformable statements"] <- paste(nbStmt,sep="")  
    result[name,"#tested statements"] <- paste(tested ," (",round((tested/nbStmt)*100,0),"%)",sep="")  
    candidate <- candidate(data)
    result[name,"candidate"] <- paste(candidate,sep="");
    
    testedCandidiate <- round((trial/candidate)*100,0)
    result[name,"trial"] <- paste(trial," (",testedCandidiate,"%)", sep="");
    
    p <- round(100*compile/trial,0)
    result[name,"compile"] <- paste(compile," (",p,"%)", sep="");
    
    pTrial <- round(100*sosie/(trial),0)
    pSosie <- round(100*sosie/(compile),0)
    result[name,"sosie"] <- paste(sosie, sep=""); 
  result[name,"pTrial"] <- paste(pTrial, sep=""); 
    
    sosieH <- sosieHour(compileTime, testTime, 100*compile/trial, 100*sosie/trial)
    result[name,"sosie/h"] <- paste(round(sosieH,1),sep="");
    result[name,"time"] <- paste(round(totalTime(compileTime, testTime, trial,compile),1),sep="");
    
    return(result)
}

#compileTime et testTime pour 100 execution
diversiticationStat3 <- function(data, compileTime, testTime, nbStmt, tested) {
  result <- data.frame ();
  
  for(i in allType()) {
    sub <- subset(data, data[,"type"] == i);
    result <- diversiticationStatLine(sub,i,result, compileTime, testTime, nbStmt, tested)
  }
  return(result)  
}

#diversiticationStatAll(all, 0,0, 2914+2042+674+1471+9893+11715+47065 ,782+1957+85+473+1802+3829+1275)
diversiticationStatAll <- function(data, compileTime, testTime, nbStmt, tested) {
  result <- data.frame();
  
  result <- diversiticationStatLine(rand(data), "rand",result, compileTime, testTime, nbStmt, tested)
  result <- diversiticationStatLine(tm(data), "tm",result, compileTime, testTime, nbStmt, tested)
  result <- diversiticationStatLine(vm(data), "vm",result, compileTime, testTime, nbStmt, tested)
  result <- diversiticationStatLine(rm(data), "rm",result, compileTime, testTime, nbStmt, tested)
  result <- diversiticationStatLine(data, "all",result, compileTime, testTime, nbStmt, tested)
    
  return(result)  
}

densityGain <- function(data) {
  addS <- subset(data, data[,"type"] == "add");
  replaceS <- subset(data, data[,"type"] == "replace");
  steroid <- subset(data, data[,"type"] == "add" | data[,"type"] == "replace");
  
  addR <- subset(data, data[,"type"] == "notContextAdd");
  replaceR <- subset(data, data[,"type"] == "notContextReplace");
  rand <- subset(data, data[,"type"] == "notContextAdd" | data[,"type"] == "notContextReplace");
  
  print(round(densityGainP(addS, addR),2))
  print(round(densityGainP(replaceS, replaceR),2))
  print(round(densityGainP(steroid, rand),2))
}

densityGainP <- function(steroid, rand) {

  pS <- (100* nbOfSosie(steroid)/nbOfTrial(steroid))
  pR <- (100* nbOfSosie(rand)/nbOfTrial(rand))
  return(pS/pR)
}


perTranformationTested <- function(trial,nbStmt, candidate) {
  return(trial/(nbStmt*candidate)*100)
}

allType <- function() {
  type <- vector()
  type[1] <- "add"
  type[2] <- "notContextMappingVariableNameAdd"
  type[3] <- "notMappingVariableAdd"
  type[4] <- "notContextAdd"
  type[5] <- "replace"
  type[6] <- "notContextMappingVariableNameReplace"
  type[7] <- "notMappingVariableReplace"
  type[8] <- "notContextReplace"
  type[9] <- "delete"
  return(type)
}

sosieHour <- function(compileTime, testTime, perCompile, perSosie) {
  return((3600/((100 - perCompile) * compileTime + perCompile * testTime)) * 100 * perSosie) 
}

totalTime <- function(compileTime, testTime, nbTrial, nbCompile) {
  return((nbCompile * testTime/100 + (nbTrial - nbCompile) * compileTime/100)/3600)
  }

arrayFctRA <- function(data) {
  result <- vector()
  
  for(i in set(data[,"inputContextSizeRA"])) {
    sub <- subset(data, data[,"inputContextSizeRA"] == i);
    trial <- nbOfTrial(sub)
    sosie <-  nbOfSosie(sub);
    compile <- nbOfCompile(sub);
    result[i] <- 100*sosie/(trial)
  }
  return(result)
}

rand <- function(data) {
  return(subset(data, data[,"type"] == "notContextAdd" | data[,"type"] == "notContextReplace" | data[,"type"] == "delete"))
}
tm <- function(data) {
  return(subset(data, data[,"type"] == "notMappingVariableAdd" | data[,"type"] == "notMappingVariableReplace" | data[,"type"] == "delete"))
}
vm <- function(data) {
  return(subset(data, data[,"type"] == "notContextMappingVariableNameAdd" | data[,"type"] == "notContextMappingVariableNameReplace" | data[,"type"] == "delete")) 
}
rm <- function(data) {
  return(subset(data, data[,"type"] == "replace" | data[,"type"] == "add" | data[,"type"] == "delete")) 
}

#print(xtable(diversiticationStat3(easymock,398, 737, 1441, 943)),floating=FALSE)
#print(xtable(diversiticationStat3(junit,485, 1441, 1654, 669)),floating=FALSE)
#print(xtable(diversiticationStat3(collections,738, 2238, 5027, 1668)),floating=FALSE)
#print(xtable(diversiticationStat3(metrics,471, 767, 908, 319)),floating=FALSE)
#print(xtable(diversiticationStat3(math,921, 14420, 12966, 1263)),floating=FALSE)
#print(xtable(diversiticationStat3(lang, 6.3*100, 24.3*100,4432,  686)),floating=FALSE)
#print(xtable(diversiticationStat3(dagger,517, 1120, 95, 85)),floating=FALSE)
#print(xtable(diversiticationStat3(clojure,10510,18500, 12259,1701)),floating=FALSE)
#print(xtable(diversiticationStat3(jbehave, 500,2290,3405,2798)),floating=FALSE)

#compileTime et testTime pour 100 execution
otherStat <- function(data) {
  result <- data.frame ();

  randtrial <- nbOfTrial(rand(data))
  randcompile  <- nbOfCompile(rand(data)) 
  randsosie <-  nbOfSosie(rand(data))  
  result["rand", "trial"] <- randtrial
  result["rand", "compile"] <- randcompile
  result["rand", "%compile"] <- round(100*randcompile/randtrial,1)
  result["rand", "%compile gain"] <- "0"
  result["rand", "sosie"] <- randsosie
  result["rand", "%sosie"] <- round(100*randsosie/randtrial,1)
  result["rand", "%sosie gain"] <- "0"
  
  trial <- nbOfTrial(tm(data))
  compile  <- nbOfCompile(tm(data)) 
  sosie <-  nbOfSosie(tm(data))  
  result["MnR", "trial"] <- trial
  result["MnR", "compile"] <- compile
  result["MnR", "%compile"] <- round(100*compile/trial,1)
  result["MnR", "%compile gain"] <- round((100*compile/trial) - (100*randcompile/randtrial),1)
  result["MnR", "sosie"] <- sosie
  result["MnR", "%sosie"] <- round(100*sosie/trial,1)
  result["MnR", "%sosie gain"] <- round((100*sosie/trial) - (100*randsosie/randtrial),1)
  
  trial <- nbOfTrial(vm(data))
  compile  <- nbOfCompile(vm(data)) 
  sosie <-  nbOfSosie(vm(data))  
  result["RnM", "trial"] <- trial
  result["RnM", "compile"] <- compile
  result["RnM", "%compile"] <- round(100*compile/trial,1)
  result["RnM", "%compile gain"] <- round((100*compile/trial) - (100*randcompile/randtrial),1)
  result["RnM", "sosie"] <- sosie
  result["RnM", "%sosie"] <- round(100*sosie/trial,1)
  result["RnM", "%sosie gain"] <- round((100*sosie/trial) - (100*randsosie/randtrial),1)
  
  trial <- nbOfTrial(rm(data))
  compile  <- nbOfCompile(rm(data)) 
  sosie <-  nbOfSosie(rm(data))  
  result["MR", "trial"] <- trial
  result["MR", "compile"] <- compile
  result["MR", "%compile"] <- round(100*compile/trial,1)
  result["MR", "%compile gain"] <- round((100*compile/trial) - (100*randcompile/randtrial),1)
  result["MR", "sosie"] <- sosie
  result["MR", "%sosie"] <- round(100*sosie/trial,1)
  result["MR", "%sosie gain"] <- round((100*sosie/trial) - (100*randsosie/randtrial),1)
  return(result)  
}

traceStat <-function(dataTrace) {
  result <- data.frame ();
  size <- length(dataTrace$diffVar)
  result[1,"#sosie"] <- size
  
  tmp <- length(subset(dataTrace, dataTrace$callSequenceDiff > 23 | dataTrace$varSequenceDiff != 0)$diffVar)
  result[1,"diversity"] <- paste(tmp, " (",round(100*tmp/size,2), "%)", sep="") 
  
  tmp <- length(subset(dataTrace, dataTrace$callSequenceDiff > 23)$diffVar)
  result[1,"call diversity"] <- paste(tmp, " (",round(100*tmp/size,2), "%)", sep="")  
 
  tmp <- length(subset(dataTrace, dataTrace$varSequenceDiff != 0)$diffVar) 
  result[1," var diversity"] <-  paste(tmp, " (",round(100*tmp/size,2), "%)", sep="")  
  

  set <- subset(dataTrace, dataTrace$callSequenceDiff > 23)
  result[1,"call trace diversity"] <- round(sum(set$callSequenceDiff - 23)/length(set$diffVar),2)
  
  set <- subset(dataTrace, dataTrace$varSequenceDiff != 0)
  result[1,"var trace traceStat"] <- round(sum(set$varSequenceDiff)/length(set$diffVar),2)
  
 # set <- subset(dataTrace, dataTrace$varSequenceDiff != 0)
#  result[1,"diffUniqueVar"] <- round(sum(set$diffUniqueVar)/length(set$diffVar),2)
  
  return(result)
}

set <- function(collection) {
  vec <- vector()
  count <- 1;
  for(i in collection) {
    if(!(i %in% vec)) {
      vec[count] <- i;
      count <- count + 1;
    }
  }
  return(sort(vec))
}



forest <- function(diversification) {
  testNotFail <- diversification$failure == 0;
  fit <- randomForest(testNotFail ~ replacedByType + toReplaceType + replacedByPackage
              + toReplacePackage + replacedBySize + toReplaceSize + toReplaceInputContextSize 
              + replacedByInputContextSize, data=diversification);
  
  return(fit)
}

loadAllResult <- function(dir) {
  
 # tAll <<- read.csv2(paste(sep="", dir, "_all_diversification_detail.csv"))
  tReplace <<- read.csv2(paste(sep="", dir, "_replace_all_diversification_detail.csv"))
  tAdd <<- read.csv2(paste(sep="", dir, "_add_all_diversification_detail.csv"))
  tDelete <<- read.csv2(paste(sep="", dir, "_delete_all_diversification_detail.csv"))
}
