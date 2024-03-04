package by.itstep.stage16.homework.task01.controller;

import by.itstep.stage16.homework.task01.model.MatrixLogic;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {-1, 1, -5, 3, 4},
                {1, -1, 5, 3, 4},
                {4, -3, -5, 3, 4},
        };

        System.out.println(MatrixLogic.sumElementsOfMatrix(matrix));
    }
}
