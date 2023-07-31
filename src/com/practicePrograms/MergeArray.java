package com.practicePrograms;

import java.util.Scanner;

public class MergeArray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        int mergedSize = size1 + size2;
        int[] mergedArray = new int[mergedSize];
        int index = 0;
        for (int i = 0; i < size1; i++) {
            mergedArray[index] = array1[i];
            index++;
        }
        index = 0;
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + index] = array2[i];
            index++;
        }

        System.out.print("Merged array: ");
        for (int i = 0; i < mergedSize; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }

}
