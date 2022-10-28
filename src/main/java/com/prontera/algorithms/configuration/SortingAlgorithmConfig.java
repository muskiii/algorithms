package com.prontera.algorithms.configuration;

import com.prontera.algorithms.entity.algorithm.MergeSortAlgorithm;
import com.prontera.algorithms.entity.algorithm.QuickSortAlgorithm;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SortingAlgorithmConfig {
    @Bean
    public QuickSortAlgorithm quickSortAlgorithm(){
        return new QuickSortAlgorithm();
    }
    @Bean
    public MergeSortAlgorithm mergeSortAlgorithm(){
        return new MergeSortAlgorithm();
    }

}
