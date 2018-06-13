

public class Ch2Pt1 {

	private Short shortVar;

	private static int time;

	public static void main(String[] args) {
		System.out.println(Short.MAX_VALUE);
		int i = 10;

		//why here it works fine? I mean that all literals are int, and 22 should cast
		short s0 = 22;
		short s1 = 327;
		short s2 = -1;
		//short s3 = s1 - s0;
		//short s2 = 32768;
		
		Ch2Pt1 inst = new Ch2Pt1();
		inst.setShortVar((short) 1);

		/*-------------------------*/

		long l = 10L;
		int iVar = 10;
		System.out.println("before assignment iVar = " + iVar);
		//possible losssy conversion from long to int
		//iVar = iVar + l;

		//but compound assignment works fine
		iVar += l;
		System.out.println("after assignment iVar = " + iVar);
		
		/*-------------------------*/

		short sVar = 10;
		//sVar = 1 + l;
		sVar += l;

		int ass2;
		//befor this satament a have to declare ass2 variable!!!
		int ass1 = ass2 = 3;
		System.out.println("ass1 = " + ass1);
		System.out.println("ass2 = " + ass2);

		/*-------------------------*/
		
		//Equility operators
		System.out.println((int) 'a');
		System.out.println('a' == 97.0);

		boolean b = true;

		//incomparable types
		//boolean b2 = (false == 3);

		boolean b2 = (false == b);
		System.out.println(b2);

		/*-------------------------*/
		//if-than statemant		

		if (false) {}
		else if (false) {}
		else {System.out.println("else 1");}
		// 'else' without if statement
		//else (true) {System.out.println("else 2");}

		
		
		if (time < 15) {}
		else if (time < 11) {}
		else {}

		/*-------------------------*/

		//ternary orerator if-than-else

		int y = 10;
		final int x;
		if (y < 10) {
			x = y * 3;
		} else {x = y * 2;} 

		System.out.println(x);
		int x2;

		//It's good practis to add parentheses around expressions
		x2 = (y < 10) ? (10) : (y * 2);

		System.out.println(x);

		/*-------------------------*/
		//An expression is a construct made up of variables, operators, and method invocations

		//Error not a statement, because it's expression)
		//2+2;

		// 2+2/2 ambiguous expression
		// (2+2)/2 unambiguous expression
		// 2 + 2/2 also unambiguous expression
		
		System.out.println();
		getTime();
		//time;

		//Statement is an equivalent of sentence in natural languages
		//Expression with a semicolomn become a statement
		//The next types of expressions can be made into statement by terminating the expression with semicolon
		/*
			* assignment expression
			* method invocation
			* ++ or --
			* object creation expression

			all this statements are called as "expression statements"
		*/

		// there are two kinds of statements: declaration statement and control-flow statement
		//

		
	}



	public static int getTime() {return time;}







	public void setShortVar(Short var) {shortVar = var;}
}
