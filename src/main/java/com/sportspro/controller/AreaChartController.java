package com.sportspro.controller;

import com.sportspro.services.CanvasjsChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class AreaChartController {
    @Autowired
    private CanvasjsChartService canvasjsChartService;

    @GetMapping("/areachart")
    public String list(ModelMap modelMap) {
        modelMap.addAttribute("page", "areachart");
        loadAreaChartData(modelMap);
        return "home";
    }

    private void loadAreaChartData(ModelMap modelMap) {
        List<List<Map<Object, Object>>> canvasjsDataList = canvasjsChartService.getCanvasjsChartData();
        modelMap.addAttribute("areaDataPointsList", canvasjsDataList);
    }
}
