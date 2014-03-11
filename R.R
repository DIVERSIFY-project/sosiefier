nbOfSosie <- function(data) {
  return(length(subset(data, status == 0)$status))  
}

nbOfCompile <- function(data) {
  return(length(subset(data, status >= -1)$status))   
}

nbOfTrial <- function(data) {
  return(length(data$status)) 
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

chiTestTab <- function(data, index) {
  result <- data.frame ();
  for(i in set(data[,index])) {
    sub <- subset(data, data[,index] == i);
    if(nbOfTrial(sub) != 0) {
      result[paste(i,sep=""),"trial"] <- nbOfTrial(sub);
      result[paste(i,sep=""),"compile"] <- nbOfCompile(sub);
      result[paste(i,sep=""),"compile%"] <- round(100*nbOfCompile(sub)/nbOfTrial(sub),2);
      result[paste(i,sep=""),"sosie"] <- nbOfSosie(sub);
      result[paste(i,sep=""),"sosie%"] <- round(100*nbOfSosie(sub)/nbOfTrial(sub),2);
  }
  } 
  return(result)  
}

chiTestTab2 <- function(data, index1, index2) {
  result <- data.frame ();
  count <- 0;
  for(i in set(data[,index1])) {
    for(j in set(data[,index2])) {
      sub <- subset(data, (data[,index1] == i) & (data[,index2] == j));
      if(nbOfTrial(sub) != 0) {
        result[paste(i,j,sep="/"),"trial"] <- nbOfTrial(sub);
        result[paste(i,j,sep="/"),"compile"] <- nbOfCompile(sub);
        result[paste(i,j,sep="/"),"compile%"] <- round(100*nbOfCompile(sub)/nbOfTrial(sub),2);
        result[paste(i,j,sep="/"),"sosie"] <- nbOfSosie(sub);
        result[paste(i,j,sep="/"),"sosie%"] <- round(100*nbOfSosie(sub)/nbOfTrial(sub),2);
      }
    }
  }
  return(result)  
}