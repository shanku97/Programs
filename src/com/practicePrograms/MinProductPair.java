/*
 Write a program that finds the minimum product among all the pairs of elements 
 in a given array of integers.

Input Format
The first line contains a single integer, N, representing the size of the array.

The second line contains N space-separated integers, representing the elements of the array.

Output Format
Print the minimum product among all the pairs of elements in the array.
 */

package com.practicePrograms;

import java.util.Scanner;

public class MinProductPair {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
                int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++) {
            arr[i] = sc.nextInt();
        }

        int minProduct = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            for(int j = i+1 ; j< n; j++) {
                int product = arr[i] * arr[j];
                if(product < minProduct){
                    minProduct = product;
                }
            }
        }
        System.out.println(minProduct);
    }

}
