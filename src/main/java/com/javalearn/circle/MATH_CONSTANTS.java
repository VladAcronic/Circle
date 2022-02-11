package com.javalearn.circle;

public enum MATH_CONSTANTS {
    FLT_EPSILON (0.0001);

    private final double EPSILON;

    MATH_CONSTANTS (double EPSILON) {
        this.EPSILON = EPSILON;
    }
    public double getFLT_EPSILON(){
        return EPSILON;
    }
}
