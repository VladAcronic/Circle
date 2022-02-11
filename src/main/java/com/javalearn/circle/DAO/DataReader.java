package com.javalearn.circle.DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public static List<String> read (String path){

        List<String> lines = new ArrayList<String>();
        BufferedReader tempBufferedReaderStorage = null;

        try{
            tempBufferedReaderStorage = new BufferedReader(new FileReader(path));
            String tempLineStorage = "";
            while ((tempLineStorage = tempBufferedReaderStorage.readLine()) != null){
                lines.add(tempLineStorage);
            }
        }
        //TODO dont understand custom IOexceptions
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if (tempBufferedReaderStorage != null){
                try{
                    tempBufferedReaderStorage.close();
                }
                catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        }
        return lines;
    }
}
