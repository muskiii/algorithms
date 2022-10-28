package com.prontera.algorithms.entity;

import java.util.function.Supplier;

public interface TargetRunner<T> {
    Supplier<T> runner(Integer[] input);
}
