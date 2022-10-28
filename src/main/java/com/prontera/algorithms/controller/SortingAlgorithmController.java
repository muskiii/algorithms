package com.prontera.algorithms.controller;

import com.prontera.algorithms.controller.output.Response;
import com.prontera.algorithms.entity.algorithm.MergeSortAlgorithm;
import com.prontera.algorithms.entity.algorithm.QuickSortAlgorithm;
import com.prontera.algorithms.entity.algorithm.SortingAlgorithm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SortingAlgorithmController {
    private final QuickSortAlgorithm quickSort;
    private final MergeSortAlgorithm mergeSort;

    public SortingAlgorithmController(QuickSortAlgorithm quickSort, MergeSortAlgorithm mergeSort) {
        this.quickSort = quickSort;
        this.mergeSort = mergeSort;
    }

    @GetMapping("/quick-sort")
    public SortingAlgorithm quickSortHelp(){
        return quickSort;
    }

    @PostMapping("/quick-sort")
    public Response quickSortRun(@RequestBody Integer[] array){
        return Response.Builder.with()
                .withTargetFunction(quickSort)
                .withInput(array)
                .withNumberOfExecutions(5)
                .build();
    }

    @GetMapping("/merge-sort")
    public SortingAlgorithm mergeSortHelp(){
        return mergeSort;
    }

    @PostMapping("/merge-sort")
    public Response mergeSortRun(@RequestBody Integer[] array){
        return Response.Builder.with()
                .withTargetFunction(mergeSort)
                .withInput(array)
                .withNumberOfExecutions(5)
                .build();
    }
}
