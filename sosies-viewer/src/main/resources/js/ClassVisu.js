

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


        this.group.dblclick(
            function(event) {
                var zoom = new VisuZoomClass(JSONObject);
                zoom.draw(event.layerX,event.layerY-20);
            },
            function() {}
        );
    }

    this.addLines = function () {
        var line = this.JSONObject.transformation;

        for(var i = 0; i < line.length; i++) {
            var notCompile = 0, failTest = 0, sosie = 0;
            var transformations = line[i].trans;
            for(var j = 0; j < transformations.length; j++) {
                var trans = transformations[j];
                if(filter(trans)) {
                    notCompile += trans.notCompile;
                    failTest += trans.failTest;
                    sosie += trans.sosie;
                }
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
}

function VisuZoomClass(JSONObject) {
    this.JSONObject = JSONObject;
    this.group = paper.g();
    this.height; //hauteur
    this.width = classWidth * 2; //largeur

    this.draw = function (x, y) {
        this.height = this.JSONObject.transformation.length * 10 + 14;

        var rect = paper.rect(0, 0, this.width, this.height + claseeNameSize, 5, 5);
        rect.attr({class: "zoomClass"});
        this.group.add(rect);
        this.addText();
        this.addLines();
        this.translate(x, y);
        this.addClose();
    }

    this.addLines = function () {
        var line = this.JSONObject.transformation;
        var position = 10;
        for(var i = 0; i < line.length; i++) {
            var notCompile = 0, failTest = 0, sosie = 0;
            var transformations = line[i].trans;
            for(var j = 0; j < transformations.length; j++) {
                var trans = transformations[j];
                if(filter(trans)) {
                    notCompile += trans.notCompile;
                    failTest += trans.failTest;
                    sosie += trans.sosie;
                }
            }
            this.drawLine(notCompile,failTest,sosie,position, line[i].id);

            position += 10;
        }
    }

    this.drawLine = function (notCompile,failTest,sosie,position, id) {
        var sum = notCompile + failTest + sosie;
        if (sum == 0)
            return;

        var lengthNotCompile = (notCompile / sum) * this.width;
        var lengthFailTest = (failTest / sum) * this.width;
        var lengthSosie = (sosie / sum) * this.width;

        var lineNC = paper.rect(
            2,
            position + claseeNameSize,
            lengthFailTest + lengthSosie == 0 ? this.width - 4 : lengthNotCompile,
            8 );
        lineNC.attr({class: "notCompile"});

        this.group.add(lineNC);

        var lineFT = paper.rect(
            lengthNotCompile == 0 ? 2 : lengthNotCompile,
            position + claseeNameSize,
            lengthNotCompile + lengthSosie == 0 ? this.width - 4 : lengthFailTest,
            8 );
        lineFT.attr({class: "testFail"});
        this.group.add(lineFT);

        var lineGT = paper.rect(
            lengthNotCompile + lengthFailTest == 0 ? 2 : lengthFailTest + lengthNotCompile,
            position + claseeNameSize,
            lengthNotCompile + lengthFailTest == 0 ? this.width - 4 : lengthSosie - 2,
            8 );
        lineGT.attr({class: "sosie"});
        this.group.add(lineGT);

        var handler = this.getHandlerDetail(id);

        lineNC.click(handler);
        lineFT.click(handler);
        lineGT.click(handler);
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
        this.group.transform("T" + x + "," + y);
    }

    this.addClose = function(rect) {
        this.group.dblclick(function(){
            this.remove();
        } );
    }

    this.getHandlerDetail = function(id) {
        var handler = function() {
            var ws = new WebSocket("ws://" + ws_host + ":" + ws_port + "/" + ws_path );

            ws.onopen = function () {
                ws.send(JSON.stringify({request: "jsonObject", file: dataDir + "/visu_"+id+".json"}));
            };

            ws.onmessage = function (event) {
                var message = JSON.parse(event.data);
                if (message.request == "jsonObject") {
                    var data = message.object;

                    $('#myModalTitle').empty();
                    $('#myModalTitle').append(data.package+'.'+data.class+':'+data.position+"<br> notCompile: "+ data.notCompile + ", failTest: "+data.failTest+ ", sosie: "+data.sosie);
                    $('#myList li').remove();

                    var transformation = data.transformation;
                    for(var i = 0; i < transformation.length; i++) {
                        var trans = transformation[i];
                        if(filter(trans)) {
                            $('#myList').append('<li class="list-group-item">type: '+transformation[i].type+', name: '+transformation[i].name+', status: '+transformation[i].status+
                                '<pre class="prettyprint lang-java">'+transformation[i].string+'</pre></li>');
                        }
                    }

                    $('#myModal').modal('show');
                    prettyPrint();
                }
            };
        };
        return handler;
    }
}

filter = function(transformation) {
    var name = transformation.name;
    return (random  &  (name == "addRandom" || name == "replaceRandom"))
        || (reaction  &  (name == "addReaction" || name == "replaceReaction"))
        || (wittgenstein  &  (name == "addWittgenstein" || name == "replaceWittgenstein"))
        || (steroid  & (name == "delete" || name == "add" || name == "replace"))
        || (mutation  & transformation.type == "mutation")
        || (cvl  & transformation.type == "cvl")
        || true;
}