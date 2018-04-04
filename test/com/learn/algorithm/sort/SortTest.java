package com.learn.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class SortTest {
	
	private int []unsorted_non_repeated_input = {3,4,2,1,5,77,66,33,87};
	private int []unsorted_non_repeated_output = {1,2,3,4,5,33,66,77,87};
	
	private List<Sort> sorts= new ArrayList<>();
	
	{
//		sorts.add(new BubbleSort());
//		sorts.add(new SelectionSort());		
//		sorts.add(new InsertionSort());
		sorts.add(new MergeSort());
	}
	
	@Test
	void testUnsortedNonRepeated() {
		for (Sort sort : sorts) {
			int[] output = sort.sort(unsorted_non_repeated_input.clone());
			Assert.assertArrayEquals(output, unsorted_non_repeated_output);
		}
	}
	
	

}
