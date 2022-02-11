package com.javalearn.circle;

import com.javalearn.circle.DAO.DataReader;
import com.javalearn.circle.entity.Circle;
import com.javalearn.circle.logic.CircleCreator;
import com.javalearn.circle.logic.CircleValidator;

import java.util.ArrayList;
import java.util.List;

public class Director {


    public static List<Circle> readAndCreateCircles (String path) throws Exception {
        List<Circle> circles = new ArrayList<>();
        List<String> lines = DataReader.read(path);

        for (String line: lines){
            if (CircleValidator.isCircleDataValid(line)){
                Circle circle = CircleCreator.createCircle(line);
                circles.add(circle);
            }

        }
    return circles;
    }
}
