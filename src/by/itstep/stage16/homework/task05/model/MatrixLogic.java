package by.itstep.stage16.homework.task05.model;

public class MatrixLogic {
    public static int getLargestNumberIncreasingElement(int[][] matrix) {
        int max = 0;
        int longestSeriesRow = -1;

        if (isIncreaseSequence(matrix)) {
            for (int i = 0; i < matrix.length; i++) {
                int currentMax = 0;
                for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j] > matrix[i][j - 1]) {
                        currentMax++;
                    } else {
                        currentMax = 1;
                    }
                }
                if (currentMax > max) {
                    max = currentMax;
                    longestSeriesRow = i;
                }
            }
        }
        return longestSeriesRow;
    }

    public static int getLargestNumberDecreasingElement(int[][] matrix) {

        int max = 0;
        int longestSeriesRow = -1;

        if (isDecreaseSequence(matrix)) {
            for (int i = 0; i < matrix.length; i++) {
                int currentMax = 1;
                for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j] < matrix[i][j - 1]) {
                        currentMax++;
                    } else {
                        currentMax = 1;
                    }
                }
                if (currentMax > max) {
                    max = currentMax;
                    longestSeriesRow = i;
                }
            }
        }
        return longestSeriesRow;
    }

    public static boolean isIncreaseSequence(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        boolean series = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > matrix[i][j - 1]) {
                    series = true;
                    break;
                }
            }
        }
        return series;
    }

    public static boolean isDecreaseSequence(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        boolean series = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < matrix[i][j - 1]) {
                    series = true;
                    break;
                }
            }
        }
        return series;
    }
}
