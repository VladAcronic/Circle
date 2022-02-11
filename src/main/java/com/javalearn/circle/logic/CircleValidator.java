package com.javalearn.circle.logic;
import java.util.regex.*;
import com.javalearn.circle.exceptions.*;

public class CircleValidator {

    private static final int TOKENS_AMOUNT_IN_LINE = 3;
    private static final String DELIMITER = "\\s+";

    public static boolean isCircleDataValid (String line) throws DataException {

        boolean result = false;

        //split the line by delimiter
        //String[] tokensNumber = line.split("\\s+");
        String[] tokensNumber = line.split(DELIMITER);

        //do control negative checks
        if (tokensNumber.length != TOKENS_AMOUNT_IN_LINE) {
            throw new DataException ("not enough tokens in line");
        }

        //check radius token separately
        String tokenRadius = tokensNumber[0];
        if (Pattern.matches("-+.*",tokenRadius)) {
            throw new DataException("radius cannot be negative");
        }
        if (Pattern.matches("0|(0\\.0*)",tokenRadius)) {
            throw new DataException("radius cannot be zero");
        }
        //check all tokens for valid format
        for (String token: tokensNumber){
            if (Pattern.matches("(-?)0[0-9]+.*",token)){
                throw new DataException("invalid format of token");
            }
        }

        //check tokens for format matching
        result = Pattern.matches("[0-9]+\\.[0-9]+|[1-9][0-9]*",tokenRadius);

        for (int i = 1; i < tokensNumber.length; i++){
            result = Pattern.matches("(-?)[0-9]+\\.[0-9]+|(-?)[0-9]+",tokensNumber[i]);
            if (!result){
                throw new DataException("invalid symbol in expression");
            }
        }
        return result;
    }
}
