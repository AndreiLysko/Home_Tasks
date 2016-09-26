package com.epam.task2.logic;

import com.epam.task2.data.Graph;

/**
 * Created by Лыско on 25.09.2016.
 */
public class DotCheck {

    public static boolean dotBelongsToGraph(Graph graph, double x, double y) {
        if (y <= graph.getyPositive() && y >= 0) {
            if (x <= graph.getxWidthTop() / 2) {
                return true;
            }
        }
        if (y >= graph.getyNegative() && y <= 0) {
            if (x <= graph.getxWidhtBottom() / 2) {
                return true;
            }
        }
        return false;
    }
}
