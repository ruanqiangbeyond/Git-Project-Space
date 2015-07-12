<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index.jsp</title>
    <link href="css/index.css" rel="stylesheet" type="text/css">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/ol3/3.7.0/ol.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="js/jquery.js" charset="utf-8"></script>
    <script type="text/javascript" src="js/ol/build/ol-debug.js" charset="utf-8"></script>
    <script type="text/javascript" src="js/index.js" charset="utf-8"></script>

</head>
<body>
    <div id="map">
        <div class="nav">
            <ul class="menu">
                <li class="item calLength">测距</li>
                <li class="item calArea">测面积</li>
                <li class="item zoneZoom">区域放大</li>
                <li class="item">X</li>
                <li class="item">Y</li>
            </ul>
        </div>

        <div id="mouse-position" class="custom-mouse-position"></div>
    </div>
</body>
</html>