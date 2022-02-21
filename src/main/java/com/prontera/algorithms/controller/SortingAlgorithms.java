package com.prontera.algorithms.controller;

import com.prontera.algorithms.entity.Algorithm;
import com.prontera.algorithms.entity.MergeSortAlgorithm;
import com.prontera.algorithms.entity.QuickSortAlgorithm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SortingAlgorithms {

    @GetMapping("/quick-sort")
    public Algorithm quickSortHelp(){
        return new QuickSortAlgorithm();
    }

    @PostMapping("/quick-sort")
    public Integer[] quickSortRun(@RequestBody Integer[] array){
        return new QuickSortAlgorithm().run(array);
    }

    @GetMapping("/merge-sort")
    public Algorithm mergeSortHelp(){
        return new MergeSortAlgorithm();
    }
}
