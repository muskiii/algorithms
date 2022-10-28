package com.prontera.algorithms.entity.util;

public class MeasuredExecution<T> {
    private final Long duration;
    private final T result;

    public MeasuredExecution(Long duration, T result) {
        this.duration = duration;
        this.result = result;
    }

    public Double getDuration() {
        return duration / 1000000d;
    }

    public T getResult() {
        return result;
    }

}
