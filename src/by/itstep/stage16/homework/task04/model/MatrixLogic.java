package by.itstep.stage16.homework.task04.model;

public class MatrixLogic {
    public static int getLongestSeriesRow(int[][] matrix) {

        int longestSeriesRow = -1;
        int maxLength = 0;

        if (isLongestSeriesRow(matrix)) {
            for (int i = 0; i < matrix.length; i++) {
                int currentLength = 1;
                for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j] == matrix[i][j - 1]) {
                        currentLength++;
                    } else {
                        if (currentLength > maxLength) {
                            maxLength = currentLength;
                        }
                        currentLength = 1;
                    }

                }
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    longestSeriesRow = i;
                }else if (currentLength == maxLength){
                    maxLength = currentLength;
                    longestSeriesRow = -1;
                }

            }
        }
        return longestSeriesRow;
    }

    public static boolean isLongestSeriesRow(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        boolean series = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == matrix[i][j - 1]) {
                    series = true;
                    break;
                }
            }
        }
        return series;
    }

}
