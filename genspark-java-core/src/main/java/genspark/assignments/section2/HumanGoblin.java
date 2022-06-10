package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class HumanGoblin implements Assignment {
    public String solution(String str) {
        if (str == "goblin"){
        return "Attack the Goblin!";} else if (str=="human") {
            return "You aRe one of us!";

        }
        return null;
    }
}
