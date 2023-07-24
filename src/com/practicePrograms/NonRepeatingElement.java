/*
 Print the elements that occur only once in a sorted array.

Input Format
The input consists of two lines:

The first line contains a single integer N, representing the size of the array (1 ≤ N ≤ 10^5).

The second line contains N space-separated integers, A[1], A[2], ..., A[N], 
representing the elements of the array (-10^9 ≤ A[i] ≤ 10^9).

Output Format
Print the non-repeating elements in a single line, separated by a space.

Sample Input 1
8
1 2 3 3 4 4 4 5
Sample Output 1
1 2 5

 */


package com.practicePrograms;

import java.util.*;

public class NonRepeatingElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
//        printNonRepeatingElements(arr);

        for (int i = 0; i < N; i++) {
            if ((i == 0 || arr[i] != arr[i - 1]) && (i == N - 1 || arr[i] != arr[i + 1])) {
                System.out.print(arr[i] + " ");
            }
        }
	}
	
//	public static void printNonRepeatingElements(int[] arr) {
//        HashMap<Integer, Integer> occurrenceMap = new HashMap<>();
//        
//        for (int num : arr) {
//            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
//        }
//        
//        for (int num : arr) {
//            if (occurrenceMap.get(num) == 1) {
//                System.out.print(num + " ");
//            }
//        }
//    }

}
