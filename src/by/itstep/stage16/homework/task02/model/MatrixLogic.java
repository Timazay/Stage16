package by.itstep.stage16.homework.task02.model;

public class MatrixLogic {

    public static boolean isIncreasingColumn(int[][] matrix, int col) {


        boolean increase = true;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][col] < matrix[i - 1][col]) {
                increase =  false;
            }
        }
        return increase;
    }

    public static boolean isDecreasingColumn(int[][] matrix, int col) {
        if (matrix == null || matrix.length == 0){
            return false;
        }

        boolean decrease = true;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][col] > matrix[i - 1][col]) {
                decrease = false;
            }
        }
        return decrease;
    }

    public static String findMonotonicColumns(int[][] matrix) {
        String msg = "";

        for (int j = 0; j < matrix[0].length; j++) {
            if (isIncreasingColumn(matrix, j) || isDecreasingColumn(matrix, j)) {
                msg += "\nThe column " + j + " contains a monotonously sequence.";
            }
        }
        return msg;
    }
}
