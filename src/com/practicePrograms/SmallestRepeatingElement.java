/*
Find the smallest repeating element in a sorted array.

Input Format
The input consists of two lines: -

The first line contains a single integer, N, representing the size of the array (1 ≤ N ≤ 10^5).

The second line contains N space-separated integers, A[1], A[2], ..., A[N], 
representing the elements of the sorted array (-10^9 ≤ A[i] ≤ 10^9).

Output Format
Print a single integer, the smallest repeating element in the array. 
If there are no repeating elements, print -1.
*/

package com.practicePrograms;

import java.util.Scanner;

public class SmallestRepeatingElement {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        int minRepeatingElement = -1;
        int current = array[0];
        int count = 1;

        for (int i = 1; i < N; i++) {
            if (current == array[i]) {
                count++;
            } else {
                if (count > 1) {
                    if (minRepeatingElement == -1 || current < minRepeatingElement)
       //to use largest repeating element use [ current > minRepeatingElement ]
                    {
                        minRepeatingElement = current;
                    }
                }
                count = 1;
                current = array[i];
            }
        }

        if (count > 1) {
            minRepeatingElement = current;
        }

        System.out.println(minRepeatingElement);
    }

}
