package com.bridgelabz.generics;

public class Maximumof3 {

	public static void main(String[] args) {
		Integer[] intarray = {15,10,12};
		int integernum = MaximumInt(intarray);
		System.out.println("Max Integer: "+integernum);
		
		Float[] floatarray = {15.1f,10.5f,15.6f};
		Float floatnum = MaximumFloat(floatarray);
		System.out.println("Max Float: "+floatnum);
		
		String[] stringarray = {"Apple", "Peach", "Banana"};
		String stringnum = MaximumString(stringarray);
		System.out.println("Max Float: "+stringnum);
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
	
	public static String MaximumString(String[] stringarray) {
		String maxstring = stringarray[0];
		if(stringarray[1].compareTo(maxstring)>0) {
			maxstring = stringarray[1];
		}
		if (stringarray[2].compareTo(maxstring)>0) {
			maxstring = stringarray[2];
		}
		return maxstring;
	}
}

