/**
 * 
 */

window.onload = function() {
	  var map = new ol.Map({
	        target: 'map',
	        layers: [
	          new ol.layer.Tile({
	            source: new ol.source.OSM()
	          })
	        ],
	        view: new ol.View({
	          center: ol.proj.transform([108.93, 34.27], 'EPSG:4326', 'EPSG:3857'),
	          zoom: 5
	        })
      });
};