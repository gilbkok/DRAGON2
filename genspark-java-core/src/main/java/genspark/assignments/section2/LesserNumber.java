package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class LesserNumber implements Assignment {
    public int solution(int x, int y) {
        int z=x-y;
        if (z<0){
            return x;
        } else {return y;}
    }}
