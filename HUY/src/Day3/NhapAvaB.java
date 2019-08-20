package Day3;

import java.util.Scanner;

public class NhapAvaB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("nhap a= ");
		int a=input.nextInt();
		System.out.print("nhap b= ");
		int b=input.nextInt();
		int c=a*b;
		
		if(a>b) {
			System.out.print("a>b");
		}
		else 
			System.out.print("a<=b");
		//System.out.print("axb= "+c);
		//System.out.print("a");

	}

}
