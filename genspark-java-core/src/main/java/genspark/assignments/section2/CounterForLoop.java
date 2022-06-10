package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CounterForLoop implements Assignment {
    public String solution(int count) {

        String count1="";

        for (int i = count; i >= 0;--i){
        count1+=i;

    }
        return count1;
    }
}











