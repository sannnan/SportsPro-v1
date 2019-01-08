package com.sportspro.controller;

import com.sportspro.service.CanvasjsChartService;
import com.sportspro.service.CanvasjsPieChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class PieChartController {

    @Autowired
    private CanvasjsChartService canvasjsChartService;
    @Autowired
    private CanvasjsPieChartService canvasjsPieChartService;

    @GetMapping("/piechart")
    public String charts(ModelMap modelMap) {
        modelMap.addAttribute("page", "piechart");
        loadPieChartData(modelMap);
        return "home";
    }

    private void loadPieChartData(ModelMap modelMap) {
        List<List<Map<Object, Object>>> canvasjsDataList = canvasjsPieChartService.getCanvasjsChartData();
        modelMap.addAttribute("pieDataPointsList", canvasjsDataList);
    }

}