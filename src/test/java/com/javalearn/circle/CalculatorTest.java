package com.javalearn.circle;


import com.javalearn.circle.entity.Circle;
import com.javalearn.circle.entity.CoordinateAxes;
import com.javalearn.circle.entity.Point;
import com.javalearn.circle.logic.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private final double FLT_EPSILON = com.javalearn.circle.MATH_CONSTANTS.FLT_EPSILON.getFLT_EPSILON();
    Point testPoint = new Point(0.1, 0.2);
    Circle testCircle = new Circle(testPoint, 1.5);

    @Test
    public void testCalculateArea (){
        //given

        //when
        double circleAreaCalculated = Calculator.calculateArea (testCircle);

        //then
        Assert.assertEquals(7.0686, circleAreaCalculated, FLT_EPSILON);
    }

    @Test
    public void testIsCircleWhenRadiusPositive (){
        //given
        Point testPoint = new Point(0.1, 0.2);
        double validRadius = 1.5;

        //when
        boolean checkResult = Calculator.isCircle(testPoint, validRadius);

        //then
        Assert.assertTrue(checkResult);
    }

    @Test
    public void testIsCircleWhenRadiusZero (){
        //given
        double invalidRadius = 0;

        //when
        boolean checkResult = Calculator.isCircle(testPoint, invalidRadius);

        //then
        Assert.assertFalse (checkResult);
    }

    @Test
    public void testIsCircleWhenRadiusNegative (){
        //given
        double invalidRadius = -1.5;

        //when
        boolean checkResult = Calculator.isCircle(testPoint, invalidRadius);

        //then
        Assert.assertFalse (checkResult);
    }

    @Test
    public void testIsCrossingAreaOnDistanceByXAxisWhenPositive(){
        //given
        Point testPoint = new Point(10.0, 1.0);
        Circle testCircle = new Circle(testPoint, 2.0);
        double distance = 1.0;

        //when
        boolean checkResult = Calculator.isCrossingAreaOnDistance(testCircle, distance, CoordinateAxes.X_AXIS);

        //then
        Assert.assertTrue(checkResult);
    }
    @Test
    public void testIsCrossingAreaOnDistanceByYAxisWhenPositive(){
        //given
        Point testPoint = new Point(1.0, 10.0);
        Circle testCircle = new Circle(testPoint, 2.0);
        double distance = 1.0;

        //when
        boolean checkResult = Calculator.isCrossingAreaOnDistance(testCircle, distance, CoordinateAxes.Y_AXIS);

        //then
        Assert.assertTrue(checkResult);
    }

    @Test
    public void testIsCrossingAreaOnDistanceByXAxisWhenNegative(){
        //given
        Point testPoint = new Point(10.0, 1.0);
        Circle testCircle = new Circle(testPoint, 2.0);
        double distance = 1.5;

        //when
        boolean checkResult = Calculator.isCrossingAreaOnDistance(testCircle, distance, CoordinateAxes.X_AXIS);

        //then
        Assert.assertFalse(checkResult);
    }
    @Test
    public void testIsCrossingAreaOnDistanceByYAxisWhenNegative(){
        //given
        Point testPoint = new Point(1.0, 10.0);
        Circle testCircle = new Circle(testPoint, 2.0);
        double distance = 1.5;

        //when
        boolean checkResult = Calculator.isCrossingAreaOnDistance(testCircle, distance, CoordinateAxes.Y_AXIS);

        //then
        Assert.assertFalse(checkResult);
    }
}

