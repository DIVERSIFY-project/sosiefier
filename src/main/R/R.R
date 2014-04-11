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


resultTab <- function(data, le, ls, oe, os) {
  result <- resultLigne(data, "linkExistence", le)
  result <- rbind(result, resultLigne(data, "linkSubstitution", ls))
  result <- rbind(result, resultLigne(data, "objectExistence", oe))
  result <- rbind(result, resultLigne(data, "objectSubstitution", os))
  
  return(result)  
}

resultLigne <- function(data, index, max) {
  result <- data.frame ();
  
  sub <- subset(data, data[,"name"] == index);
  
  result[index,"# candidate"] <- max;
  result[index,"# trial"] <- nbOfTrial(sub);
  result[index,"# compile"] <- nbOfCompile(sub);
  result[index,"compile%"] <- round(100*nbOfCompile(sub)/nbOfTrial(sub),2);
  result[index,"# sosie"] <- nbOfSosie(sub);
  result[index,"sosie%"] <- round(100*nbOfSosie(sub)/nbOfTrial(sub),2);

  return(result)
}

printLatexTab <- function(fileName, data, le, ls, oe, os) {
  
  print(xtable(resultTab(data, le, ls, oe, os)), type="latex", file=fileName)
 print(xtable(chiTestTab(data, "stmtType")), append=TRUE, type="latex", file=fileName)
 print(xtable(chiTestTab2(data, "stmtType", "name")), append=TRUE, type="latex", file=fileName)
}

#resultTab(junit_source, 434, 103560, 16945, 26730357)
#resultTab(metrics_source, 376, 81940, 9425, 8436703)
#resultTab(commons.math_source, 3869, 9780783, 268421, 3325660457)
#commons-lang 842, 479108, 66191, 443262201 
#easymock 287, 45051, 10284, 9113924



test <- function(data,selector) {
  array <- array();

  subset <- subset(data, data$name == selector)
  trial <- nbOfTrial(subset);
  compile <- nbOfCompile(subset)
  sosie <- nbOfSosie(subset);  
  array[1] <- 100*(trial -compile)/trial;
  array[2] <- 100*compile/trial;
  array[3] <- 100*sosie/trial;

  return(data.frame(name=c(selector), "not compile"=c(array[1]),compile=c(array[2]), sosie=c(array[3])));

}

test2 <- function(data) {
  frame <- data.frame()
  for(i in set(data[,"name"])) {
    frame <- rbind(frame,test(data,i));
  }
  t <- t(as.matrix(frame[,2:4]))
  barplot(t, col=c("red", "darkblue","darkgreen"), beside = TRUE, names.arg = frame$name, ylim=c(0,100))  
}


test3 <- function() {
  f1 <- data.frame(name=c("easymock"), diversity=c(46.88),"call diversity"=c(34.62),
                   "var. diversity"=c(29.89))
  
  f2 <- data.frame(name=c("dagger"), diversity=c(66.94),"call diversity"=c(66.32),
                   "var. diversity"=c(3.95))
  
  f3 <- data.frame(name=c("junit"), diversity=c(45.96),"call diversity"=c(43.5),
                   "var diversity"=c(21.3))
  
  frame <- rbind(f1,f2,f3)
  t <- t(as.matrix(frame[,2:4]))
  barplot(t, col=c("red", "darkblue","darkgreen"), beside = TRUE, names.arg = frame$name,, ylim=c(0,70),legend.text = TRUE)  
  
}