var paper = Snap(3000, 5000);
var rectL = 150;
var marginX = 10;
var marginY = 10;
var claseeNameSize = 15;
var stroke_Width = 3;
var maxNumberOfClassPerLine = 4;
var maxNumberOfPackagePerLine = 3;

$.getJSON("clojure_visu.json",function( data ) {
    var visu = new Visu(data);
    visu.draw();
});


function Visu(JSONObject) {
    this.JSONObject = JSONObject;
    this.group = paper.g();
    this.package;

    this.draw = function() {
        this.package = [];
        for(var i = 0; i < this.JSONObject.length; i++) {
            this.package[i] = new VisuPackage(this.JSONObject[i], paper);
            this.package[i].draw(0,0);
        }
        this.package.sort(function(i,j) {
            return i.width < j.width;
        });

        var maxSize = 0;
        var currentY = marginY;
        var currentX = marginX;
        var i = 0;
        var line = 0;
        while( i < this.package.length) {
            if(line == maxNumberOfPackagePerLine) {
                line = 0;
                currentY += maxSize + 2*marginY;
                currentX = marginX;
            }
            if(line == 0) {
                this.package[i].translate(currentX, currentY);
                this.group.add(this.package[i].group);
                maxSize = (this.package[i]).width;
                i++;
            } else {
                cl = this.packageToDraw(maxSize,i);
                var y = currentY;

                for(var j = 0; j < cl.length; j++) {
                    this.package[i+j].translate(currentX, y);
                    this.group.add(this.package[i+j].group);
                    y += (this.package[i+j]).width + 2*marginY;
                }
                i = i + cl.length;
            }
            currentX = currentX + (this.package[i-1]).height + marginX;
            line++;
        }
    }

        this.packageToDraw = function(maxSize,j) {
            var cl = [];
            var i = j;
            var currentSize = 0;
            while(i < this.package.length && currentSize <= maxSize - ((this.package[i]).width) ) {
                cl.push(this.package[i]);
                currentSize += this.package[i].width + marginY;
                i++;
            }
            return cl;
        }
    }


function VisuPackage(JSONObject) {
    this.JSONObject = JSONObject;
    this.group = paper.g();
    this.classes;
    this.height;
    this.width;

    this.draw = function(x,y) {
        this.classes = [];
        for(var i = 0; i < this.JSONObject.classes.length; i++) {
            this.classes[i] = new VisuClass(this.JSONObject.classes[i], paper);
        }
        this.classes.sort(function(i,j) {
            return i.getSize() < j.getSize();
        });
        var maxSize = 0;
        var currentY = marginY + claseeNameSize;
        var currentX = marginX;
        var i = 0;
        var line = 0;
        var nbColumn = 0;
        while( i < this.classes.length) {
            if(line == maxNumberOfClassPerLine) {
                line = 0;
                currentY += maxSize + 2*marginY;
                currentX = marginX;
            }
            if(line == 0) {
                this.classes[i].draw(currentX, currentY);
                this.group.add(this.classes[i].group);
                maxSize = this.classes[i].getSize();
                i++;
            } else {
                cl = this.classToDraw(maxSize,i);
                var tmpY = currentY;
                for(var j = 0; j < cl.length; j++) {
                    this.classes[i+j].draw(currentX, tmpY);
                    this.group.add(this.classes[i+j].group);
                    tmpY += this.classes[i+j].getSize() + 2*marginY;
                }
                i = i + cl.length;

            }
            currentX = currentX + rectL + marginX;
            nbColumn++
            line++;
        }
        var r = this.addPackage(currentY+maxSize, nbColumn);
        this.addText();
        this.translate(x,y);
    }

    this.addPackage = function(y, nbColumn) {
        if(nbColumn < maxNumberOfClassPerLine)
            this.height = nbColumn * (rectL+marginX) + marginX;
        else
            this.height = maxNumberOfClassPerLine * (rectL+marginX) + marginX;

        this.width = claseeNameSize + y + marginY;
        var rect = paper.rect(0, 0,this.height, this.width,5,5);
        rect.attr({class: "package"});
//        this.group.add(rect);
        rect.prependTo(this.group)
//        rect.toBack();
        return rect;
    }

    this.addText = function() {
        var text = this.JSONObject.name;
        var text = paper.text(10,16,text);
        text.attr({class: "package"});
        this.group.add(text);
    }

    this.classToDraw = function(maxSize,j) {
        var cl = [];
        var i = j;
        var currentSize = 0;
        while(i < this.classes.length && currentSize <= maxSize - (this.classes[i].getSize()) ) {
            cl.push(this.classes[i]);
            currentSize += this.classes[i].getSize() + claseeNameSize +marginY;
            i++;
        }
        return cl;
    }

    this.translate = function(x,y) {
        this.group.transform("t" + x + "," + y);
    }


}

function VisuClass(JSONObject) {
    this.JSONObject = JSONObject;
    this.group = paper.g();

    this.draw = function(x,y) {

        var rect = paper.rect(0, 0,rectL, this.JSONObject.size + claseeNameSize,5,5);
        rect.attr({class: "class"});
        this.group.add(rect);
        this.addText();
        this.addLines();
        this.translate(x,y);
    }

    this.addLines = function() {
        var transformations = this.JSONObject.transformation.sort(function(i,j) {
            return i.position < j.position;
        });
        var i = 0;
        var currentPosition = -1;
        var notCompile = 0, failTest = 0, greenTest = 0;
        while(i < transformations.length) {
            var trans = transformations[i];
            if(currentPosition == trans.position) {
                if(trans.status == -2)
                    notCompile++;
                else if(trans.status == -1)
                    failTest++;
                else
                    greenTest++;
                i++;
            } else {
                var currentPosition = trans.position;
                if(i != 0)
                    this.drawLine(transformations[i-1], notCompile, failTest, greenTest)
                notCompile = 0;
                failTest = 0;
                greenTest = 0;
            }
        }
    }

    this.drawLine = function(trans, notCompile, failTest, greenTest) {
        var x1 = (notCompile / (notCompile + failTest + greenTest)) * rectL;
        var x2 = ((notCompile+failTest) / (notCompile + failTest + greenTest)) * rectL;
        var lineNC = paper.line(0,
            5 + trans.position + claseeNameSize,
            x1,
            5 + trans.position + claseeNameSize);
        lineNC.attr({class: "notCompile"});
//        var text = paper.text(0,0,"cgcvbvcb");
//        text.attr({class:"class", visibility:"hidden"});
//        this.group.add(text);
//        var set = paper.el("set",{
//            attributeName:"visibility", from:"hidden", to:"visible", begin:"thingyouhoverover.mouseover", end:"thingyouhoverover.mouseout"
//        });
//        text.add(set);
//        lineNC.hover(function() {alert("notCompile: "+ notCompile)}, function() {})
        this.group.add(lineNC);

        var lineFT = paper.line(x1,
            5 + trans.position + claseeNameSize,
            x2,
            5 + trans.position + claseeNameSize);
        lineFT.attr({class: "testFail"});
        this.group.add(lineFT);

        var lineGT = paper.line(x2,
            5 + trans.position + claseeNameSize,
            rectL,
            5 + trans.position + claseeNameSize);
        lineGT.attr({class: "sosie"});
        this.group.add(lineGT);
    }

    this.addText = function() {
        var text = this.JSONObject.name;
        var line = paper.line(0,5 + claseeNameSize,
            rectL,
            5 + claseeNameSize);
        line.attr({stroke: "black"});
        line.attr({strokeWidth:stroke_Width});
        this.group.add(line);
        var text = paper.text(10,14,text);
        text.attr({class: "class"});
        this.group.add(text);
    }

    this.translate = function(x,y) {
        this.group.transform("t" + x + "," + y);
    }

    this.getSize = function() {
        return  this.JSONObject.size;
    }
}




