package com.sportspro.respository.dao;

import com.sportspro.model.dataModel.CanvasjsPieChartData;

import java.util.List;
import java.util.Map;

public class DefaultCanvasjsPieChartDao implements CanvasjsPieChartDao {
    @Override
    public List<List<Map<Object, Object>>> getCanvasjsPieChartData() {
        return CanvasjsPieChartData.getCanvasjsPieChartData();
    }
}
