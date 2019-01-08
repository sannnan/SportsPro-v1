package com.sportspro.service;

import com.sportspro.respository.dao.CanvasjsPieChartDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class DefaultCanvasjsPieChartService implements CanvasjsPieChartService {

    @Autowired
    private CanvasjsPieChartDao canvasjsChartDao;

//    public void setCanvasjsChartDao(CanvasjsChartDao canvasjsChartDao) {
//        this.canvasjsChartDao = canvasjsChartDao;
//    }

    @Override
    public List<List<Map<Object, Object>>> getCanvasjsChartData() {
        return canvasjsChartDao.getCanvasjsPieChartData();
    }
}
