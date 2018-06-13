public class Ch2Pt0 {

	public static void main(String[] args) {
		/*
		Operators precedence
		1. post-unary operators exp++ exp--
		2. pre-unary operators ++exp --exp
		3. unary operators + - !
		4. multiplication / division / modulus * / %
		5. Addition / subtraction + -
		6. Shift operators << >> >>>
		7. Relational operators < <= > >= instanceof
		8. equal to, not equal to == !=
		9. Logical operators & | ^
		10.Short-circuit logical operators && ||
		11.Assignment operators = += -= *=
		*/

		//instanceof

		//----------------------

		int i = 8;
		System.out.println((i > 4) ? ((i < 7) ? ("null") : ("HELLO")) : ("null"));

		//----------------------

		//The CAST operator has the higher precedence sooooo:
		//possible lossy conversion from long to int		
		//int i1 = (int) 10L * 2L;
		int i1 = (int) 10L * 2;

		//----------------------

		//Incomparable types
		//System.out.println(5 == "5");
		System.out.println(((byte)4) == 4.0); //true
		System.out.println(0b100 == 4.0f); //true
		//System.out.println("true" == true);
		System.out.println(Boolean.valueOf("2") == false); //true

		//----------------------

		//can not find symbol i2 0_0
		//do {int i2 = 0 ; System.out.println(i2++);} while (i2 < 10);


		//----------------------


		int x = 4;
		long y = x * 4 - x++;

		System.out.println("y = " + y);
		System.out.println("x = " + x); 

		int x2 = 4;
		long y2 = x2 * 4 - (++x2);

		System.out.println("y2 = " + y2);
		System.out.println("x2 = " + x2);

		int x3 = 5;
		int x4;
		System.out.println("(x3 += ++x3) -> " + (x4 = (x3 += ++x3)));
		System.out.println("x4 = " + x4);

	}

}
