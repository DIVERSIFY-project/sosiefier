var paper = Snap(document.getElementById("svg"));
//var paper = Snap(2000,5000);
var rectL = 150;
var marginX = 10;
var marginY = 10;
var claseeNameSize = 15;
var stroke_Width = 3;
var maxNumberOfClassPerLine = 4;
var maxNumberOfPackagePerLine = 3;
var jsonData;

var steroid = true, reaction = true, wittgenstein = true, random = true;

$.getJSON("data/clojure_visu.json", function (data) {
    jsonData = data;
    var visu = new Visu(data);
    visu.draw();
});

$(document).find('#random-button').click(function () {
    if ($(this).hasClass("btn-success")) {
        random = false;
        $(this).attr("class", "btn btn-danger");
    } else {
        random = true;
        $(this).attr("class", "btn btn-success");
    }
    paper.clear();

    var visu = new Visu(jsonData);
    visu.draw();
})

$(document).find('#reaction-button').click(function () {
    if ($(this).hasClass("btn-success")) {
        reaction = false;
        $(this).attr("class", "btn btn-danger");
    } else {
        reaction = true;
        $(this).attr("class", "btn btn-success");
    }
    paper.clear();
    var visu = new Visu(jsonData);
    visu.draw();
})

$(document).find('#steroid-button').click(function () {
    if ($(this).hasClass("btn-success")) {
        steroid = false;
        $(this).attr("class", "btn btn-danger");
    } else {
        steroid = true;
        $(this).attr("class", "btn btn-success");
    }
    paper.clear();
    var visu = new Visu(jsonData);
    visu.draw();
})

$(document).find('#wittgenstein-button').click(function () {
    if ($(this).hasClass("btn-success")) {
        wittgenstein = false;
        $(this).attr("class", "btn btn-danger");
    } else {
        wittgenstein = true;
        $(this).attr("class", "btn btn-success");
    }
    paper.clear();
    var visu = new Visu(jsonData);
    visu.draw();
})


function Visu(JSONObject) {
    this.JSONObject = JSONObject;
    this.group = paper.g();
    this.package;

    this.draw = function () {
        this.package = [];
        for (var i = 0; i < this.JSONObject.length; i++) {
            this.package[i] = new VisuPackage(this.JSONObject[i], paper);
            this.package[i].draw(0, 0);
        }
        this.package = this.package.sort(function (i, j) {
            return j.width - i.width;
        });

        var maxSize = 0;
        var currentY = marginY;
        var currentX = marginX;
        var h = 0 ,w = 0;
        var i = 0;
        var line = 0;
        while (i < this.package.length) {
            if (line == maxNumberOfPackagePerLine) {
                line = 0;
                currentY += maxSize + (this.package[i]).width + 2 * marginY;
                currentX = marginX;
            }
            if (line == 0) {
                this.package[i].translate(currentX, currentY);
                this.group.add(this.package[i].group);
                maxSize = (this.package[i]).width;
                w = Math.max(w,maxSize+ marginX);
                i++;
            } else {
                cl = this.packageToDraw(maxSize, i);
                var y = currentY;

                for (var j = 0; j < cl.length; j++) {
                    this.package[i + j].translate(currentX, y);
                    this.group.add(this.package[i + j].group);
                    y += (this.package[i + j]).width + 2 * marginY;
                }
                w = Math.max(w,y);
                i = i + cl.length;
            }

            currentX = currentX + (this.package[i - 1]).height + marginX;
            h = Math.max(h,currentX + (this.package[i -1]).height + marginX);
            line++;
        }
        console.log(h);
        console.log(w);
        this.resizeDiv(h,w);
    }

    this.packageToDraw = function (maxSize, j) {
        var cl = [];
        var i = j;
        var currentSize = 0;
        while (i < this.package.length && currentSize <= maxSize - ((this.package[i]).width)) {
            cl.push(this.package[i]);
            currentSize += this.package[i].width + marginY;
            i++;
        }
        return cl;
    }

    this.resizeDiv = function(width, height) {
        console.log($("#svg"))
        $("#svg").width(width);
        $("#svg").height(height);
    }
}


function VisuPackage(JSONObject) {
    this.JSONObject = JSONObject;
    this.group = paper.g();
    this.classes;
    this.height;
    this.width;

    this.draw = function (x, y) {
        this.classes = [];
        for (var i = 0; i < this.JSONObject.classes.length; i++) {
            this.classes[i] = new VisuClass(this.JSONObject.classes[i], paper);
        }
        this.classes = this.classes.sort(function (i, j) {
            return j.getSize() - i.getSize();
        });
        var maxSize = 0;
        var currentY = marginY + claseeNameSize;
        var currentX = marginX;
        var i = 0;
        var line = 0;
        var nbColumn = 0;
        while (i < this.classes.length) {
            if (line == maxNumberOfClassPerLine) {
                line = 0;
                currentY += maxSize + 2 * marginY;
                currentX = marginX;
            }
            if (line == 0) {
                this.classes[i].draw(currentX, currentY);
                this.group.add(this.classes[i].group);
                maxSize = this.classes[i].getSize();
                i++;
            } else {
                cl = this.classToDraw(maxSize, i);
                var tmpY = currentY;
                for (var j = 0; j < cl.length; j++) {
                    this.classes[i + j].draw(currentX, tmpY);
                    this.group.add(this.classes[i + j].group);
                    tmpY += this.classes[i + j].getSize() + 2 * marginY;
                }
                i = i + cl.length;

            }
            currentX = currentX + rectL + marginX;
            nbColumn++
            line++;
        }
        var r = this.addPackage(currentY + maxSize, nbColumn);
        this.addText();
        this.translate(x, y);
    }

    this.addPackage = function (y, nbColumn) {
        if (nbColumn < maxNumberOfClassPerLine)
            this.height = nbColumn * (rectL + marginX) + marginX;
        else
            this.height = maxNumberOfClassPerLine * (rectL + marginX) + marginX;

        this.width = claseeNameSize + y + marginY;
        var rect = paper.rect(0, 0, this.height, this.width, 5, 5);
        rect.attr({class: "package"});
//        this.group.add(rect);
        rect.prependTo(this.group)
//        rect.toBack();
        return rect;
    }

    this.addText = function () {
        var text = this.JSONObject.name;
        var text = paper.text(10, 16, text);
        text.attr({class: "package"});
        this.group.add(text);
    }

    this.classToDraw = function (maxSize, j) {
        var cl = [];
        var i = j;
        var currentSize = 0;
        while (i < this.classes.length && currentSize <= maxSize - (this.classes[i].getSize())) {
            cl.push(this.classes[i]);
            currentSize += this.classes[i].getSize() + claseeNameSize + marginY;
            i++;
        }
        return cl;
    }

    this.translate = function (x, y) {
        this.group.transform("t" + x + "," + y);
    }


}

function VisuClass(JSONObject) {
    this.JSONObject = JSONObject;
    this.group = paper.g();

    this.draw = function (x, y) {

        var rect = paper.rect(0, 0, rectL, this.JSONObject.size + claseeNameSize, 5, 5);
        rect.attr({class: "class"});
        this.group.add(rect);
        this.addText();
        this.addLines();
        this.translate(x, y);
    }

    this.addLines = function () {
        var line = this.JSONObject.transformation;

        for(var i = 0; i < line.length; i++) {
            var notCompile = 0, failTest = 0, sosie = 0;
            var transformations = line[i].trans;
            for(var j = 0; j < transformations.length; j++) {
                var trans = transformations[j];
                notCompile += trans.notCompile;
                failTest += trans.failTest;
                sosie += trans.sosie;
            }
            this.drawLine(notCompile,failTest,sosie,line[i].position);
        }
    }

    this.drawLine = function (notCompile,failTest,sosie,position) {
        var sum = notCompile + failTest + sosie;
        if (sum == 0)
            return;

        var x1 = (notCompile / (sum)) * rectL;
        var x2 = ((notCompile + failTest) / (sum)) * rectL;
        var lineNC = paper.line(2,
            5 + position + claseeNameSize,
            x1,
            5 + position + claseeNameSize);
        lineNC.attr({class: "notCompile"});

        this.group.add(lineNC);

        var lineFT = paper.line(x1,
            5 + position + claseeNameSize,
            x2,
            5 + position + claseeNameSize);
        lineFT.attr({class: "testFail"});
        this.group.add(lineFT);

        var lineGT = paper.line(x2,
            5 + position + claseeNameSize,
            rectL - 2,
            5 + position + claseeNameSize);
        lineGT.attr({class: "sosie"});

//        lineGT.hover(function(i) {$('#myModal').modal('toggle')
//;                $('#myModal').modal('show')},function(i) {}
//   );
        this.group.add(lineGT);
    }

    this.addText = function () {
        var text = this.JSONObject.name;
        var line = paper.line(0, 5 + claseeNameSize,
            rectL,
            5 + claseeNameSize);
        line.attr({stroke: "black"});
        line.attr({strokeWidth: stroke_Width});
        this.group.add(line);
        var text = paper.text(10, 14, text);
        text.attr({class: "class"});
        this.group.add(text);
    }

    this.translate = function (x, y) {
        this.group.transform("t" + x + "," + y);
    }

    this.getSize = function () {
        return  this.JSONObject.size;
    }
}




