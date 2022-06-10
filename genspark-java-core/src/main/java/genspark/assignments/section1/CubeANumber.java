package genspark.assignments.section1;

import genspark.assignments.Assignment;

import static org.apache.commons.math3.util.ArithmeticUtils.pow;

public class CubeANumber implements Assignment {
    public int solution(int x){
        int z=pow(x,3);
        return z;
    }
}
