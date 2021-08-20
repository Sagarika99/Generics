package com.bridgelabz.generics;

public class Maximumof3 <T extends Comparable<T>> {

	T x , y , z, p, s;
			
	public Maximumof3(T x, T y, T z, T p, T s) {
		
		this.x = x;
		this.y = y;
		this.z = z;
		this.p = p;
		this.s = s;
	}
	
	public void MaximumTest() {
		MaximumTest(x,y,z,p,s);
	}

	public static <T extends Comparable<T>> void MaximumTest(T x, T y, T z, T p, T s) {
		T max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if (z.compareTo(max)>0) {
			max = z;
		}
		if (p.compareTo(max)>0) {
			max = p;
		}
		if (s.compareTo(max)>0) {
			max = s;
		}
		
		System.out.println(max);
	}
	

	public static void main(String[] args) {
		Integer x1=15, y1=10, z1=12, p1=45, s1=2;		

		Float x2=15.1f, y2=72.3f, z2=15.6f, p2=5.5f, s2=100.0f;
			
		String x3="Apple", y3="Peach", z3="Banana", p3="Pear", s3="Apricot";
			
		new Maximumof3(x1,y1,z1,p1,s1).MaximumTest();
		new Maximumof3(x2,y2,z2,p2,s2).MaximumTest();
		new Maximumof3(x3,y3,z3,p3,s3).MaximumTest();
		
		
		
	}

}

