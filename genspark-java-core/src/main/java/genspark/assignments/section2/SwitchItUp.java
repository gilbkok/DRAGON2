package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class SwitchItUp implements Assignment {
    public String solution(int x) {
        int i=x;
        String z= "zero";
        switch(i){
            case 1:
               z="one";
                break;
            case 2:
                z="two";
                break;
            case 3:
                z="three";
                break;
            case 4:
               z="four";
                break;
            case 5:
                z="five";
                break;
        }
        return z;
    }
}
