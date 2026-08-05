package org.example.single_file_source_code_programs;

class BreakWithLabelDemo {
    public static void main(String[] args) {

        int[][] arrayOfInts = {
                {  32,   87,    3, 589 },
                {  12, 1076, 2000,   8 },
                { 622,  127,   77, 955 }
        };
        int searchFor = 12;

        int i;
        int j = 0;
        boolean foundIt = false;

        search:
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length;
                 j++) {
                if (arrayOfInts[i][j] == searchFor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) {
            IO.println("Found " + searchFor + " at " + i + ", " + j);
        } else {
            IO.println(searchFor + " not in the array");
        }
    }
}