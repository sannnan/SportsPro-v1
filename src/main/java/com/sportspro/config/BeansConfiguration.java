package com.sportspro.config;

import com.sportspro.respository.dao.CanvasjsChartDao;
import com.sportspro.respository.dao.DefaultCanvasjsChartDao;
import com.sportspro.services.CanvasjsChartService;
import com.sportspro.services.DefaultCanvasjsChartService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
    @Bean
    public CanvasjsChartService canvasjsChartService() {
        return new DefaultCanvasjsChartService();
    }

    @Bean
    public CanvasjsChartDao canvasjsChartDao() {
        return new DefaultCanvasjsChartDao();
    }
}