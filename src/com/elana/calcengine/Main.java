package com.elana.calcengine;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('a', 200.0d, 50.0d);
        equations[1] = new MathEquation('s', 40.0d, 120.0d);
        equations[2] = new MathEquation('d', 320.0d, 10.0d);
        equations[3] = new MathEquation('m', 50.0d, 90.0d);

        for (MathEquation equation: equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }
    }
}
