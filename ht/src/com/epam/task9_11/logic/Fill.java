package com.epam.task9_11.logic;

import com.epam.task9_11.data.Ball;
import com.epam.task9_11.data.Basket;
import com.epam.task9_11.data.Color;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Andrei_Lysko on 9/22/2016.
 */
public class Fill {

    private static final int RANDOM_MULTIPLIER = 50;                                // [0;50)

    public static ArrayList<Ball> dropBalls(int count) {
        ArrayList<Ball> balls = new ArrayList<>();
        Random randomizer = new Random();
        for (int i = 0; i < count; i++) {
            Ball randomBall = new Ball();
            randomBall.setWeight(Math.random() * RANDOM_MULTIPLIER);
            int kek = randomizer.nextInt(Color.values().length);
            randomBall.setColor(Color.values()[kek]);
            balls.add(randomBall);
            System.out.println(randomBall.getWeight() + " " + randomBall.getColor());  //Сделать обрезание знаков после запятой
        }
        return balls;
    }

    public static void basketIn(Basket recycleBin, ArrayList<Ball> someStuff) {
        recycleBin.setStuff(someStuff);
    }

    public static double totalWeight(Basket recycleBin) {
        double weight = 0;
        for (Ball ball : recycleBin.getStuff()) {
            weight = weight + ball.getWeight();
        }
        return weight;
    }

    public static int totalBlues(Basket recycleBin) {
        int blueBalls = 0;
        for (Ball ball : recycleBin.getStuff()) {
            if (ball.getColor() == Color.BLUE) {
                blueBalls++;
            }
        }
        return blueBalls;
    }
}
