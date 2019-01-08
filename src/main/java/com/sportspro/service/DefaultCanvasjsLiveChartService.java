package com.sportspro.service;

import com.sportspro.respository.dao.CanvasjsLiveChartDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class DefaultCanvasjsLiveChartService implements CanvasjsLiveChartService {
    @Autowired
    private CanvasjsLiveChartDao canvasjsLiveChartDao;

    @Override
    public List<List<Map<Object, Object>>> getCanvasjsLiveChartData() {
        return canvasjsLiveChartDao.getCanvasjsLiveChartData();
    }
}
