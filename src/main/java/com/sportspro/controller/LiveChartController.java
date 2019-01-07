package com.sportspro.controller;

import com.sportspro.services.CanvasjsLiveChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class LiveChartController {

    @Autowired
    private CanvasjsLiveChartService canvasjsLiveChartService;


    @GetMapping("/livechart")
    public String list(ModelMap modelMap) {
        modelMap.addAttribute("page", "livechart");
        loadAreaChartData(modelMap);
        return "home";
    }

    private void loadAreaChartData(ModelMap modelMap) {
        List<List<Map<Object, Object>>> canvasjsLiveDataList = canvasjsLiveChartService.getCanvasjsLiveChartData();
        modelMap.addAttribute("liveDataPointsList", canvasjsLiveDataList);
    }
}
