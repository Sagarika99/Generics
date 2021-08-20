package com.bridgelabz.generics;

public class Maximumof3 {

	public static void main(String[] args) {
		Integer[] intarray = {15,10,12};
		int integernum = MaximumInt(intarray);
		System.out.println("Max Integer: "+integernum);
		
		Float[] floatarray = {15.1f,10.5f,15.6f};
		Float floatnum = MaximumFloat(floatarray);
		System.out.println("Max Float: "+floatnum);
	}

	public static int MaximumInt(Integer[] intarray) {
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
}

