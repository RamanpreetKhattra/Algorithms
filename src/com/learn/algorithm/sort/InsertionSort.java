package com.learn.algorithm.sort;

/**
 *set an index starting from 0, make sure everything sorted till that index
 *iterate index till n
 */
public class InsertionSort implements Sort{
	@Override
	public int[] sort(int[] input) {
		for (int i = 1; i < input.length; i++) {
			
			for (int j = i; j>0; j--) {
				if(input[j]<input[j-1]) {
					int temp=input[j];
					input[j]=input[j-1];
					input[j-1]=temp;
					
				}else if(input[j]>input[j-1]) {
					break;
				}
				
			}
			
			
		}
		return input;
	}

	public static void main(String[] args) {
		int input[]= {66,1,23,32,11,66};
		InsertionSort bubbleSort = new InsertionSort();
		int[] a = bubbleSort.sort(input);
		for(int num: a) {
			System.out.println(num);
		}
	}
}
