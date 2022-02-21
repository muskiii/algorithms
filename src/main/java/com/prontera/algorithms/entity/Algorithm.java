package com.prontera.algorithms.entity;

public abstract class Algorithm {
    private final String name;
    private final String description;
    private final String complexity;

    public Algorithm(String name, String description, String complexity) {
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

    public abstract Integer[] run(Integer[] input);
}
