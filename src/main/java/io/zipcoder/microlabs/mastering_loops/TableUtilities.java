package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getMultiplicationTable(int tableSize) {
        //String result = " ";
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {

                result.append("  " + i * j + " |");

            }
            result.append("\n");
        }

        return result.toString();


        //  return null;
    }

    public static String getSmallMultiplicationTable() {
//        for (int i = 1; i <= tableSize; i++) {
//            for (int j = 1; j <= tableSize; j++) {
//
//                result.append("  " + i * j + " |");
//
//            }
//            result.append("\n");
//        }
//
//        return result.toString();
//        return null;
        return getMultiplicationTable(2);
    }


    public static String getLargeMultiplicationTable() {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                result.append(" " + i * j + "  |");


            }
          //  result.insert(0," ");
            result.append("\n");
        }


        return result.toString();
    }
}
