package genspark.assignments.section1;

import genspark.assignments.Assignment;

import static org.apache.commons.math3.util.ArithmeticUtils.pow;

public class SquareANumber implements Assignment {
    public int solution(int x){
        int z=pow(x,2);
        return z;
    }
}
