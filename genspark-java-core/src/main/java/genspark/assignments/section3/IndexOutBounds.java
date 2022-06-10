package genspark.assignments.section3;

import genspark.assignments.Assignment;

public class IndexOutBounds implements Assignment {
    public Object solution(int[] array, int index) {

        try{
            int[] myArr = array;
            return myArr[index];
        } catch (Exception e) {

        }
        return "Caught Exception: Index Out of Bounds.";
    }
}
