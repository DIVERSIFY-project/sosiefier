matrixFailure <- function(data) {
  return(data[c(-1)]);
}

uniqueFailure <- function(data) {
  matrix <- matrixFailure(data);
  colnames <- colnames(matrix);
  uniqFailure = array();
  count = 1;
  for(i in 1:length(data[,1])) {
    if(sum(matrix[i,]) == 1) {
      for(j in 1:length(matrix[i,])) {
        if(matrix[i,j] == 1) {
          uniqFailure[count] = colnames[j];
          count = count + 1;
        }
      }
    }  
  }
  return(uniqFailure);
}

neverRed <- function(data) {
  matrix <- matrixFailure(data);
  colnames <- colnames(matrix);
  neverRed = array();
  count = 1;
  for(i in 1:length(colnames)) {
    if(sum(matrix[,i]) == 0) {
      neverRed[count] = colnames[i];
      count = count + 1;
    }  
  }
  return(neverRed);
}

rank <- function(data, test) {
  matrix <- matrixFailure(data);
  colnames <- colnames(matrix);
  for(i in 1:length(data[,1])) {
    if(sum(matrix[i,]) == 1 & matrix[i,test] == 1) {
      return(i);sum ()
    }
  }
  return(-1);  
}

barPlotMeanRank <- function(data) {
  matrix <- matrixFailure(data);
  colnames <- colnames(matrix);
  rank <-  array();
 
  for(i in 1:length(colnames)) {
    rank[i] <- meanRank(matrix, colnames[i]);
  }
  barplot(sort(rank), ylim=c(0,max(rank)));
}

meanRank <- function(matrix, test) {
  tmp <- matrix[,test];
  return(sum(tmp)/length(tmp));  
}

barplotFailure <- function(data,name) {
  array <- array();
  length <- length(data);
  uF <- length(uniqueFailure(data));
  nR <- length(neverRed(data));  
  array[1] <- uF/length;
  array[2] <- (length - uF - nR)/length;
  array[3] <- nR/length;

  return(data.frame(name=c(name), u=c(array[1]),all=c(array[2]), nr=c(array[3])) );
}
#frame <- rbind(tmp,tmp2,tmp3)
#t <- t(as.matrix(frame[,2:4]))
#barplot(t, col=c("darkblue","darkgreen","red"), names.arg = frame$name)