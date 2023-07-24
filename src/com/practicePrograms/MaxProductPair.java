/*  Write a program that finds the maximum product among all the pairs of 
  elements in a given array of integers.

Input Format :--
The first line contains a single integer, N, representing the size of the array.
 The second line contains N space-separated integers, representing the elements of the array.

Output Format :--
Print the maximum product among all the pairs of elements in the array.

*/
package com.practicePrograms;

import java.util.Scanner;

public class MaxProductPair {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int[] array = new int[n];
	        for (int i = 0; i < n; i++) {
	            array[i] = sc.nextInt();
	        }

	        int maxProduct = 0;
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                int product = array[i] * array[j];
	                if (product > maxProduct) {
	                    maxProduct = product;
	                }
	            }
	        }

	        System.out.println(maxProduct);
	    }
}
