<!-- chart.jsp-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <script type="text/javascript">
        window.onload = function() {

            var dps = [ [] ];
            var chart = new CanvasJS.Chart("chartContainer", {
                animationEnabled : true,
                theme : "light2", // "light1", "dark1", "dark2"
                title : {
                    text : "Deforestation in Brazilian Amazon"
                },
                axisY : {
                    title : "Annual Forest Loss (in sq. km)",
                    labelFormatter : addSymbols
                },
                data : [ {
                    type : "area",
                    markerSize : 0,
                    yValueFormatString : "#,##0 sq. km",
                    dataPoints : dps[0]
                } ]
            });

            var yValue;
            var label;

            <c:forEach items="${areaDataPointsList}" var="dataPoints" varStatus="loop">
            <c:forEach items="${dataPoints}" var="dataPoint">
            yValue = parseFloat("${dataPoint.y}");
            label = "${dataPoint.label}";
            dps[parseInt("${loop.index}")].push({
                label : label,
                y : yValue,
            });
            </c:forEach>
            </c:forEach>

            chart.render();

            function addSymbols(e) {
                var suffixes = [ "", "K", "M", "B" ];

                var order = Math.max(
                    Math.floor(Math.log(e.value) / Math.log(1000)), 0);
                if (order > suffixes.length - 1)
                    order = suffixes.length - 1;

                var suffix = suffixes[order];
                return CanvasJS.formatNumber(e.value / Math.pow(1000, order)) + suffix;
            }

        }
    </script>
</head>
<body>
<div id="chartContainer" style="height: 370px; width: 100%;"></div>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
</body>
</html>