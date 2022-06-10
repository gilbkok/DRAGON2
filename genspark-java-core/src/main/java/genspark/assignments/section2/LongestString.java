package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class LongestString implements Assignment {
    public String solution(String firstWord, String secondWord) {
        int z=firstWord.length()-secondWord.length();
        if(z<=0){
        return secondWord;}
        else {return firstWord;}
    }
}
