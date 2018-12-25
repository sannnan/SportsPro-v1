package com.sportspro.services;

import com.sportspro.respository.dao.CanvasjsChartDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class DefaultCanvasjsChartService implements CanvasjsChartService {

    @Autowired
    private CanvasjsChartDao canvasjsChartDao;

//    public void setCanvasjsChartDao(CanvasjsChartDao canvasjsChartDao) {
//        this.canvasjsChartDao = canvasjsChartDao;
//    }

    @Override
    public List<List<Map<Object, Object>>> getCanvasjsChartData() {
        return canvasjsChartDao.getCanvasjsChartData();
    }
}
