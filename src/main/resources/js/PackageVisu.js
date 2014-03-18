function VisuPackage(JSONObject) {
    this.JSONObject = JSONObject;
    this.group = paper.g();
    this.classes;
    this.height; //hauteur
    this.width; //largeur

    this.draw = function (x, y) {
        this.classes = [];
        for (var i = 0; i < this.JSONObject.classes.length; i++) {
            this.classes[i] = new VisuClass(this.JSONObject.classes[i], paper);
        }
        this.classes = this.classes.sort(function (i, j) {
            return j.height - i.height;
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
                maxSize = (this.classes[i]).height;
                i++;
            } else {
                cl = this.classToDraw(maxSize, i);
                var tmpY = currentY;
                for (var j = 0; j < cl.length; j++) {
                    this.classes[i + j].draw(currentX, tmpY);
                    this.group.add(this.classes[i + j].group);
                    tmpY += (this.classes[i + j]).height + 2 * marginY;
                }
                i = i + cl.length;

            }
            currentX = currentX + classWidth + marginX;
            nbColumn++
            line++;
        }
        var r = this.addPackage(currentY + maxSize, nbColumn);
        this.addText();
        this.translate(x, y);
    }

    this.addPackage = function (y, nbColumn) {
        if (nbColumn < maxNumberOfClassPerLine)
            this.height = nbColumn * (classWidth + marginX) + marginX;
        else
            this.height = maxNumberOfClassPerLine * (classWidth + marginX) + marginX;

        this.width = claseeNameSize + y + marginY;
        var rect = paper.rect(0, 0, this.height, this.width, 5, 5);
        rect.attr({class: "package"});
        rect.prependTo(this.group)
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
        while (i < this.classes.length && currentSize <= maxSize - (this.classes[i].height)) {
            cl.push(this.classes[i]);
            currentSize += this.classes[i].height + claseeNameSize + marginY;
            i++;
        }
        return cl;
    }

    this.translate = function (x, y) {
        this.group.transform("t" + x + "," + y);
    }


}