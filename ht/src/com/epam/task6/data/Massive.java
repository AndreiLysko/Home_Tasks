package com.epam.task6.data;

/**
 * Created by Andrei_Lysko on 9/22/2016.
 */
public class Massive {

    private double data[];
    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setData(double[] data) {
        this.data = data;
    }

    public double[] getData() {
        return data;
    }
}
