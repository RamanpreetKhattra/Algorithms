package com.learn.algorithm.sort;

import java.util.HashMap;
import java.util.Map;

public class MergeSort implements Sort{


	public static void main(String[] args) {
		int input[]= {0,1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,9,1,2,3,4,5,6,7,8,1,1,2,2,3,3,4,4,4,65};

		MergeSort mergeSort = new MergeSort();
		int[] a = mergeSort.sort(input);
		for(int num: a) {
			System.out.print(num+",");
		}
	}


	@Override
	public int[] sort(int[] input) {
		return mergeSort(input);
	}


	private int[] mergeSort(int[] input) {
		int length = input.length;
		int pivot = length/2;


		Map<String, int[]> array =divide(input,pivot);
		int[] left =array.get("left");
		int[] right =  array.get("right");

		if(left.length>1) {
			left=mergeSort(left);
		}
		if(right.length>1) {
			right =mergeSort(right);
		}
		int[] merged = merge(left, right);
		return merged;
	}


	private int[] merge(int[] left, int[] right) {
		int [] merged = new int[left.length+right.length];
		int j=0;
		int k=0;
		for (int i = 0; i < merged.length; i++) {
			Integer l =null;
			Integer r=null;
			if(j<left.length)
				l = left[j];
			if(k<right.length)
				r = right[k];
			if (null==l || null==r) {
				if(null==l) {
					merged[i]=r;
					k++;
				}
				if(null==r) {
					merged[i]=l;
					j++;
				}
			}
			else {
				if (l > r) {
					merged[i] = r;
					k++;

				} else {
					merged[i] = l;
					j++;
				} 
			}
		}
		return merged;
	}


	private Map<String, int[]> divide(int[] input, int pivot) {
		int as = input.length%2==0?pivot:pivot+1;
		int[] left = new int[as];
		int[] right =  new int [pivot];
		for (int i = 0; i < input.length; i++) {
			if(i<as) {
				left[i] =input[i];
			}else {
				if(input.length%2==0)
					right[i-pivot] = input[i];
				else 
					right[i-pivot-1] = input[i];
			}
		}
		Map<String,int[]> dividedresponse = new HashMap<>();
		dividedresponse.put("left", left);
		dividedresponse.put("right", right);
		return dividedresponse;
	}

}
