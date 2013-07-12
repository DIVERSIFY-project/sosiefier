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
    result[paste(i,sep=""),"good"] <- good;
    result[paste(i,sep=""),"fail"] <- fail;
    result[paste(i,sep=""),"% good"] <- 100*good/(fail + good);
    result[paste(i,sep=""),"% total"] <- 100*(fail + good)/nbOfDiversification(data);
  } 
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