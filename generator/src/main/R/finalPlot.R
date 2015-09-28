plotOneLn <- function(data, mainLabel, withLegend) {
  result <- buildData(data, 7, -100)
  result <- subset(result, result$nbTrial != 0)
  
  functionX <- function(data) {return(data$nbTest)}
  functionY <- function(data) {return(data$nbSosie/data$nbTrial)}
  
  if(mainLabel == "jgit") {
    result <- subset(result, !(functionY(result) > 0.22 & functionX(result) > 710))  
  }
  
  if(withLegend) {
    plot(functionY(result) ~ functionX(result), ylim=c(0,0.4), xlab="number of test cases (TC)", ylab= "sosiefication rate (SR)", main = mainLabel, pch=20)
  } else {
    plot(functionY(result) ~ functionX(result), xlab="", ylim= c(0,0.25),  ylab= "", pch=20)  
  }
  lmTmp <- lm(functionY(buildData(data, 7, -100)) ~ functionX(buildData(data, 7, -100)))
  print(mainLabel)
  print(lmTmp)
  abline(lmTmp, col = "blue")
}


plotAllLn <- function() {
  functionX <- function(data) {return(data$nbTest)}
  functionY <- function(data) {return(data$nbSosie/data$nbTrial)}
  
  par(mfrow=c(2,3))
  
  plotOneLn(commons.io_stmt, "commons-io", T)
  plotOneLn(commons.codec_stmt , "commons-codec", T)
  plotOneLn(commons.lang_stmt, "commons-lang", T)
  plotOneLn(commons.collections_stmt, "commons-collections", T)
  plotOneLn(subset(gson_stmt, gson_stmt$maxDeep < 1000), "gson", T)
  plotOneLn(subset(jgit_stmt, functionY(jgit_stmt) < 0.4),  "jgit", T)
  
  sizeZoom <- 1/5
  par(fig=c((1/3)-(sizeZoom),1/3,0.5+(sizeZoom),1), new=TRUE)
  plotOneLn(subset(commons.io_stmt, commons.io_stmt$nbTest <= 20), "commons io", F)
  
  par(fig=c((2/3)-(sizeZoom),2/3,0.5+(sizeZoom),1), new=TRUE)
  plotOneLn(subset(commons.codec_stmt, commons.codec_stmt$nbTest <= 27), "commons io", F)
  
  par(fig=c((1)-(sizeZoom),1,0.5+(sizeZoom),1), new=TRUE)
  plotOneLn(subset(commons.lang_stmt, commons.lang_stmt$nbTest <= 28), "commons io", F)
  
  par(fig=c((1/3)-(sizeZoom),1/3,sizeZoom,0.5), new=TRUE)
  plotOneLn(subset(commons.collections_stmt, commons.collections_stmt$nbTest <= 33), "commons io", F)
  
  par(fig=c((2/3)-(sizeZoom),2/3,sizeZoom,0.5), new=TRUE)
  plotOneLn(subset(gson_stmt, gson_stmt$nbTest <= 28), "commons io", F)
  
 par(fig=c((1)-(sizeZoom),1,sizeZoom,0.5), new=TRUE)
 plotOneLn(subset(jgit_stmt, jgit_stmt$nbTest <= 21), "commons io", F)
}


plotLn <- function(data, mainLabel, file) {
  pdf(file,height=8.27,width= 11.69)
  
  functionX <- function(data) {return(data$nbTest)}
  functionY <- function(data) {return(data$nbSosie/data$nbTrial)}
  
  plotOneLn(data, mainLabel, T)  
  
  par(fig=c(0.4,1,0.4,1), new=TRUE)
  plotOneLn(subset(data, data$nbTest <= 20), "commons io", F)
  dev.off()
}



