package com.bridgelabz.generics;

public class Maximumof3 {

	public static void main(String[] args) {
		Integer[] array1 = {15,10,12};
		MaximumTest(array1);
		
		
		Float[] array2 = {15.1f,10.5f,15.6f};
		MaximumTest(array2);
		
		
		String[] array3 = {"Apple", "Peach", "Banana"};
		MaximumTest(array3);
		
	}

	public static <T extends Comparable<T>> void MaximumTest(T[] array) {
		T max = array[0];
		if(array[1].compareTo(max)>0) {
			max = array[1];
		}
		if (array[2].compareTo(max)>0) {
			max = array[2];
		}
		System.out.println(max);
	}
	
	
	
/**	public static int MaximumInt(Integer[] intarray) {
		int maxnum = intarray[0];
		if(intarray[1].compareTo(maxnum)>0) {
			maxnum = intarray[1];
		}
		if (intarray[2].compareTo(maxnum)>0) {
			maxnum = intarray[2];
		}
		return maxnum;
	}
	
	public static float MaximumFloat(Float[] floatarray) {
		float maxnum = floatarray[0];
		if(floatarray[1].compareTo(maxnum)>0) {
			maxnum = floatarray[1];
		}
		if (floatarray[2].compareTo(maxnum)>0) {
			maxnum = floatarray[2];
		}
		return maxnum;
	}
	
	public static String MaximumString(String[] stringarray) {
		String maxstring = stringarray[0];
		if(stringarray[1].compareTo(maxstring)>0) {
			maxstring = stringarray[1];
		}
		if (stringarray[2].compareTo(maxstring)>0) {
			maxstring = stringarray[2];
		}
		return maxstring;
	}**/
}

