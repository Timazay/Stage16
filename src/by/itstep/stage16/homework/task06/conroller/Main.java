package by.itstep.stage16.homework.task06.conroller;

import by.itstep.stage16.homework.task06.model.MatrixLogic;

public class Main {
    public static void main(String[] args) {
        int[] vector1 = {4, 5,5};
        int[] vector2 = {2, 4, 6};

        int[] merged = MatrixLogic.mergeSortedVectors(vector1,vector2);

      System.out.print("Merged vector: ");
      for (int num : merged) {
          System.out.print(num + " ");
      }
    }
}
