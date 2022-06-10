package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAStringWhileLoop implements Assignment {
    public String solution(String str) {
        String reverse= "";
        int i=str.length();
        while(i-1>=0) {
            --i;
            reverse += str.charAt(i);
        }

            return reverse ;
        }

    }