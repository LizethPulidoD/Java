package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationZeroACasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    private double a;
    private double b;
    private double c;
    public QuadraticEquationZeroACasesTesting(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> casesParameters (){
        return Arrays.asList(new Object[][]{
                {0,5,-3},
                {0, -3, 1},
                {0, -38, 156},
                {0, 34, 1046.5}
        });
    }

    @Test (expected = IllegalArgumentException.class)
    public void testTwoRootsCase() {
    quadraticEquation.solve(a,b,c);
    }

}
