package com.bridgelabz.generics;

public class Maximumof3 {

	public static void main(String[] args) {
		Integer[] intarray = {15,10,12};
		int integer = MaximumInt(intarray);
		System.out.println("Max Integer: "+integer);
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
}

