package com.javalearn.circle;

import com.javalearn.circle.entity.Circle;
import com.javalearn.circle.entity.Point;
import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    final double xCoordinate = 0.1;
    final double yCoordinate = 0.2;
    final double radius  = 1.5;
    Point centreTestedCircle = new Point(xCoordinate, yCoordinate);

    @Test
    public void testCircleConstructorWhenValidData () {
        //given

        //when
        Circle testCircle = new Circle(centreTestedCircle, radius);

        //then
        Point centreExpectedCircle = new Point (0.1, 0.2);
        Circle expectedCircle = new Circle(centreExpectedCircle, 1.5);

        Assert.assertEquals(expectedCircle, testCircle);
    }

    @Test
    public void testCircleConstructorWhenInvalidData () {
        //given

        //when
        Circle testCircle = new Circle(centreTestedCircle, radius);

        //then
        Point centreExpectedCircle = new Point (0.0, 0.0);
        Circle expectedCircle = new Circle(centreExpectedCircle, 0.0);

        Assert.assertNotEquals(expectedCircle, testCircle);
    }


    @Test
    public void testSetCentreWhenValidData(){
        //given
        Circle testCircle = new Circle(centreTestedCircle, radius);
        Point modifiedCentre = new Point (1.1, 2.2);

        //when
        testCircle.setCentre(modifiedCentre);

        //then
        Point centreExpectedCircle = new Point (1.1, 2.2);
        Circle expectedCircle = new Circle(centreExpectedCircle, 1.5);
        Assert.assertEquals(expectedCircle, testCircle);
    }

    @Test
    public void testSetCentreWhenInvalidData(){
        //given
        Circle testCircle = new Circle(centreTestedCircle, radius);
        Point modifiedCentre = new Point (1.1, 2.2);

        //when
        testCircle.setCentre(modifiedCentre);

        //then
        Point centreExpectedCircle = new Point (0, 0);
        Circle expectedCircle = new Circle(centreExpectedCircle, 1.5);
        Assert.assertNotEquals(expectedCircle, testCircle);
    }

    @Test
    public void testSetRadiusWhenValidData(){
        //given
        Circle testCircle = new Circle(centreTestedCircle, radius);
        double modifiedRadius = 10.0;

        //when
        testCircle.setRadius(modifiedRadius);

        //then
        Circle expectedCircle = new Circle(centreTestedCircle, 10.0);
        Assert.assertEquals(expectedCircle, testCircle);
    }

    @Test
    public void testSetRadiusWhenInvalidData(){
        //given
        Circle testCircle = new Circle(centreTestedCircle, radius);
        double modifiedRadius = 10.0;

        //when
        testCircle.setRadius(modifiedRadius);

        //then
        Circle expectedCircle = new Circle(centreTestedCircle, 0.0);
        Assert.assertNotEquals(expectedCircle, testCircle);
    }
}
