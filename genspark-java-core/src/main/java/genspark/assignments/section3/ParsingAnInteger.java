package genspark.assignments.section3;

import genspark.assignments.Assignment;

public class ParsingAnInteger implements Assignment {
    public Object solution(String word) {
        try {
            int number = Integer.parseInt(word);
            return number;
        } catch (NumberFormatException e) {

        }
        return "Caught Exception: Number Format Exception";
    }
}
