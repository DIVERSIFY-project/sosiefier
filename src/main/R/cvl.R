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

summaryTable1 <- function(data, metric) {
  result <- data.frame ();
  allCandidate <- as.brob(0);
  for(i in set(data[,"name"])) {
    sub <- subset(data, data[,"name"] == i);
    candidate <- as.brob(0);
    for(x in metric[,i]) {
      candidate <- as.brob(x) + candidate
    }
    
    allCandidate <- allCandidate + candidate;
    if(candidate < nbOfTrial(sub))
      trial <- candidate
    else
      trial <- nbOfTrial(sub)
    
    if(trial != 0 & candidate != 0) {
      result[paste(i,sep=""),"candidate"] <- as.numeric(candidate);
      result[paste(i,sep=""),"trial"] <- trial;
      result[paste(i,sep=""),"%trial"] <- round(100*trial/as.numeric(candidate),2);
      result[paste(i,sep=""),"margin of error"] <- round(100*errorMargin(sub, as.numeric(candidate)),1);
      result[paste(i,sep=""),"compile"] <- nbOfCompile(sub);
      result[paste(i,sep=""),"compile%"] <- round(100*nbOfCompile(sub)/trial,2);
      result[paste(i,sep=""),"sosie"] <- nbOfSosie(sub);
      result[paste(i,sep=""),"sosie%"] <- round(100*nbOfSosie(sub)/trial,2);
    }
    
    sub <- data;
    candidate <- allCandidate;
    result["all","candidate"] <- as.numeric(candidate);
    result["all","trial"] <- trial;
    result["all","%trial"] <- round(100*trial/as.numeric(candidate),2);
    result["all","margin of error"] <- round(100*errorMargin(sub, as.numeric(candidate)),1);
    result["all","compile"] <- nbOfCompile(sub);
    result["all","compile%"] <- round(100*nbOfCompile(sub)/trial,2);
    result["all","sosie"] <- nbOfSosie(sub);
    result["all","sosie%"] <- round(100*nbOfSosie(sub)/trial,2);
  } 
  return(result)  
}

summaryTable2 <- function(data, metric) {
  result <- data.frame ();
  for(i in set(data[,"stmtType"])) {
    sub <- subset(data, data[,"stmtType"] == i);
    candidate <- sum(subset(metric, metric[,"nodeType"] == i)[,c(2,3,4,5)])
    
    if(candidate < nbOfTrial(sub))
      trial <- candidate
    else
      trial <- nbOfTrial(sub)
    
    if(trial != 0 & candidate != 0) {
      result[paste(i,sep=""),"candidate"] <- as.integer(candidate);
      result[paste(i,sep=""),"trial"] <- trial;
      result[paste(i,sep=""),"%trial"] <- round(100*trial/candidate,2);
   #   result[paste(i,sep=""),"margin of error"] <- round(100*errorMargin(sub, candidate),1);
      result[paste(i,sep=""),"compile"] <- nbOfCompile(sub);
      result[paste(i,sep=""),"compile%"] <- round(100*nbOfCompile(sub)/trial,2);
      result[paste(i,sep=""),"sosie"] <- nbOfSosie(sub);
      result[paste(i,sep=""),"sosie%"] <- round(100*nbOfSosie(sub)/trial,2);
    }
  } 
  return(result)  
}

detailTable <- function(data,metric) {
  result <- data.frame ();
  count <- 0;
  for(i in set(data[,"name"])) {
    for(j in set(data[,"stmtType"])) {
      sub <- subset(data, (data[,"name"] == i) & (data[,"stmtType"] == j));
      candidate <- subset(metric, metric$nodeType == j)[i][1,1]
      
      if(candidate < nbOfTrial(sub))
        trial <- candidate
      else
        trial <- nbOfTrial(sub)
      if(nbOfTrial(sub) != 0 & candidate != 0) {
        
        result[paste(i,j,sep=", "),"candidate"] <- as.integer(candidate);
        result[paste(i,j,sep=", "),"trial"] <- trial;
        result[paste(i,j,sep=", "),"%trial"] <- round(100*trial/candidate,2);
       # result[paste(i,j,sep=", "),"margin of error"] <- round(100*errorMargin(sub, candidate),1);
        result[paste(i,j,sep=", "),"compile"] <- nbOfCompile(sub);
        result[paste(i,j,sep=", "),"compile%"] <- round(100*nbOfCompile(sub)/trial,2);
        result[paste(i,j,sep=", "),"sosie"] <- nbOfSosie(sub);
        result[paste(i,j,sep=", "),"sosie%"] <- round(100*nbOfSosie(sub)/trial,2);
      }
    }
  }
  return(result)  
}

#seuil de confiance 99%
errorMargin <- function(data, sizePop) {
  if(nbOfTrial(data) > sizePop)
    sampleSize <- sizePop
  else
    sampleSize <- nbOfTrial(data)
  
  p <- nbOfSosie(data)/sampleSize;
  if(p > 0.8) {
    p <- 0.8
  }
  if(p < 0.2) {
    p <- 0.2
}
  return(sqrt( (2.58^2*p*(1-p)) / (sizePop*(sampleSize/(sizePop-sampleSize)))))
}

printLatexTab <- function(fileName, data, metric) {
  
  print(xtable(summaryTable1(data, metric)), type="latex", file=fileName)
   tmp <- summaryTable2(data, metric);
   print(xtable(tmp[with(tmp, order(-tmp[,5])),]), append=TRUE, type="latex", file=fileName)
  tmp <- detailTable(data, metric);
  print(xtable(tmp[with(tmp, order(-tmp[,5])),]), append=TRUE, type="latex", file=fileName)
}

merCvlMetric <-function(m1, m2) {

      m <- ddply(merge(m1, m2, by = c("nodeType"), all=TRUE), .(nodeType), summarise,
            objectExistence=summ(objectExistence.x,objectExistence.y),
            objectSubstitution=summ(objectSubstitution.x,objectSubstitution.y),
            linkExistence=summ(linkExistence.x,linkExistence.y), 
            linkSubstitution=summ(linkSubstitution.x,linkSubstitution.y))
  
  return(m);
}

summ <- function(x,y){
  if(is.na(x) & is.na(y))
    return(0);
  if(is.na(x))
    return(y);
  if(is.na(y))
    return(x);
 
    return(x+y);
}

#printLatexTab("~/Documents/papier/bosco/junit.tex", junit_cvl, 434, 103560, 16945, 26730357)
#printLatexTab("~/Documents/papier/bosco/metrics.tex", metrics_cvl, 376, 81940, 9425, 8436703)
#printLatexTab("~/Documents/papier/bosco/commons-math.tex",  math_cvl, 3869, 9780783, 268421, 3325660457)
#printLatexTab("~/Documents/papier/bosco/commons-lang.tex", lang_cvl, 842, 479108, 66191, 443262201)
#printLatexTab("~/Documents/papier/bosco/easymock.tex", easymock_cvl, 287, 45051, 10284, 9113924)
#printLatexTab("~/Documents/papier/bosco/commons-collections.tex", collections_cvl, 1316, 766156, 52664, 231420664)
#printLatexTab("~/Documents/papier/bosco/jbehave.tex", jbehave_cvl, 1039, 741218, 30102, 83260372) 