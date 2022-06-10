package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class IncrementWhileLoop implements Assignment {
    public String solution(int from, int to) {
        int increment = 0;
        String y = "";
        for (int i = from; i <= to; i++) {
            y += String.valueOf(i);
        }
        return y;
    }
}
