package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAnInteger implements Assignment {
    public String solution(int number) {

            String S = String.valueOf(number);
            String result = "";
            char[] characters = S.toCharArray();
            for (int i = characters.length - 1; i >= 0; i--) {
                result += characters[i];
            }
            return result;
        }
    }


