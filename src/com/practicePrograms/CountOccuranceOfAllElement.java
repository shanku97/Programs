/*
Count the number of occurrences for each unique element in a sorted array.

Input Format
The input consists of two lines: -

The first line contains a single integer, N, representing the size of the array (1 ≤ N ≤ 10^5).

The second line contains N space-separated integers, A[1], A[2], ..., A[N], 
representing the elements of the array (-10^9 ≤ A[i] ≤ 10^9).

Output Format
Print N lines, each containing two space-separated integers: X and Y. 
Here, X represents a unique element from the array, and Y represents the number of times
 X occurs in the array. The lines should be printed in ascending order of X.

Sample Inputs & Outputs
Sample Input 1
8
1 2 3 3 4 4 4 5
Sample Output 1
1 1
2 1
3 2
4 3
5 1
 */

package com.practicePrograms;

import java.util.*;

public class CountOccuranceOfAllElement {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (countMap.containsKey(array[i])) {
                countMap.put(array[i], countMap.get(array[i]) + 1);
            } else {
                countMap.put(array[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
