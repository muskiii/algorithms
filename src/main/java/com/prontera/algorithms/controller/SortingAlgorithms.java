package com.prontera.algorithms.controller;

import com.prontera.algorithms.entity.Algorithm;
import com.prontera.algorithms.entity.MergeSortAlgorithm;
import com.prontera.algorithms.entity.QuickSortAlgorithm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SortingAlgorithms {

    @GetMapping("/quick-sort")
    public Algorithm quickSortHelp(){
        return new QuickSortAlgorithm();
    }

    @PostMapping("/quick-sort")
    public List<Integer> quickSortRun(List<Integer> input){
        return new QuickSortAlgorithm().run(input);
    }

    @GetMapping("/merge-sort")
    public Algorithm mergeSortHelp(){
        return new MergeSortAlgorithm();
    }
}
