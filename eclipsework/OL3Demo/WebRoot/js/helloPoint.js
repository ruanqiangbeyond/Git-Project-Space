/**
 * Created by LaoHuTu on 2015/1/17.
 */
$(function() {
    var osmLayer = new ol.layer.Tile({
        source: new ol.source.TileJSON({
            url: 'http://api.tiles.mapbox.com/v3/mapbox.geography-class.jsonp'
        })
    });

    var pointFeature = new ol.Feature({
        geometry: new ol.geom.Point([0, 0]),
        name: 'first point',
        id: 1234
    });
   /* var style = new ol.style.Style({
        stroke: new ol.style.Stroke({
            width:10,
            color: 'green'
        })
    });
    pointFeature.setStyle(style);*/


    var pointVector = new ol.layer.Vector({
        source: new ol.source.Vector({
            features: [pointFeature]
        })
    });

    var view = new ol.View({
       center: [0, 0],
       zoom:5
    });

    var map = new ol.Map({
        layers: [osmLayer, pointVector],
        target: document.getElementById('map'),
        view: view
    });


    $(map.getViewport()).on('mousemove', function(e) {
        var pixel = map.getEventPixel(e.originalEvent);
        var hit = map.forEachFeatureAtPixel(pixel, function(feature, layer) {
            return true;
        });
        if (hit) {
            map.getTarget().style.cursor = 'pointer';
        } else {
            map.getTarget().style.cursor = '';
        }
    });
    map.on('click', function(evt) {
        var feature = map.forEachFeatureAtPixel(evt.pixel, function(feature, layer) {
            return feature;
        });
        if (feature) {
            var name = feature.values_.name;
            alert(name);
        }
    });
})