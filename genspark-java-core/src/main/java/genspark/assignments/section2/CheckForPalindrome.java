package genspark.assignments.section2;

import genspark.assignments.Assignment;

import static org.apache.commons.lang3.StringUtils.reverse;

public class CheckForPalindrome implements Assignment {
    public boolean solution(String pally) {
        String reverse = reverse(pally);
        if (pally.equals(reverse)) {
            return true;
        }
        return false;
    }
}