nbOfGoodDiversification <- function(data) {
  return(length(subset(data, failure == 0)$failure))  
}

nbOfFailDiversification <- function(data) {
  return(length(subset(data, failure != 0)$failure))   
}

nbOfDiversification <- function(data) {
  return(length(data$failure)) 
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
    good <-  nbOfGoodDiversification(sub);
    fail <- nbOfFailDiversification(sub);  
    result[paste(i,sep=""),"trial"] <- good + fail;
  
    result[paste(i,sep=""),"incorrect"] <- fail;
    result[paste(i,sep=""),"sosie"] <- good;
    result[paste(i,sep=""),"% sosie"] <- 100*good/(fail + good);
 #   result[paste(i,sep=""),"% total"] <- 100*(fail + good)/nbOfDiversification(data);
  }
  good <-  nbOfGoodDiversification(data);
  fail <- nbOfFailDiversification(data); 

  result["all","incorrect"] <- fail;
  result["all","trial"] <- good + fail;
  result["all","% sosie"] <- 100*good/(fail + good);
  # result["all","% total"] <- 100*(fail + good)/nbOfDiversification(data);
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