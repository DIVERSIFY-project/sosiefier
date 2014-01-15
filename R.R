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
#compileTime et testTime pour 100 execution
diversiticationStat <- function(data, index, compileTime, testTime) {
  result <- data.frame ();
  for(i in set(data[,index])) {
    sub <- subset(data, data[,index] == i);
    subStmt <-  subset(sub, sub[,"level"] == "statement");
    subBlock <-  subset(sub, sub[,"level"] == "block");
    trialStmt <- nbOfTrial(subStmt)
    sosieStmt <-  nbOfSosie(subStmt);
    compileStmt <- nbOfCompile(subStmt);
    trialBlock <- nbOfTrial(subBlock)
    sosieBlock <-  nbOfSosie(subBlock);
    compileBlock <- nbOfCompile(subBlock);
    
    result[paste(i,sep=""),"trial (stmt)"] <- paste(trialStmt, sep="");
    result[paste(i,sep=""),"trial (block)"] <- paste(trialBlock, sep="");
    
    result[paste(i,sep=""),"compile (stmt)"] <- paste(compileStmt, sep=" ");
    result[paste(i,sep=""),"% compile (stmt)"] <- paste(round(100*compileStmt/(trialStmt),2), sep="");
    result[paste(i,sep=""),"compile (block)"] <- paste(compileBlock, sep="");
    result[paste(i,sep=""),"% compile (block)"] <- paste(round(100*compileBlock/(trialBlock),2), sep="");
    
    result[paste(i,sep=""),"sosie (stmt)"] <- paste(sosieStmt, sep="");
    result[paste(i,sep=""),"% sosie (stmt)"] <- paste(round(100*sosieStmt/(trialStmt),2), sep="");
    result[paste(i,sep=""),"sosie (block)"] <- paste(sosieBlock, sep="");
    result[paste(i,sep=""),"% sosie (block)"] <- paste(round(100*sosieBlock/(trialBlock),2), sep="");
    
    result[paste(i,sep=""),"candidate (stmt)"] <- paste(round(sum(as.numeric(subStmt$candidate))/length(subStmt$candidate),2),sep="");
    result[paste(i,sep=""),"candidate (block)"] <- paste(round(sum(as.numeric(subBlock$candidate))/length(subBlock$candidate),2), sep="");
    result[paste(i,sep=""),"sosie/h (stmt)"] <- paste(round(sosieHour(compileTime, testTime, 100*compileStmt/trialStmt, 100*sosieStmt/trialStmt),2),sep="");
    result[paste(i,sep=""),"sosie/h (block)"] <- paste(round(sosieHour(compileTime, testTime, 100*compileBlock/trialBlock, 100*sosieBlock/trialBlock),2),sep=""); 
  }
  subStmt <-  subset(data, data[,"level"] == "statement");
  subBlock <-  subset(data, data[,"level"] == "block");
  trialStmt <- nbOfTrial(subStmt)
  sosieStmt <-  nbOfSosie(subStmt);
  compileStmt <- nbOfCompile(subStmt);
  trialBlock <- nbOfTrial(subBlock)
  sosieBlock <-  nbOfSosie(subBlock);
  compileBlock <- nbOfCompile(subBlock);
  
  result["all","trial (stmt)"] <- paste(trialStmt, sep="");
  result["all","trial (block)"] <- paste(trialBlock, sep="");
  
  result["all","compile (stmt)"] <- paste(compileStmt, sep="");
  result["all","% compile (stmt)"] <- paste(round(100*compileStmt/(trialStmt),2), sep="");
  result["all","compile (block)"] <- paste(compileBlock, sep=""); 
  result["all","% compile (block)"] <- paste(round(100*compileBlock/(trialBlock),2), sep="");
  
  result["all","sosie (stmt)"] <- paste(sosieStmt, sep="");
  result["all","% sosie (stmt)"] <- paste(round(100*sosieStmt/(trialStmt),2), sep="");
  result["all","sosie (block)"] <- paste(sosieBlock, sep=""); 
  result["all","% sosie (block)"] <- paste(round(100*sosieBlock/(trialBlock),2), sep="");
  
  result["all","candidate (stmt)"] <- paste(round(sum(subStmt$candidate)/length(subStmt$candidate),2),sep="");
  result["all","candidate (block)"] <- paste(round(sum(subBlock$candidate)/length(subBlock$candidate),2), sep="");
  result["all","sosie h (stmt)"] <- paste(round(sosieHour(compileTime, testTime, 100*compileStmt/trialStmt, 100*sosieStmt/trialStmt),2),sep="");
  result["all","sosie h (block)"] <- paste(round(sosieHour(compileTime, testTime, 100*compileBlock/trialBlock, 100*sosieBlock/trialBlock),2),sep=""); 
  return(result)  
}

#compileTime et testTime pour 100 execution
diversiticationStat2 <- function(data, compileTime, testTime) {
  result <- data.frame ();
  for(i in allType()) {
    sub <- subset(data, data[,"type"] == i);
    subStmt <-  subset(sub, sub[,"level"] == "statement");
    subBlock <-  subset(sub, sub[,"level"] == "block");
    trialStmt <- nbOfTrial(subStmt)
    sosieStmt <-  nbOfSosie(subStmt);
    compileStmt <- nbOfCompile(subStmt);
    trialBlock <- nbOfTrial(subBlock)
    sosieBlock <-  nbOfSosie(subBlock);
    compileBlock <- nbOfCompile(subBlock);
    
    result[paste(i,sep=""),"trial (stmt)"] <- paste(trialStmt, sep="");
    result[paste(i,sep=""),"trial (block)"] <- paste(trialBlock, sep="");
    
    p <- round(100*compileStmt/trialStmt,1)
    result[paste(i,sep=""),"compile (stmt)"] <- paste(compileStmt," (",p,"%)", sep="");
    p <- round(100*compileBlock/trialBlock,1)
    result[paste(i,sep=""),"compile (block)"] <- paste(compileBlock," (",p,"%)", sep="");
    
    p <- round(100*sosieStmt/(trialStmt),1)
    result[paste(i,sep=""),"sosie (stmt)"] <- paste(sosieStmt," (",p,"%)", sep="");
    p <- round(100*sosieBlock/(trialBlock),1) 
    result[paste(i,sep=""),"sosie (block)"] <- paste(sosieBlock," (",p,"%)", sep="");
   
    result[paste(i,sep=""),"candidate (stmt)"] <- paste(round(sum(as.numeric(subStmt$candidate))/length(subStmt$candidate),1),sep="");
    result[paste(i,sep=""),"candidate (block)"] <- paste(round(sum(as.numeric(subBlock$candidate))/length(subBlock$candidate),1), sep="");
    result[paste(i,sep=""),"sosie/h (stmt)"] <- paste(round(sosieHour(compileTime, testTime, 100*compileStmt/trialStmt, 100*sosieStmt/trialStmt),1),sep="");
    result[paste(i,sep=""),"sosie/h (block)"] <- paste(round(sosieHour(compileTime, testTime, 100*compileBlock/trialBlock, 100*sosieBlock/trialBlock),1),sep=""); 
  }
  subStmt <-  subset(data, data[,"level"] == "statement");
  subBlock <-  subset(data, data[,"level"] == "block");
  trialStmt <- nbOfTrial(subStmt)
  sosieStmt <-  nbOfSosie(subStmt);
  compileStmt <- nbOfCompile(subStmt);
  trialBlock <- nbOfTrial(subBlock)
  sosieBlock <-  nbOfSosie(subBlock);
  compileBlock <- nbOfCompile(subBlock);
  
  result["all","trial (stmt)"] <- paste(trialStmt, sep="");
  result["all","trial (block)"] <- paste(trialBlock, sep="");
  
  p <- round(100*compileStmt/trialStmt,1)
  result["all","compile (stmt)"] <- paste(compileStmt," (",p,"%)", sep="");
  p <- round(100*compileBlock/trialBlock,1)
  result["all","compile (block)"] <- paste(compileBlock," (",p,"%)", sep="");
  
  p <- round(100*sosieStmt/(trialStmt),1)
  result["all","sosie (stmt)"] <- paste(sosieStmt," (",p,"%)", sep="");
  p <- round(100*sosieBlock/(trialBlock),1) 
  result["all","sosie (block)"] <- paste(sosieBlock," (",p,"%)", sep="");
  
  result["all","candidate (stmt)"] <- paste(round(sum(as.numeric(subStmt$candidate))/length(subStmt$candidate),1),sep="");
  result["all","candidate (block)"] <- paste(round(sum(as.numeric(subBlock$candidate))/length(subBlock$candidate),1), sep="");
  result["all","sosie/h (stmt)"] <- paste(round(sosieHour(compileTime, testTime, 100*compileStmt/trialStmt, 100*sosieStmt/trialStmt),1),sep="");
  result["all","sosie/h (block)"] <- paste(round(sosieHour(compileTime, testTime, 100*compileBlock/trialBlock, 100*sosieBlock/trialBlock),1),sep=""); 
  return(result)  
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

mySample <- function(data, size) {
  return(data[sample(1:nrow(data),size, replace=FALSE),])
}

splitAndWrite <- function(data, splitSize, fileName) {
  borne <- nrow(data)/splitSize
  for(i in 0:borne) {
    subSet <- junit[(i*splitSize):((i+1)*splitSize),]
    fileName2 <- paste(sep="",fileName,i,".csv")
    write.csv2(subSet, file=fileName2)
  }
  
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

displayResult <- function() {
cat('all:\n\ttrial: ')
cat(nbOfDiversification(tReplace) + nbOfDiversification(tAdd) + nbOfDiversification(tDelete))
cat('\n\tincorrect-variants: ')
cat(nbOfFailDiversification(tReplace) + nbOfFailDiversification(tAdd) + nbOfFailDiversification(tDelete))
cat('\n\tsosies: ')
cat(nbOfGoodDiversification(tReplace) + nbOfGoodDiversification(tAdd) + nbOfGoodDiversification(tDelete))

cat('\nreplace:\n\ttrial: ')
cat(nbOfDiversification(tReplace))
cat('\n\tincorrect-variants: ')
cat(nbOfFailDiversification(tReplace))
cat('\n\tsosies: ')
cat(nbOfGoodDiversification(tReplace))

cat('\nadd:\n\ttrial: ')
cat(nbOfDiversification(tAdd))
cat('\n\tincorrect-variants: ')
cat(nbOfFailDiversification(tAdd))
cat('\n\tsosies: ')
cat(nbOfGoodDiversification(tAdd))

cat('\ndelete:\n\ttrial: ')
cat(nbOfDiversification(tDelete))
cat('\n\tincorrect-variants: ')
cat(nbOfFailDiversification(tDelete))
cat('\n\tsosies: ')
cat(nbOfGoodDiversification(tDelete))
} 

displayDetailResult <- function() {
  cat('replace:\n')
  tab <- diversiticationStat(tReplace, "toReplaceSuperType")
  print(xtable(tab),floating=FALSE) 
  
  cat('\nadd:\n')
  tab <- diversiticationStat(tAdd, "positionSuperType")
  print(xtable(tab),floating=FALSE) 
  
  cat('\ndelete:\n')
  tab <- diversiticationStat(tDelete, "deleteSuperType")
  print(xtable(tab),floating=FALSE) 
}