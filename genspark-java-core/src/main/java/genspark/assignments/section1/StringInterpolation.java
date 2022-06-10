package genspark.assignments.section1;

import genspark.assignments.Assignment;

public class StringInterpolation implements Assignment {
    public String solution(String str){
        String originalString=str;
        String newString= originalString.replace("%s","INSERTED");

        return (newString);
    }
}
