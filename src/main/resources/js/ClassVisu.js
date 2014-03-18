

function VisuClass(JSONObject) {
    this.JSONObject = JSONObject;
    this.group = paper.g();
    this.height = JSONObject.size; //hauteur
    this.width = classWidth; //largeur

    this.draw = function (x, y) {

        var rect = paper.rect(0, 0, this.width, this.height + claseeNameSize, 5, 5);
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

        var x1 = (notCompile / (sum)) * this.width;
        var x2 = ((notCompile + failTest) / (sum)) * this.width;
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
            this.width - 2,
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
            this.width,
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

//    this.getSize = function () {
//        return  this.JSONObject.size;
//    }
}