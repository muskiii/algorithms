package com.prontera.algorithms.entity.util;

import java.util.function.Supplier;

public final class TimeMeter {

    private TimeMeter() {
        throw new IllegalStateException("Utility class");
    }

    public static <T> MeasuredExecution<T> measureFunction(Supplier<T> supplier, Integer numberOfExecutions){
        /*
        * This function run a given lambda, measure the execution time and calculate the Mean time
        */
        if (numberOfExecutions < 1) {
            throw new IllegalArgumentException("the minimum number of execution has to be at least 1");
        }

        T response = null;
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            response = supplier.get();
        }
        long elapsedTime = (System.nanoTime() - startTime) / numberOfExecutions;

        return new MeasuredExecution<>(elapsedTime, response);
    }
}
