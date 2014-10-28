
diffVar <- function(original, client) {
  diff <- vector();
  count <- 1;
  #rownames(original) <- original$point;
  for(p in original$point) {
    if(!is.na(client[p,"OS"]) & !is.na(client[p,"SS"])) {
      if(is.var(original,p)) {
        if(original[p,"OS"] == "S"
         & client[p,"OS"] == "D") {
        diff[count] <- p;
        count <- count + 1;
        }
      }
    }
  } 
  return(diff)
}

diffCall <- function(original, client) {
  diff <- vector();
  count <- 1;
  #rownames(original) <- original$point;
  for(p in original$point) {
    if(!is.na(client[p,"OS"]) & !is.na(client[p,"SS"])) {
      if(!is.var(original,p)) {
        if(original[p,"OS"] == "S"
           & client[p,"OS"] == "D") {
          diff[count] <- p;
          count <- count + 1;
        }
      }
    }
  } 
  return(diff)
}

sameOS <- function(report, point) {
  return(report[point,"OS"] == "FS" | report[point,"OS"] == "VS")
}
sameSS <- function(report,point) {
  return(report[point,"SS"] == "FS" | report[point,"SS"] == "VS")
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

loadAllsosieReport <- function(dir) {
  sosieName <<- lapply(list.files(dir,pattern="*.csv"), function(sosie) sosie);
  
  sosieReport <<- lapply(list.files(dir,pattern="*.csv"), function(sosie) {
                    tmp <- read.csv2(paste(dir,sosie,sep="/"));
                     rownames(tmp) <- tmp$point;
                     return(tmp)})
}

findDiff <- function(original) {
  diffSummary <- data.frame();
  for(i in 1:length(sosieReport)) {
    call <- diffCall(original, sosieReport[[i]]);
    var <- diffVar(original, sosieReport[[i]]);
    name <- unlist(strsplit(sosieName[[i]], "[.]"))[1]
   
    diffSummary[name, "var"] <- length(var)
    diffSummary[name, "call"] <- length(call)
    if(length(var) != 0) {
      print(name) 
      print(var);
   }
  } 
  return(diffSummary)
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