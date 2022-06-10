package genspark.assignments.section2;

import com.googlecode.concurrenttrees.common.CharSequences;
import genspark.assignments.Assignment;

public class FirstAndLast implements Assignment {
    public boolean solution(String word) {
        int length;
        String result = "";
        char[] characters = word.toCharArray();
        if (characters.length > 1) {
            return characters[0] == characters[characters.length - 1];

        }
        return true;
    }
}
