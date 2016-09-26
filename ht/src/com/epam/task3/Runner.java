package com.epam.task3;

public class Runner {

    public static void main(String[] args) {

        for (int i = 0; i <= 1; i++) {
            if (!Check.doubleNumber(args[i])) {
                System.out.println("Incorrectly inputted number " + i + 1 + " (must be double like -6.9");
                System.exit(99);                //err code for incorrect input
            }
        }
        if (!Check.integerPositive(args[2])){
            System.out.println("Incorrectly inputed step " + args[2] + " (must be integer >=1");
            System.exit(99);
        }
        System.out.println("Interval : [" + args[0] + "," + args[1] + "] Step : " + args[2]);
        Function.calculate(Double.valueOf(args[0]), Double.valueOf(args[1]), Double.valueOf(args[2]));
    }
}
