package genspark.assignments.section2;

import genspark.assignments.Assignment;

import java.util.Arrays;

public class MeanMedian implements Assignment {
    public String solution(int a, int b, int c) {
        Integer[] input = {a, b, c};
        Arrays.sort(input);
        // Mean
        Integer sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }
        double mean = sum / input.length;

        //Median
        int middle = input.length / 2;
        double median;
        if (input.length % 2 == 1) {
            median = input[middle];
        } else {
            median = (input[middle - 1] + input[middle]) / 2.0;
        }
        return String.valueOf(mean) + String.valueOf(median);
    }
}