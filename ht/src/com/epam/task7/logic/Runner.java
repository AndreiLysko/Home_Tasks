package com.epam.task7.logic;

import com.epam.task7.data.Massive;

public class Runner {

    public static void main(String[] args) {

        Massive mas = new Massive();
        if (Check.integerPositive(args[0])) {
            mas.setData(Input.randomIntegers(Integer.parseInt(args[0])));
        } else {
            System.out.println("Incorrect argument for length (must be positive integer)");
            System.exit(99);                                                                //err code for incorrect input
        }
        Sorter sorter = new Sorter();
        sorter.showResult(sorter.sort(mas.getData()));
    }
}
