package com.epam.rd.autotasks.arithmeticexpressions;


public class Expressions {

    public static Variable var(String name, int value) {
        return new Variable(name,value);
    }

    public static Expression val(int value) {
        Expression expression = new Expression() {
            @Override
            public int evaluate() {
                return value;
            }
            @Override
            public String toExpressionString() {
                String stringValue = String.valueOf(value);
                if (value>0){
                    return  stringValue;
                }else {
                    return "("+stringValue+")";
                }
            }
        };
        return expression;
    }

    public static Expression sum(Expression... members){
        Expression expressionSum = new Expression(){
            @Override
            public int evaluate() {
                int sumValues=0;
                for (Expression value: members) {

                }
            }

            @Override
            public String toExpressionString() {
                return null;
            }
        };
        return expressionSum;
    }

    public static Expression product(Expression... members){
        Expression expression = new Expression(){
            @Override
            public int evaluate() {
                return 0;
            }

            @Override
            public String toExpressionString() {
                return null;
            }
        };
        return expression;
    }

    public static Expression difference(Expression minuend, Expression subtrahend){
        //implement this method
        return null;
    }

    public static Expression fraction(Expression dividend, Expression divisor){
        //implement this method
        return null;
    }

}
