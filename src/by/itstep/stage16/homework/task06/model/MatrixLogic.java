package by.itstep.stage16.homework.task06.model;

public class MatrixLogic {
    public static int[] mergeSortedVectors(int[] vector1, int[] vector2) {
        int i = 0, j = 0, k = 0;

        int[] merged = new int[vector1.length + vector2.length];
if (isOrderedAscendingVector2(vector2) && isOrderedAscendingVector1(vector1)){
        while (i < vector1.length && j < vector2.length) {
            if (vector1[i] < vector2[j]) {
                merged[k] = vector1[i];
                i++;

            } else {
                merged[k] = vector2[j];
                j++;
            }
            k++;
        }

        while (i < vector1.length) {
            merged[k] = vector1[i];
            i++;
            k++;
        }

        while (j < vector2.length) {
            merged[k] = vector2[j];
            j++;
            k++;
        }
    }else{
        merged[0] = -1;
    }
        return merged;
    }

    public static boolean isOrderedAscendingVector1(int[] vector1) {
        if (vector1.length == 0 || vector1 == null) {
            return false;
        }

        boolean ascending = true;
        for (int i = 1; i < vector1.length; i++) {
            if (vector1[i] <= vector1[i - 1]) {
                ascending = false;
            }
        }
        return ascending;
    }

    public static boolean isOrderedAscendingVector2(int[] vector2) {
        if (vector2.length == 0 || vector2 == null) {
            return false;
        }

        boolean ascending = true;
        for (int i = 1; i < vector2.length; i++) {
            if (vector2[i] <= vector2[i - 1]) {
                ascending = false;
            }
        }
        return ascending;
    }

}
