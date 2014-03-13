var paper = Snap(1200, 3000);
var rectL = 150;
var marginX = 10;
var marginY = 10;
var claseeNameSize = 15;
var stroke_Width = 3;
var maxNumberOfClassPerLine = 3;
var maxNumberOfPackagePerLine = 3;

$.getJSON("tmp_visu.json",function( data ) {
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
        this.package = this.package.sort(function(i,j) {
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
        this.classes = this.classes.sort(function(i,j) {
            return i.getSize() < j.getSize();
        });
        var maxSize = 0;
        var currentY = marginY + claseeNameSize;
        var currentX = marginX;
        var i = 0;
        var line = 0;
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
            line++;
        }
        this.addPackage(currentY+maxSize);
        this.addText();
        this.translate(x,y);
    }

    this.addPackage = function(y) {
        if(this.classes.length < maxNumberOfClassPerLine)
            this.height = this.classes.length * (rectL+2*marginX) - 2*marginX;
        else
            this.height = maxNumberOfClassPerLine * (rectL+2*marginX) - 2*marginX;

        this.width = claseeNameSize + y + marginY;
        var rect = paper.rect(0, 0,this.height, this.width);
        rect.attr({class: "package"});
        this.group.add(rect);
    }

    this.addText = function() {
        var text = this.JSONObject.name;
        var text = paper.text(10,14,text);
        this.group.add(text);
    }

    this.classToDraw = function(maxSize,j) {
        var cl = [];
        var i = j;
        var currentSize = 0;
        while(i < this.classes.length && currentSize <= maxSize - (this.classes[i].getSize()) ) {
            cl.push(this.classes[i]);
            currentSize += this.classes[i].getSize() + marginY;
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
        this.addText();
        this.addLines();
        var rect = paper.rect(0, 0,rectL, this.JSONObject.size + claseeNameSize);
        rect.attr({class: "class"});

        this.group.add(rect);

        this.translate(x,y);
    }

    this.addLines = function() {
        var lines = this.JSONObject.transformation;
        for(var j = 0; j < lines.length; j++) {
            var trans = lines[j];
            var line = paper.line(0,
                5 + trans.position + claseeNameSize,
                rectL,
                5 + trans.position + claseeNameSize);
            if(trans.status == -2)
                line.attr({class: "notCompile"});
            else if(trans.status == -1)
                line.attr({class: "testFail"});
            else
                line.attr({class: "sosie"});
            this.group.add(line);
        }
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
        this.group.add(text);
    }

    this.translate = function(x,y) {
        this.group.transform("t" + x + "," + y);
    }

    this.getSize = function() {
        return  this.JSONObject.size;
    }
}

