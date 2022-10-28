package com.prontera.algorithms.controller.output;

import com.prontera.algorithms.entity.TargetRunner;
import com.prontera.algorithms.entity.algorithm.Algorithm;
import com.prontera.algorithms.entity.algorithm.SortingAlgorithm;
import com.prontera.algorithms.entity.util.MeasuredExecution;
import com.prontera.algorithms.entity.util.TimeMeter;

import java.util.Arrays;

public class Response {
    private String input;
    private String output;
    private Double executionTime;
    private Integer numberOfExecutions;
    private TargetRunner target;

    private Response() {
    }

    public Double getExecutionTime() {
        return executionTime;
    }

    public Integer getNumberOfExecutions() {
        return numberOfExecutions;
    }

    public String getInput() {
        return input;
    }

    public String getOutput() {
        return output;
    }

    public Object getTarget() {
        return target;
    }

    public static class Builder implements StepA, StepB {

        private Integer[] input;
        private TargetRunner<Integer[]> targetFunction;
        private Integer numberOfExecutions = 10;

        public static StepA with() {
            return new Builder();
        }

        @Override
        public StepB withTargetFunction(TargetRunner<Integer[]> targetFunction) {
            this.targetFunction = targetFunction;
            return this;
        }

        @Override
        public Builder withInput(Integer[] input) {
            this.input = input; // validate input
            return this;
        }

        public Builder withNumberOfExecutions(Integer numberOfExecutions) {
            this.numberOfExecutions = numberOfExecutions; // validate number of  executions
            return this;
        }

        public Response build() {
            Response response = new Response();
            response.target = targetFunction;
            response.numberOfExecutions = numberOfExecutions;
            response.input = Arrays.toString(input);

            MeasuredExecution<Integer[]> measuredExecution =
                    TimeMeter.measureFunction(targetFunction.runner(input.clone()), numberOfExecutions);
            response.executionTime = measuredExecution.getDuration();
            response.output = Arrays.toString(measuredExecution.getResult());

            return response;
        }
    }

    public interface StepA {
        StepB withTargetFunction(TargetRunner<Integer[]> targetFunction);
    }

    public interface StepB {
        Builder withInput(Integer[] input);
    }
}

