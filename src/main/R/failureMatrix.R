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
      return(i);
    }
  }
  return(-1);
  
}

