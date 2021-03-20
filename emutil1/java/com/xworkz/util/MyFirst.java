package com.xworkz.util;

public class MyFirst {
	public static void main(String[] args) {
		int count=0;
		int[] numbers= {-5,4,-5,3,-2,-4};
		for(int j=0;j<numbers.length;j++)
		{
			if(numbers[j]<0 &&numbers[j]%2!=0)
				{count++;
		}
	
}
			System.out.println(count);
}
}
