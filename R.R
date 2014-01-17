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
diversiticationStat2 <- function(data, compileTime, testTime, nbStmt, tested) {
  result <- data.frame ();
 
  for(i in allType()) {
    sub <- subset(data, data[,"type"] == i);
    trial <- nbOfTrial(sub)
    sosie <-  nbOfSosie(sub);
    compile <- nbOfCompile(sub);
   
 
    result[paste(i,sep=""),"#tested statements"] <- paste(tested ," (",round((tested/nbStmt)*100,1),"%)",sep="")
    result[paste(i,sep=""),"trial"] <- paste(trial, sep="");
   
    
    p <- round(100*compile/trial,1)
    result[paste(i,sep=""),"compile"] <- paste(compile," (",p,"%)", sep="");
   
    
    p <- round(100*sosie/(trial),1)
    result[paste(i,sep=""),"sosie"] <- paste(sosie," (",p,"%)", sep="");
  
    candidate <- sum(as.numeric(sub$candidate))/length(sub$candidate)
    result[paste(i,sep=""),"%tested candidate transformations"] <- paste(round(perTranformationTested(trial, nbStmt, candidate) ,2),"%",sep="")
    result[paste(i,sep=""),"candidate"] <- paste(round(sum(as.numeric(sub$candidate))/length(sub$candidate),1),sep="");
    sosieH <- sosieHour(compileTime, testTime, 100*compile/trial, 100*sosie/trial)
    result[paste(i,sep=""),"sosie/h"] <- paste(round(sosieH,1),sep="");
    result[paste(i,sep=""),"time"] <- paste(round(totalTime(compileTime, testTime, trial,compile),1),sep="");
    
    
  }
  return(result)  
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
  return(subset(data, data[,"type"] == "notContextAdd" || data[,"type"] == "notContextReplace" || data[,"type"] == "delete"))
}

tm <- function(data) {
  return(subset(data, data[,"type"] == "notMappingVariableAdd" || data[,"type"] == "notMappingVariableReplace" || data[,"type"] == "delete"))
}

vm <- function(data) {
  return(subset(data, data[,"type"] == "notContextMappingVariableNameAdd" || data[,"type"] == "notContextMappingVariableNameReplace" || data[,"type"] == "delete")) 
}

rm <- function(data) {
  return(subset(data, data[,"type"] == "replace" || data[,"type"] == "add" || data[,"type"] == "delete")) 
}

#compileTime et testTime pour 100 execution
otherStat <- function(data) {
  result <- data.frame ();
  
    add <- subset(data, data[,"type"] == "add")
   add1 <- subset(data, data[,"type"] == "notContextMappingVariableNameAdd")
    add2 <- subset(data, data[,"type"] == "notMappingVariableAdd")
    add3 <- subset(data, data[,"type"] == "notContextAdd")
   replace <- subset(data, data[,"type"] == "replace")
  replace1 <- subset(data, data[,"type"] == "notContextMappingVariableNameReplace")
  replace2 <- subset(data, data[,"type"] == "notMappingVariableReplace")
  replace3 <- subset(data, data[,"type"] == "notContextReplace")
  delete <- subset(data, data[,"type"] == "delete")

  trial <- nbOfTrial(delete)+ nbOfTrial(add3)+ nbOfTrial(replace3)
  compile  <- nbOfCompile(delete)+nbOfCompile(add3)+nbOfCompile(replace3) 
  sosie <-  nbOfSosie(delete)+ nbOfSosie(add3)+ nbOfSosie(replace3)  
  result["rand", "trial"] <- trial
  result["rand", "compile"] <- compile
  result["rand", "compile%"] <- round(100*compile/trial,1)
  result["rand", "sosie"] <- sosie
  result["rand", "sosie%"] <- round(100*sosie/trial,1)
  
  trial <- nbOfTrial(delete)+ nbOfTrial(add1)+ nbOfTrial(replace1)
  compile  <- nbOfCompile(delete)+nbOfCompile(add1)+nbOfCompile(replace1) 
  sosie <-  nbOfSosie(delete)+ nbOfSosie(add1)+ nbOfSosie(replace1)  
  result["MnR", "trial"] <- trial
  result["MnR", "compile"] <- compile
  result["MnR", "compile%"] <- round(100*compile/trial,1)
  result["MnR", "sosie"] <- sosie
  result["MnR", "sosie%"] <- round(100*sosie/trial,1)
  
  trial <- nbOfTrial(delete)+ nbOfTrial(add2)+ nbOfTrial(replace2)
  compile  <- nbOfCompile(delete)+nbOfCompile(add2)+nbOfCompile(replace2) 
  sosie <-  nbOfSosie(delete)+ nbOfSosie(add2)+ nbOfSosie(replace2)  
  result["RnM", "trial"] <- trial
  result["RnM", "compile"] <- compile
  result["RnM", "compile%"] <- round(100*compile/trial,1)
  result["RnM", "sosie"] <- sosie
  result["RnM", "sosie%"] <- round(100*sosie/trial,1)
  
  trial <- nbOfTrial(delete)+ nbOfTrial(add)+ nbOfTrial(replace)
  compile  <- nbOfCompile(delete)+nbOfCompile(add)+nbOfCompile(replace) 
  sosie <-  nbOfSosie(delete)+ nbOfSosie(add)+ nbOfSosie(replace)  
  result["MR", "trial"] <- trial
  result["MR", "compile"] <- compile
  result["MR", "compile%"] <- round(100*compile/trial,1)
  result["MR", "sosie"] <- sosie
  result["MR", "sosie%"] <- round(100*sosie/trial,1)
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