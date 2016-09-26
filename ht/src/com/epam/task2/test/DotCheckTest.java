package com.epam.task2.test;

import com.epam.task2.data.Graph;
import com.epam.task2.logic.DotCheck;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Лыско on 25.09.2016.
 */
public class DotCheckTest {

    @DataProvider(name = "dot")
    public static Object[][] dot() {
        return new Object[][]{
                {4.0, 2.5, true},
                {-5.0, 5.0, true},
                {7.0, -3.0, true},
                {6.0, 5.0, false},
                {-5.5, -5.5, false}
        };
    }

    @Test(dataProvider = "dot")
    public void testDotBelongsToGraph(double x, double y, boolean expected) throws Exception {
        Graph graph = new Graph(5.0, -5.0, 10.0, 14.0); //y(-5, 5) xTop(-5,5) xBottom(-7,7)
        Assert.assertEquals(DotCheck.dotBelongsToGraph(graph, x, y),expected);
    }

}