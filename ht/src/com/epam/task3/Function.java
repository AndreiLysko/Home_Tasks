package com.epam.task3;

/**
 * Created by Andrei_Lysko on 9/20/2016.
 */
public class Function {

    public static void calculate(double a, double b, double step) {
        for (double i = a; i <= b; i = i + step) {
            System.out.print(i + "  ");
            System.out.println(Math.tan(i));
        }
    }

}
