package com.javalearn.circle;

import com.javalearn.circle.DAO.DataReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DataReaderTest {

    private static List<String> getFirstValidatedLinesList(){
        List<String> validatedLines = new ArrayList<>();
        validatedLines.add("10 0 0");
        validatedLines.add("1 0 0");
        validatedLines.add("1.5 1.1 2.0");
        validatedLines.add("4.5 1 10");
        validatedLines.add("5.0 -10 -20.5");

        return  validatedLines;
    }

    @Test
    public void testRead (){

        //given
        String shortenPath = "src/test/resources/testData.txt";
        File file = new File(shortenPath);
        String path = file.getAbsolutePath();

        //when
        List<String> testLines = DataReader.read(path);
        List<String> validatedLines = getFirstValidatedLinesList();

        //then
        Assert.assertEquals(testLines, validatedLines);

    }
}
