package com.learn.algorithm.sort;

/**
 * Find the lowest element in each iteration
 * move it to left
 * continue for all elements
 */
public class SelectionSort implements Sort {

	@Override
	public int[] sort(int[] input) {
		int lowestElementIndex = 0;
		for (int i = 0; i < input.length-1; i++) {
			lowestElementIndex = i;
			for (int j = i; j < input.length-1; j++) {
				if(input[lowestElementIndex]>input[j+1]) {
					lowestElementIndex =j+1;
				}
				
			}
			int temp =input[i];
			input[i]=input[lowestElementIndex];
			input[lowestElementIndex]= temp;
			
		}
		return input;
	}

	public static void main(String[] args) {
		int input[]= {66,1,23,32,11,66};
		SelectionSort bubbleSort = new SelectionSort();
		int[] a = bubbleSort.sort(input);
		for(int num: a) {
			System.out.println(num);
		}
	}

}
