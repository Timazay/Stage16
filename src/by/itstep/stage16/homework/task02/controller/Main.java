package by.itstep.stage16.homework.task02.controller;

import by.itstep.stage16.homework.task02.model.MatrixLogic;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 8},
                {4, 4, 6},
                {5, 8, 4}
        };

        System.out.println(MatrixLogic.findMonotonicColumns(matrix));
    }
}
