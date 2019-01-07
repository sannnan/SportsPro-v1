package com.sportspro.respository.dao;

import com.sportspro.model.dataModel.CanvasjsLiveChartData;

import java.util.List;
import java.util.Map;

public class DefaultCanvasjsLiveChartDao implements CanvasjsLiveChartDao {

    @Override
    public List<List<Map<Object, Object>>> getCanvasjsLiveChartData() {
        return CanvasjsLiveChartData.getCanvasjsDataList();
    }
}
