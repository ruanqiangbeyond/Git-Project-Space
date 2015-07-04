<!doctype html>
<html lang="en">
  <head>
    <link rel="stylesheet" href="../OL3/css/ol.css" type="text/css">
    <link rel="stylesheet" href="../resources/main.css" type="text/css">
    <script src="../OL3/resources/jquery.min.js" type="text/javascript"></script>
    <script src="../OL3/build/ol-debug.js" type="text/javascript"></script>
    <title>Quick study OL3</title>
  </head>
  <body>
    <div id="map" class="map"></div>
    <script type="text/javascript">
      var map = new ol.Map({
        target: 'map',
        layers: [
          new ol.layer.Tile({
            source: new ol.source.MapQuest({layer: 'sat'})
          })
        ],
        view: new ol.View({
          center: ol.proj.transform([108.56, 39.45], 'EPSG:4326', 'EPSG:900913'),
          zoom: 10
        })
      });
    </script>
  </body>
</html>