package genspark.assignments.section2;

import genspark.assignments.Assignment;

import java.util.Scanner;

public class TypeConversion implements Assignment {
    public int solution(Object object) {

        System.out.println("type number or text : ");
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        try {
            int N = Integer.parseInt(s);
           return N;

        }catch (NumberFormatException ex){


       return Integer.parseInt(s);
    }

    }}

