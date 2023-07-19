package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationSingleRootCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    private double a;
    private double b;
    private double c;
    private double expected;
    public QuadraticEquationSingleRootCasesTesting(double a, double b, double c, double expected) {
    this.a=a;
    this.b=b;
    this.c=c;
    this.expected=expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> casesParameters (){
        return Arrays.asList(new Object[][]{
                {1,-2,1,1.0},
                {1,-12,36,6.0},
                {1,-6,9,3.0},
                {1,12,36,-6.0}
        });
    }

    @Test
    public void testSingleCase() {

        assertEquals(String.valueOf(expected), quadraticEquation.solve(a, b, c));
    }
}