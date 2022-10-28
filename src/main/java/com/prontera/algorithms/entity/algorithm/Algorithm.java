package com.prontera.algorithms.entity.algorithm;

import com.prontera.algorithms.entity.TargetRunner;

public interface Algorithm<T, K> extends TargetRunner<T> {
    T run(K input);
}
