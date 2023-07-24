/*
 The goal of this task is to write a Java program that finds the index of a 
 given value K in a given array. If K is not found in the array, the program should print -1.

Input Format
The first line contains a single integer, N, representing the size of the array.

The second line contains N space-separated integers, representing the elements of the array.

The third line contains a single integer, K, representing the value to be found.

Output Format
Print the index of the first occurrence of K in the array. If K is not found, print -1.
 */

package com.practicePrograms;

import java.util.Scanner;

public class IndexOfKValue {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int index = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == k){
                index = i;
                break;		// for printing first occurance used break
            }
        }
        System.out.println(index);
        
    }

}
