package com.sportspro.model.dataModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CanvasjsChartData {

    static Map<Object, Object> map = null;
    static List<List<Map<Object, Object>>> list = new ArrayList<>();
    static List<Map<Object, Object>> dataPoints1 = new ArrayList<>();

    static {
        map = new HashMap<Object, Object>();
        map.put("label", "1988");
        map.put("y", 21050);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "1989");
        map.put("y", 17770);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "1990");
        map.put("y", 13730);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "1991");
        map.put("y", 11030);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "1992");
        map.put("y", 13786);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "1993");
        map.put("y", 14896);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "1994");
        map.put("y", 14896);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "1995");
        map.put("y", 29059);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "1996");
        map.put("y", 18161);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "1997");
        map.put("y", 13227);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "1998");
        map.put("y", 17383);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "1999");
        map.put("y", 17259);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "2000");
        map.put("y", 18226);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "2001");
        map.put("y", 18165);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "2002");
        map.put("y", 21651);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "2003");
        map.put("y", 25396);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "2004");
        map.put("y", 27772);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "2005");
        map.put("y", 19014);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "2006");
        map.put("y", 14285);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "2007");
        map.put("y", 11651);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "2008");
        map.put("y", 12911);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "2009");
        map.put("y", 7464);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "2010");
        map.put("y", 7000);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "2011");
        map.put("y", 6418);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "2012");
        map.put("y", 4571);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "2013");
        map.put("y", 5891);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "2014");
        map.put("y", 5012);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "2015");
        map.put("y", 6207);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "2016");
        map.put("y", 7893);
        dataPoints1.add(map);
        map = new HashMap<Object, Object>();
        map.put("label", "2017");
        map.put("y", 6624);
        dataPoints1.add(map);

        list.add(dataPoints1);
    }

    public static List<List<Map<Object, Object>>> getCanvasjsDataList() {
        return list;
    }
}