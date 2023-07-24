/*
 Print the elements that occur more than once in a sorted array.

Input Format
The input consists of two lines:

The first line contains a single integer N, representing the size of the array (1 ≤ N ≤ 10^5).

The second line contains N space-separated integers, A[1], A[2], ..., A[N], 
representing the elements of the array (-10^9 ≤ A[i] ≤ 10^9).

Output Format
Print the repeating elements in a single line, separated by a space, or -1 if
 no element is repeating.

Sample Inputs & Outputs
Sample Input 1
8
1 2 3 3 4 4 4 5
Sample Output 1
3 4
Sample Input 2
6
1 2 3 4 5 6
Sample Output 2
-1
 */

package com.practicePrograms;

import java.util.Scanner;

public class PrintRepeatingElement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int lastRepeatingElement = -1;
        boolean foundRepeating = false;
        for (int i = 1; i < N - 1; i++) {
            if ((arr[i] == arr[i - 1] || arr[i] == arr[i + 1]) && arr[i] != lastRepeatingElement) {
                foundRepeating = true;
                System.out.print(arr[i] + " ");
                lastRepeatingElement = arr[i];
            }
        }

        if (!foundRepeating) {
            System.out.print("-1");
        }
	}

}
