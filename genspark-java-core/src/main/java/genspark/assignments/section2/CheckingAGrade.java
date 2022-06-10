package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CheckingAGrade implements Assignment {
    public String solution(int grade) {
        if (grade < 70) {
            return "FAILURE";
        } else if (grade <= 79) {
            return "C";
        } else if (grade <= 89) {
            return "B";
        } else if (grade >= 90) {
            return "A";
        }
        return null;
    }
}
