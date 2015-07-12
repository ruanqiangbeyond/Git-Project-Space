/**
 * Created by ruanqiang on 2015/7/12.
 */
$(function () {
    var mousePositionControl = new ol.control.MousePosition({
        coordinateFormat: ol.coordinate.createStringXY(4),
        projection: 'EPSG:4326',
        // comment the following two lines to have the mouse position  be placed within the map.
        className: 'custom-mouse-position',
        target: document.getElementById('mouse-position'),
        undefinedHTML: '&nbsp;'
    });

    var scalelinePositionControl = new ol.control.ScaleLine();

    var dragZoom =  new ol.interaction.DragZoom({
        condition: ol.events.condition.always,
        style: new ol.style.Style({
            stroke: new ol.style.Stroke({
                color: [0, 0, 255, 1]
            })
        })
    });


    var map = new ol.Map({
        view: new ol.View({
            center: ol.proj.transform([108.94311, 34.27422], 'EPSG:4326','EPSG:3857'),
            zoom: 4
        }),
        layers: [
            new ol.layer.Tile({
                source: new ol.source.OSM()
            })
        ],
        controls: ol.control.defaults({
            attributionOptions: /** @type {olx.control.AttributionOptions} */ ({
                collapsible: false
            })
        }).extend([mousePositionControl, scalelinePositionControl]),
        target: 'map'
    });

    // 区域放大
    $('li.zoneZoom').toggle(function() {
        map.addInteraction(dragZoom);
    }, function() {
        map.removeInteraction(dragZoom);
    });

    // 测距
    $('li.calLength').toggle(function() {

    }, function() {

    });

    // 测面积
    $('li.calArea').toggle(function() {

    }, function() {

    });
});