package org.sam;

public class Details {
	public static void main(String[] args) {
		int sum=0;
		for (int i = 0; i < 5; i++) {
			if (i%2==1) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
