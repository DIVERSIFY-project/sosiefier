
diffPoint <- function(original, client) {
  diff <- vector();
  count <- 1;
  for(p in client$point) {
    if(!is.na(client[p,"OS"])
       & is.var(client,p)
      & diffOS(client,p) 
      & !diffSS(client,p)) {
       # print(paste("diff OS and not SS:",client[p,"OS"], p),)
        if(!is.na(original[p,"OS"])
            & diffOS(original,p)
           & !diffSS(original,p)) {
          diff[count] <- p;
          count <- count + 1;
        }
      }      
  }
  return(diff)
}

fixOS <- function(report, point) {
  return(report[point,"OS"] == "FD" | report[point,"OS"] == "FS")
}
fixSS <- function(report,point) {
  return(report[point,"SS"] == "FD" | report[point,"SS"] == "FS")
}
diffSS <- function(report,point) {
  return(report[point,"SS"] == "FD" | report[point,"SS"] == "VD")
}
diffOS <- function(report,point) {
  return(report[point,"OS"] == "FD" | report[point,"OS"] == "VD")
}
is.var <- function(report,point) {
  type <- report[point,"SS"];
  return(type ==  "FS" | type == "FD" | type == "VS" | type == "VD")
}
FS <- function(report) {
  return(subset(report, report$OS == "FS"));
}
FD <- function(report) {
  return(subset(report, report$OS == "FD"));
}
VS <- function(report) {
  return(subset(report, report$OS == "VS"));
}
VD <- function(report) {
  return(subset(report, report$OS == "VD"));
}
CS <- function(report) {
  return(subset(report, report$OS == "S"));
}
CD <- function(report) {
  return(subset(report, report$OS == "D"));
}

barPlotVar <- function(report) {
  rank <-  array();
  
  rank[1] <- length(FS(report)$point)
  rank[2] <- length(FD(report)$point)
  rank[3] <- length(VS(report)$point)
  rank[4] <- length(VD(report)$point)
  
  barplot(rank, names.arg = c("FS","FD", "VS", "VD"));
}

loadReport <- function(dir) {
  reportName <<- array();
  statusSummary  <<- data.frame();
  
  report <<- list();
  count <- 0;
  for(clientDir in list.files(dir)) {
    if(is.dir(paste(dir,clientDir,sep="/"))) {
      print(paste("directory:", clientDir))
      count <- count + 1;
        
      global <- NULL;
      for(clientReport in list.files(paste(dir,clientDir,sep="/" ),pattern="*.csv")) {
       
        print(paste("load report: ", clientReport))
        report <- read.csv2(paste(dir,clientDir,clientReport,sep="/"));
        
        statusSummary[clientReport,"client"] <- clientDir; 
        statusSummary[clientReport,"sosie"] <- clientReport;
        statusSummary[clientReport,"FS"] <- length(FS(report)$point); 
        statusSummary[clientReport,"FD"] <- length(FD(report)$point);
        statusSummary[clientReport,"VS"] <- length(VS(report)$point); 
        statusSummary[clientReport,"VD"] <- length(VD(report)$point);
          
        if(is.null(global)) {
          global <- report
          rownames(global) <- global$point
        } else {
          rownames(report) <- report$point
          global <- updateReport(global, report);
        }
      }
      if(clientDir == "sosie") {
        original <<- global;
      } else {
        report[[count]] <<- global; 
        reportName[count] <<- clientDir;
      }
    } 
  }
}

loadAllsosieReport <- function(dir) {
  sosieName <<- lapply(list.files(dir,pattern="*.csv"), function(sosie) sosie);
  
  sosieReport <<- lapply(list.files(dir,pattern="*.csv"), function(sosie) {
    read.csv2(paste(dir,sosie,sep="/"))})
}

findDiff(original) {
  
}

reportSummary <- function() {
  all <- data.frame()
  summary  <- data.frame();  
  for(i in 1:length(reportName)) {
    client <- reportName[i]
    summary[client, "FS"] <- length(FS(report[[i]])$point)
    summary[client, "FD"] <- length(FD(report[[i]])$point)
    summary[client, "VS"] <- length(VS(report[[i]])$point)
    summary[client, "VD"] <- length(VD(report[[i]])$point)
  }
  return(summary)
}

diffPointBySosie <- function(sosieDir, clientDir, fileName) {
  result <- array();
  count <- 1;
  for(sosie in list.files(sosieDir)) {
    if(is.dir(sosie) & grepl(".*csv", sosie)) {
      print(paste("sosie:", substr(sosie,1, nchar(sosie)-4)))
      reportSosie <- read.csv2(paste(sosieDir,sosie,sep="/"));
      rownames(reportSosie) <- reportSosie$point
      
      for(client in list.files(clientDir)) {
        if(is.dir(client) & sosie == client) { 
          reportClient <-  read.csv2(paste(clientDir,client,sep="/"));
          rownames(reportClient) <- reportClient$point
        }
      }
      for(diff in diffPoint(reportSosie,reportClient)) {
        print(paste(sosie, diff));
        result[count] <- paste(substr(sosie,1, nchar(sosie)-4), diff, sep="::")
        count <- count + 1
      }
    }
  }
  print(result)
  write(result, file=fileName, sep = "\n")
}

loadAndMerge <- function(dir) {
  global <- NULL;
  for(file in list.files(dir,pattern="*.csv")) {
    report <- read.csv2(paste(dir,file,sep="/"));
    print(paste("load report: ", file))
    if(is.null(global)) {
      global <- report
      rownames(global) <- global$point
    } else {
      rownames(report) <- report$point
      global <- updateReport(global, report);
    }
  }
  return(global)
}

updateReport <- function(report, update) {
  for(p in report$point) {
    if(!is.na(p)) {
   # if(!is.na(update[p,"SS"]) & !is.na(report[p,"SS"])) { 
      report[p,"SS"] <- mergePoint(report[p,"SS"], update[p,"SS"])
  #  }
  #  if(!is.na(update[p,"OS"]) & !is.na(report[p,"OS"])) { 
      report[p,"OS"] <- mergePoint(report[p,"OS"], update[p,"OS"])
  #  }
  }
  }
  for(p in update$point) {
    if(is.na(report[p,"SS"])) {
      report[p,"SS"] <- update[p,"SS"];
      report[p,"OS"] <- update[p,"OS"];
    }
  }
  return(report)
}


mergePoint <- function(v1, v2) {
  if(is.na(v1) & is.na(v2)) {
    return("null")
  }
  if(is.na(v1)) {
    return(v2)
  }
  if(is.na(v2)) {
    return(v1)
  }
  
  if(v1 == "D") {
    return("D");
  }
  if(v1 == "S") {
    return("S");
  }
  
  if(v1 == "null") {
    return(v2);
  }
  if(v2 == "null") {
    return(v1);
  }
   
  if(v1 == "FS" | v1 == "VS") {
    same1 <- TRUE;
  } else {
    same1 <- FALSE;
  }
  if(v2 == "FS" | v2 == "VS") {
    same2 <- TRUE;
  } else {
    same2 <- FALSE;
  }
  if(v1 == "FS" | v1 == "FD") {
    fix1 <- TRUE;
  } else {
    fix1 <- FALSE;
  }
  if(v2 == "FS" | v2 == "FD") {
    fix2 <- TRUE;
  } else {
    fix2 <- FALSE;
  }
  
 if(same1 & same2) {
  if(fix1 & fix2) {
    return("FS");
  } else {
    return("VS");
  }   
 } else {
   if(fix1 & fix2) {
     return("FD");
   } else {
     return("VD");
   }     
 }
}

is.dir <- function(x)    # helper function
{
  return(length(list.files(x)) != 0)
}