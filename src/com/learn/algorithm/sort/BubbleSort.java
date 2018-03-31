package com.learn.algorithm.sort;

/**
 * Compare each element with next element starting from index 0 till unsorted element
 * After first iteration largest element will be in rightmost(last position)
 * after each nth iteration we will get nth largest element then we will check in rest of the unsorted elemnts excluding sorted elemnts
 */ 
public class BubbleSort implements Sort{

	public static void main(String[] args) {
		int input[]= {1,23,32,11,66};

		BubbleSort bubbleSort = new BubbleSort();
		int[] a = bubbleSort.sort(input);
		for(int num: a) {
			System.out.println(num);
		}
	}

	public int[] sort(int[] input) {
		if(null==input) {
			throw new RuntimeException("Empty input not allowed assohle");
		}
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 0; j < input.length-i-1; j++) {
				if(input[j]>input[j+1]) {
					int temp = input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}

			}
		}
		return input;

	}

}
