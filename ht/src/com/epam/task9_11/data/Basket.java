package com.epam.task9_11.data;

import java.util.ArrayList;

/**
 * Created by Andrei_Lysko on 9/22/2016.
 */
public class Basket {

    private ArrayList<Ball> stuff;
    private double weight;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setStuff(ArrayList<Ball> stuff) {
        this.stuff = stuff;
    }

    public ArrayList<Ball> getStuff() {
        return stuff;
    }
}
