package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder result = new StringBuilder();

        for (int e = start; e < stop; e = e + step) {
            result.append(Math.round(Math.pow(e,exponent)));
        }
        return result.toString();

    }

    public static String getRange(int start, int stop, int step) {
       String range = "";
        for(int i = start; i<stop;i=i+step){
            range = range+i;
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for(int i = start; i<stop; i++){
            range = range+i;
        }
        return range;
    }

    public static String getRange(int stop) {
        String range = "";
        for(int i =0; i<stop; i++){
            range = range+i;
        }
        return range;
    }

    /*
     * natural break
     */

    public static boolean isNumberEven(int toTest) {
       if(toTest%2 == 0) {
           return true;
       }
       else{
           return false;
       }

      //  return false;
    }
    public static boolean isNumberOdd(int toTest) {
        if(toTest%2 != 0) {
            return true;
        }
        else{
            return false;
        }
    }

    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        for(int i = start; i<stop; i++){
            if(i%2 == 0){
              result = result + i;
            }
        }
        return result;
    }

    public static String getOddNumbers(int start, int stop) {
        String result = "";
        for(int i = start; i<stop; i++){
            if(i%2 != 0){
                result = result + i;
            }
        }
        return result;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        String result = "";
        for(int i=start; i<stop; i=i+step){
            int square = (int) Math.pow(i,2);
            result = result + square;
        }
        return result;
    }

}
