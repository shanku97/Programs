/*
 Print all possible subarrays of size K from a given array.

Input Format
The program takes the following inputs:

- TFirst line contain an integer k, represents the number the subarray length must be equal to.

- The size of the array (integer)

- The elements of the array (space-separated integers)

Output Format
The program should output each subarray of size K on a new line.

Each subarray should be displayed as a space-separated sequence of elements.

Sample Inputs & Outputs
Sample Input 1
3
5
1 2 3 4 5
Sample Output 1
1 2 3
2 3 4
3 4 5
Sample Input 2
2
4
10 20 30 40
Sample Output 2
10 20
20 30
30 40
Constraints
The size of the array is a positive integer.

The size K is a positive integer and less than or equal to the size of the array.

The elements of the array are integers.
 */

package com.practicePrograms;
import java.util.Scanner;

public class AllSubArrayOfSizeK {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
         {
            arr[i] = scanner.nextInt();
        }

        int n = arr.length;
        
        if (k <= 0 || k > n) {
            return;
        }
        
        for (int i = 0; i <= n - k; i++) {
            for (int j = i; j < i + k; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

}
