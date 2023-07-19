package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    private double a;
    private double b;
    private double c;
    private String  expected;
    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.expected=expected;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> casesParameters (){
        return Arrays.asList(new Object[][]{
                {2,5,-3,"0.5 -3.0"},
                {1, -3, 1, "2.618033988749895 0.3819660112501051"},
                {2, -38, 156, "13.0 6.0"},
                {-0.5, 34, 1046.5,"-23.0 91.0"}
        });
    }

    @Test
    public void testTwoRootsCase() {
        String[] expectedValues =expected.split(" ");
        String  result = quadraticEquation.solve(a,b,c);
        assertTrue(result.contains(expectedValues[0])&&result.contains(expectedValues[1]));
    }
}
