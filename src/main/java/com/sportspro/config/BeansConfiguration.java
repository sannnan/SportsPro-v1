package com.sportspro.config;

import com.sportspro.respository.dao.*;
import com.sportspro.services.*;
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

    @Bean
    public CanvasjsPieChartService canvasjsPieChartService() {
        return new DefaultCanvasjsPieChartService();
    }

    @Bean
    public CanvasjsPieChartDao canvasjsPieChartDao() {
        return new DefaultCanvasjsPieChartDao();
    }

    @Bean
    public CanvasjsLiveChartService canvasjsLiveChartService() {
        return new DefaultCanvasjsLiveChartService();
    }

    @Bean
    public CanvasjsLiveChartDao canvasjsLiveChartDao() {
        return new DefaultCanvasjsLiveChartDao();
    }


}