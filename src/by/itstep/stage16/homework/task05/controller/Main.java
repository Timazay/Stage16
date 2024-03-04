package by.itstep.stage16.homework.task05.controller;

import by.itstep.stage16.homework.task05.model.MatrixLogic;

public class Main {
    public static void main(String[] args) {
        int[][] matrix= {
                {1,2,3,3},
                {6,5,4,3},
                {5,6,7,8},
        };

        System.out.println(MatrixLogic.getLargestNumberDecreasingElement(matrix));
        System.out.println(MatrixLogic.getLargestNumberIncreasingElement(matrix));
    }

}
