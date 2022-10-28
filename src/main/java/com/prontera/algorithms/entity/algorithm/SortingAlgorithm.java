package com.prontera.algorithms.entity.algorithm;

import java.util.function.Supplier;

public abstract class SortingAlgorithm implements Algorithm<Integer[], Integer[]> {
    private final String name;
    private final String description;
    private final String complexity;

    protected SortingAlgorithm(String name, String description, String complexity) {
        this.name = name;
        this.description = description;
        this.complexity = complexity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getComplexity() {
        return complexity;
    }

    public Supplier<Integer[]> runner(Integer[] array){
        return () -> run(array);
    }
}
