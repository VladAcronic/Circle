package com.javalearn.circle;

import com.javalearn.circle.exceptions.DataException;
import com.javalearn.circle.logic.CircleValidator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class CircleValidatorTest {

    private List<String> getValidLines (){
        List<String> validLines = new ArrayList<>();
        validLines.add("1 10 20");
        validLines.add("1.0 1.0 2.0");
        validLines.add("1.12 -10 2.0");
        validLines.add("0.1 0.0 0.0");
    return validLines;
    }

    private List<String> getInValidLines (){
        List<String> inValidLines = new ArrayList<>();
        inValidLines.add("-1 10 20");
        inValidLines.add("001 0.1 0.1");
        inValidLines.add("0 0.0 0.0");
        inValidLines.add("1.0 1.0");
        inValidLines.add("1.12z -10 2.0");
        return inValidLines;
    }

    @Test
    public void testIsCircleWhenDataIsValid () throws DataException {
        //given
        List<String> validTestedLines = getValidLines();
        //when
        boolean result;

        for (String validLine : validTestedLines) {

            //when
            result = false;
            result = CircleValidator.isCircleDataValid(validLine);

            //then
            Assert.assertTrue(result);
        }
    }

    @Test (expected = DataException.class)
    public void testIsCircleWhenLineIsInvalid () throws DataException {

        //given
        List<String> inValidTestedLines = getInValidLines();
        //when
        for (String line : inValidTestedLines) {
            try {
                boolean result = CircleValidator.isCircleDataValid(line);
            }
            finally {
                continue;
            }
        }
        //this code is need for prevent non-excepted finalization of method
        boolean result = CircleValidator.isCircleDataValid("");
    }
}
