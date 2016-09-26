package com.epam.task4.logic;

import com.epam.task4.data.Massive;

public class Runner {

    public static void main(String[] args) {
        Massive mas = new Massive();
        mas.setSizeOfMassive(Input.countOfNumbers());
        mas.setMassive(Input.randomIntegers(mas.getSizeOfMassive()));
        MassiveCheck.drawMassive(mas);
        MassiveCheck.checkPrimes(mas);
        System.out.println();
        for (int i = 0; i < mas.getPrimeIndexes().length; i++){
            System.out.println(mas.getPrimeIndexes()[i]);
        }
        MassiveCheck.typeIndexes(mas);
    }
}
