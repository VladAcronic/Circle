package com.javalearn.circle;

import com.javalearn.circle.entity.Point;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void testPointConstructorWhenValidData (){
        //given
        double testXCoordinate = 0.1;
        double testYCoordinate = 0.2;
        //when
        Point testPoint = new Point(testXCoordinate, testYCoordinate);
        //then
        Point expectedPoint = new Point (0.1, 0.2);

        Assert.assertEquals(expectedPoint, testPoint);
    }

    @Test
    public void testPointConstructorWhenInvalidData (){
        //given
        double testXCoordinate = 0.1;
        double testYCoordinate = 0.2;
        //when
        Point testPoint = new Point(testXCoordinate, testYCoordinate);
        //then
        Point expectedPoint = new Point (0.0, 0.0);

        Assert.assertNotEquals(expectedPoint, testPoint);
    }
}
