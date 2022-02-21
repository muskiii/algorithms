package com.prontera.algorithms;

import com.prontera.algorithms.entity.Algorithm;
import com.prontera.algorithms.entity.MergeSortAlgorithm;
import com.prontera.algorithms.entity.QuickSortAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class AlgorithmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgorithmsApplication.class, args);

		Algorithm quickSortAlgorithm = new QuickSortAlgorithm();
		System.out.println(quickSortAlgorithm.run(Arrays.asList(3,4,5,2,6,8,1,20)));
	}

}
