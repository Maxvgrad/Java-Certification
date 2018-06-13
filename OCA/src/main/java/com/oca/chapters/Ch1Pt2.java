package com.oca.chapters;
/*34 - literal*/

import java.util.Date;

public class Ch1Pt2 {

	private static Date date;	
	int iTest;

	public void Ch1Pt2() {
		iTest = 4;	
	}

	public static void main(String args[]) {
		System.out.println(Integer.MAX_VALUE + 1);
		
		//integer number is too larg
		//int i = 2147483649;
		//System.out.println(i);



		//for long we can mark as l or L, but L is better because it's look l is similare as 1
		long l = 2147483649L;
		System.out.println(l);

		//Binary
		System.out.print("0b100 = ");
		System.out.println(0b100);

		//Hexadecimal
		System.out.print("0xA = ");
		System.out.println(0xA);

		//Octal
		System.out.print("037 = ");
		System.out.println(037);
		


		//From Java 7
		int newFeacher = 1___000_00;
		System.out.println("New feacher: " + newFeacher);

		float itIsOk1 = 1__000_0.0F;
		System.out.println("itIsOk1: " + itIsOk1);

		//int doesNotCompile1 = _1000_00; //DOESN'T COMPILE

		//float doesNotCompile2 = 1__000_0_.0F; //DOESN'T COMPILE
		//float doesNotCompile3 = 1.0_F;		
		//System.out.println("doesNotCompile3: " + doesNotCompile3);


		//assign the reference
		date = new Date();
		
		//Class instantiation
		ClassForInstantiation instantiation = new ClassForInstantiation();


		//Declaration
		int a;
		Date dateX;
		boolean b;

		System.out.println("--------------------");
		int i1=1, i2;
		//variable i2 might not have been initialized
		//System.out.println(i2);
		System.out.println("i1 = " + i1);

		//Doesn't work((
		//String s1 = s2 = s3 = "Hello guys";
		//System.out. println("s1 = s2 = s3 -> " + s1 + s2 + s3);

		//Another bulshit)
		//int i = 3, String s = "J";

		//DOES NOT COMPILE
		//double d1 = 1, double d2 = 2;

		System.out.println("--------------------");
		//int 3d;
		int _3d;
		int $_3d;
		int d_;
		//int const;
		//int goto;
	}








	private abstract class DeclarationMethods {
		//method declaration
		public abstract void methodDeclaration();
	}

	private static class ClassForInstantiation {
		//method initialization		
		public void methodInitialization() {
			System.out.println("Hello world");		
		}
	}
}
