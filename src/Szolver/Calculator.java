package Szolver;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static List<Integer> Calculation (int original){
        List<Integer> solution = new ArrayList<Integer>();
        double ongoing = original;
        while (ongoing != 0){
            double square = java.lang.Math.sqrt(ongoing);
            double newnum = Math.pow(java.lang.Math.floor(square),2);
            solution.add((int) newnum);
            ongoing = ongoing - newnum;
        }

        return solution;
    }
}
