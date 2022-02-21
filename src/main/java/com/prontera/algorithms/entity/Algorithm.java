package com.prontera.algorithms.entity;

import java.util.List;

public abstract class Algorithm {
    private final String description;
    private final String complexity;

    public Algorithm(String description, String complexity) {
        this.description = description;
        this.complexity = complexity;
    }

    public String getDescription() {
        return description;
    }

    public String getComplexity() {
        return complexity;
    }

    public abstract List<Integer> run(List<Integer> input);
}
