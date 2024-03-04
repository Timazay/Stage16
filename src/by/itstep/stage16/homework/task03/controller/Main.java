package by.itstep.stage16.homework.task03.controller;

import by.itstep.stage16.homework.task03.model.MatrixLogic;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(MatrixLogic.getHigherElement(matrix));

    }
}
