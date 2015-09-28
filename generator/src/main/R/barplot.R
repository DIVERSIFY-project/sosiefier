#data: donne sur les transformation
barplotOneDimention <- function(data, index, yfunction, ylab, mainLabel, withYLegend) {
  tmp <- buildDataFromTransformation(data, index) 
  names <- vector()
  result <- vector()
  i <- 1
  for(s in sort(union(data[,index], data[,index]))) {
    if(s !="CtUnaryOperatorImpl" & s != "CtBreakImpl" & s != "CtDoImpl" 
       & s!= "CtSynchronizedImpl" & s != "CtConstructorCallImpl" 
       & s != "CtSwitchImpl" & s != "CtOperatorAssignmentImpl") {
      if(index == 17 | index == 18) {
        if(s =="CtLocalVariableImpl") {
          names[i] <- "LocalVar"  
        } else {
          if(s =="CtAssignmentImpl") {
            names[i] <- "Assign"  
        } else {
        names[i] <-  substr(s, 3,nchar(s) - 4)
        }
        }
      } else {
        names[i] <- s  
      }
      result[i] <- yfunction(tmp[s,])
      i <- i + 1
    }  
  }
  if(withYLegend) {
    barplot(result, names.arg = names, las=2, xlab = ylab, main = mainLabel, horiz = T
            , cex.lab = 1.4, cex.names = 1.6, cex.main= 2)
  } else {
    barplot(result, axisnames = F, las=2, xlab = ylab, main = mainLabel, horiz = T, cex.lab = 1.6, cex.main= 2)  
  }
}

barplotOneDimentionAllProject <- function(dataSelect, index, yfunction, ylab) {
  par(mfrow=c(2,3),mar = c(4, 7.2, 3, 0.5))
  barplotOneDimention(dataSelect(commons.io), index, yfunction, ylab, "commons-io",T)
  par(mar = c(4, 0, 3, 0.5))
  barplotOneDimention(dataSelect(commons.codec), index, yfunction, ylab, "commons-codec", F)
  barplotOneDimention(dataSelect(commons.lang), index, yfunction, ylab, "commons-lang", F)
  par(mar = c(4, 7.2, 3, 0.51))
  barplotOneDimention(dataSelect(commons.collections), index, yfunction, ylab, "commons-collections", T)
  par(mar = c(4, 0, 3, 0.5))  
  barplotOneDimention(dataSelect(gson), index, yfunction, ylab, "gson", F)
  barplotOneDimention(dataSelect(jgit), index, yfunction, ylab, "jgit", F)
}

writeBarplot27 <- function(dir) {
  srFct <- function(data){return(data$nbSosie/data$nbTrial)}
  ylab <- "sosiefication rate (SR)"
  pdf(paste(dir, "delete-transplantationPoint-SR.pdf",sep=""),height=4.75,width= 11.69)
  barplotOneDimentionAllProject(function(data){return(subset(data, data$name == "delete"))}, 17, srFct, ylab)
  dev.off()
  
  pdf(paste(dir, "add-transplant-SR.pdf",sep=""),height=4.75,width= 11.69)
  barplotOneDimentionAllProject(function(data){return(subset(data, data$name == "add"))}, 18, srFct, ylab)
  dev.off()
  
  pdf(paste(dir, "transformationType-SR.pdf",sep=""),height=4.27,width= 11.69)
  barplotOneDimentionAllProject(function(data){return(data)}, 3, srFct, ylab)
  dev.off()
}

writeAllBarplotForOneProject <- function(data, mainLabel, dir) {
  srFct <- function(d){return(d$nbSosie/d$nbTrial)}
  ylab <- "sosiefication rate (SR)"
  pdf(paste(dir,mainLabel ,"-delete-transplantationPoint-SR.pdf",sep=""),height=6.75,width= 11.69)
  par(mar = c(5, 8, 5, 2))
  barplotOneDimention(subset(data, data$name == "delete"), 17, srFct, ylab, mainLabel, T)
  dev.off()
  
  pdf(paste(dir,mainLabel ,"-add-transplant-SR.pdf",sep=""),height=4.75,width= 11.69)
  par(mar = c(5, 8, 5, 2))
  barplotOneDimention(subset(data, data$name == "add"), 18, srFct, ylab, mainLabel,T)
  dev.off()
  
  pdf(paste(dir,mainLabel ,"-transformationType-SR.pdf",sep=""),height=4.27,width= 11.69)
  par(mar = c(5, 8, 5, 2))
  barplotOneDimention(data, 3, srFct, ylab, mainLabel,T)
  dev.off()
}

buildDataMatrixData <- function(data,  indexRow, indexCol, evalFunction) {
  selectorsRow <- sort(union(data[,indexRow], data[,indexRow]))
  selectorsCol <- sort(union(data[,indexCol], data[,indexCol]))
  
  mat <-matrix(nrow = length(selectorsRow), ncol = length(selectorsCol),dimnames = list(selectorsRow, selectorsCol))
  
  for(i in 1:length(selectorsRow)) {
    for(j in 1:length(selectorsCol)) {
      set <- subset(data, data[ ,indexRow] == selectorsRow[i] & data[ ,indexCol] == selectorsCol[j])
      mat[i, j] <- evalFunction(set) 
    }
  }

  return(mat)
}

sosieRate <- function(data){
  if(size(data) != 0) {
    return(size(selectSosie(data))/size(data))
  } else{
    return(0)
  }
}
