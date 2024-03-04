package by.itstep.stage16.homework.task04.controller;

import by.itstep.stage16.homework.task04.model.MatrixLogic;

public class Main {
    public static void main(String[] args) {
        int[][] matrix= {
                {5,5,5,5},
                {2,5,5,5},
                {3,5,5,5},
        };

        System.out.println(MatrixLogic.getLongestSeriesRow(matrix));

    }
}
