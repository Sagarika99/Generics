package com.bridgelabz.generics;

public class Maximumof3 <T extends Comparable<T>> {

	T x , y , z;
			
	public Maximumof3(T x, T y, T z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void MaximumTest() {
		MaximumTest(x,y,z);
	}

	public static <T extends Comparable<T>> void MaximumTest(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if (z.compareTo(max)>0) {
			max = z;
		}
		System.out.println(max);
	}
	

	public static void main(String[] args) {
		Integer x1=15, y1=10, z1=12;		

		Float x2=15.1f, y2=72.3f, z2=15.6f;
			
		String x3="Apple", y3="Peach", z3="Banana";
			
		new Maximumof3(x1,y1,z1).MaximumTest();
		new Maximumof3(x2,y2,z2).MaximumTest();
		new Maximumof3(x3,y3,z3).MaximumTest();
		
		
		
	}

}

