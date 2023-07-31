/*
 Print all possible subarrays of a given array.

Input Format
The program takes the following input:

- The size of the array (integer)

- The elements of the array (space-separated integers)

Output Format
The program should output each subarray on a new line.

Each subarray should be displayed as a space-separated sequence of elements.

Sample Inputs & Outputs
Sample Input 1
3
1 2 3
Sample Output 1
1
1 2
1 2 3
2
2 3
3
Sample Input 2
4
10 20 30 40
Sample Output 2
10
10 20
10 20 30
10 20 30 40
20
20 30
20 30 40
30
30 40
40
 */

package com.practicePrograms;

import java.util.Scanner;

public class AllPossibleSubArray {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }
        }
    }

}
