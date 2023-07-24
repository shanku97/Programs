/*
 Count the number of occurrences of the largest element in an ascending sorted array.

Input Format
The input consists of two lines:

The first line contains a single integer N, representing the size of the array (1 ≤ N ≤ 10^5).

The second line contains N space-separated integers, A[1], A[2], ..., A[N], 
representing the elements of the array (-10^9 ≤ A[i] ≤ 10^9).

Output Format
Print a single integer, the count of occurrences of the largest element in the array.

Sample Inputs & Outputs
Sample Input 1
8
1 2 3 3 4 4 4 5
Sample Output 1
1
 */

package com.practicePrograms;

import java.util.Scanner;

public class CountLargestElementOccurence {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        int largestElement = array[0];
        int count = 1;

        for (int i = 1; i < N; i++) {
            if (array[i] == largestElement) {
                count++;
            } else if (array[i] < largestElement) {
                largestElement = array[i];
                count = 1;
            }
        }

        System.out.println(count);   
    }
}
