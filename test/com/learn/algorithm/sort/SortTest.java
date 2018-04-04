package com.learn.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class SortTest {
	
	private int []unsorted_non_repeated_input = {3,4,2,1,5,77,66,33,87};
	private int []unsorted_non_repeated_output = {1,2,3,4,5,33,66,77,87};
	
	private int []singleElementInput = {3};
	private int []singleElementOutput = {3};
	
	
	private int []unsorted_repeated_input = {3,4,2,1,3,4,2,1};
	private int []unsorted_repeated_output = {1,1,2,2,3,3,4,4};
	
	
	private int []null_input = {};
	private int []null_sorted = {};
	
	
	private List<Sort> sorts= new ArrayList<>();
	
	{
		sorts.add(new BubbleSort());
		sorts.add(new SelectionSort());		
		sorts.add(new InsertionSort());
		sorts.add(new MergeSort());
	}
	
	@Test
	void testUnsortedNonRepeated() {
		for (Sort sort : sorts) {
			int[] output = sort.sort(unsorted_non_repeated_input.clone());
			Assert.assertArrayEquals(output, unsorted_non_repeated_output);
		}
	}
	
	
	@Test
	void testSingleElement() {
		for (Sort sort : sorts) {
			int[] output = sort.sort(singleElementInput.clone());
			Assert.assertArrayEquals(output, singleElementOutput);
		}
	}
	
	@Test
	void testUnsortedRepeated() {
		for (Sort sort : sorts) {
			int[] output = sort.sort(unsorted_repeated_input.clone());
			Assert.assertArrayEquals(output, unsorted_repeated_output);
		}
	}
	
	@Test
	void testNull() {
		for (Sort sort : sorts) {
			int[] output = sort.sort(null_input.clone());
			Assert.assertArrayEquals(output, null_sorted);
		}
	}
	
	
	

}
