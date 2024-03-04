package by.itstep.stage16.homework.task03.model;

public class MatrixLogic {
    public static int getHigherElement(int[][] matrix) {

        int max = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (isOrderedAscending(matrix) || isOrderedDescending(matrix))
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
    public static boolean isOrderedAscending(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        boolean ascending = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] > matrix[i][j + 1]) {
                    ascending = false;
                }
            }
        }
        return ascending;
    }

    public static boolean isOrderedDescending(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        boolean descending = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] < matrix[i][j + 1]) {
                    descending = false;
                }
            }
        }

        return descending;
    }
}
