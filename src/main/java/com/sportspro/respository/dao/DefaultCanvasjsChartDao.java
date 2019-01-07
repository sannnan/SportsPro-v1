package com.sportspro.respository.dao;

import com.sportspro.model.dataModel.CanvasjsChartData;

import java.util.List;
import java.util.Map;

public class DefaultCanvasjsChartDao implements CanvasjsChartDao {
    @Override
    public List<List<Map<Object, Object>>> getCanvasjsChartData() {
        return CanvasjsChartData.getAreaChartData();
    }
}
