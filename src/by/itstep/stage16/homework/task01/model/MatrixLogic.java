package by.itstep.stage16.homework.task01.model;

public class MatrixLogic {
    public static int sumElementsOfMatrix(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            int firstPositive = -1;
            boolean positive = false;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    if (!positive) {
                        positive = true;
                        firstPositive = j;
                    } else {
                        for (int k = firstPositive + 1; k < j; k++) {
                            sum += matrix[i][k];
                        }
                        break;
                    }
                }
            }
        }
        return sum;

    }
}
