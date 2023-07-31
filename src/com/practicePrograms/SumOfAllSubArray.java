/*
 Calculate the sum of all subarrays of size K from a given array.

Input Format
The program takes the following inputs:

-First line contain an integer k, represents the number the sum of subarray must be equal to.

- The size of the array (integer) n

- The elements of the array (space-separated integers)



Output Format
The program should output the sum of all subarrays of size K, separated by spaces.

Sample Inputs & Outputs
Sample Input 1
3
5
1 2 3 4 5
Sample Output 1
6 9 12
Sample Input 2
2
4
10 20 30 40
Sample Output 2
30 50 70
Constraints
The size of the array is a positive integer.

The size K is a positive integer and less than or equal to the size of the array.

The elements of the array are integers.
 */

package com.practicePrograms;
import java.util.Scanner;

public class SumOfAllSubArray {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();

        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int n = arr.length;
        
        if (k <= 0 || k > n) {
            return;
        }
        
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            System.out.print(sum + " ");
        }
        System.out.println();
        

    }

}
