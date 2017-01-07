package com.elana.calcengine;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] leftVals = {200.0d, 40.0d, 320.0d, 50.0d};
        double[] rightVals = {50.0d, 120.0d, 10.0d, 90.0d};
        char[] opCodes = {'a', 's', 'd', 'm'};
        double[] results = new double[opCodes.length];

        for (int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'd':
                    results[i] = (rightVals[i] != 0.0d) ? (leftVals[i] / rightVals[i]) : 0.0d;
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                default:
                    System.out.println("Error - invalid opCode");
                    results[i] = 0.0d;
                    break;
            }
        }
        System.out.println(Arrays.toString(results));
    }
}
