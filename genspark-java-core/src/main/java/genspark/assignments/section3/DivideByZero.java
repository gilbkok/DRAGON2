package genspark.assignments.section3;

import genspark.assignments.Assignment;

public class DivideByZero implements Assignment {
    public Object solution(int one, int two) {

        try {
            int z = 0;
            z += one / two;

            return z;

        } catch (ArithmeticException e) {
            System.out.print(e.getMessage());
        }
        return "Caught Exception: Divide by zero";
    }
}