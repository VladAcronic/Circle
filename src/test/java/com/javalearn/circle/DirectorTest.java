package com.javalearn.circle;

import com.javalearn.circle.entity.Circle;
import org.junit.Test;
import org.mockito.*;
import java.io.File;
import java.util.List;

public class DirectorTest {

    @Test
    public void testReadAndCreateCircles () throws Exception {
        //given
        String  shortenPath = "src/test/resources/testData.txt";
        File file = new File(shortenPath);
        String path = file.getAbsolutePath();

        //when
        List<Circle> circles = Director.readAndCreateCircles(path);

        //TODO correct tests with mockito
        for (Circle circle: circles){
            System.out.println(circle.getCentre().getXCoordinate());
            System.out.println(circle.getCentre().getYCoordinate());
            System.out.println(circle.getRadius());
        }
    }
}

