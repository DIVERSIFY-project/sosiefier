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

diversiticationStat <- function(data, index) {
  result <- data.frame ();
  for(i in set(data[,index])) {
    sub <- subset(data, data[,index] == i);
    trial <- nbOfTrial(sub)
    sosie <-  nbOfSosie(sub);
    compile <- nbOfCompile(sub);  
    result[paste(i,sep=""),"trial"] <- trial;
  
    result[paste(i,sep=""),"compile"] <- compile;
    result[paste(i,sep=""),"% compile"] <- 100*compile/(trial);
    result[paste(i,sep=""),"sosie"] <- sosie;
    result[paste(i,sep=""),"% sosie"] <- 100*sosie/(trial);
    result[paste(i,sep=""),"candidate"] <- sum(sub$candidate)/length(sub$candidate);
  }
  sosie <-  nbOfSosie(data);
  trial <- nbOfTrial(data)
  compile <- nbOfCompile(data); 
  

  result["all","trial"] <- trial;
  result["all","compile"] <- compile;
  result["all","% compile"] <- 100*compile/(trial);
  result["all","sosie"] <- sosie;
  result["all","% sosie"]  <- 100*sosie/(trial);
  result["all","candidate"] <- sum(data$candidate)/length(data$candidate);
  # result["all","% total"] <- 100*(fail + good)/nbOfDiversification(data);
  return(result)  
}

mySample <- function(data, size) {
  return(data[sample(1:nrow(data),size, replace=FALSE),])
}

splitAndWrite <- function(data, splitSize, fileName) {
  for(i in 0:nrow(data)/splitSize) {
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