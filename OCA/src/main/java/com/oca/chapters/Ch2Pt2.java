

public class Ch2Pt2 {

	private static String s = "testM";

	public static void main(String[] args) {
		//Switch statements
		/*
		* Switch statement supports:
			* int plus all primitives that could be promoted to int
			* primitives wrappers Integer, Short, Cherecter, Byte
			* emum
			* String
		*/
		long l1 = 10l;
		final int finalVarPrimitiv = 11;
		final Integer finalVarWrapper = new Integer(12);


		//Exception can not assign value to a final variable
		//finalVarWrapper = null;

		switch(finalVarWrapper) {
			case (int)10l:
				System.out.println("l1 = " + l1);
				break;
			case finalVarPrimitiv:
				System.out.println("finalVarPrimitiv = " + finalVarPrimitiv);
			//case +:
			//	System.out.println("funalVarWrapper = " + finalVarWrapper);

			
			default:
				System.out.println("default case");
		}

		// Integer class tests

		System.out.println("------------------");

		Integer iConstructor = new Integer(10);
		Integer iMethod1 = Integer.valueOf(10); //take object from cashe
		Integer iMethod2 = Integer.valueOf(10); //take object from cashe

		System.out.println(iConstructor == iMethod1);
		System.out.println(iConstructor == iMethod2);
		System.out.println(iMethod2 == iMethod1);

		System.out.println("------------------");

		Integer iConstructor2 = new Integer(128);
		Integer iMethod3 = Integer.valueOf(128); //take object from cashe
		Integer iMethod4 = Integer.valueOf(128); //take object from cashe

		System.out.println(iConstructor2 == iMethod3);
		System.out.println(iConstructor2 == iMethod4);
		System.out.println(iMethod3 == iMethod4);

		System.out.println(Integer.toString(4, 8));

		//-------------------

		System.out.println("------------------");

		int i5 = 10;
		switch (i5) {
			//default : 
			//	System.out.println("default");
			case 1 : System.out.println("1"); break;
			case 2 : System.out.println("2"); break;
			case 3 : System.out.println("3"); break;
//			default : 
//				System.out.println("default");
			case 10 : System.out.println("10");
			case 4 : System.out.println("4");
			default : 
				System.out.println("default");
		}
		testSwitch("test", "test");

		String s2 = "stringddd";

		//new Thread(() -> {testSwitch("", s2);}).start();
		//Local variable referenced from a lambda expression must be final or effectively final
//		s2 = "new String";

		//-------------------
		System.out.println("------------------");

		//the basic FOR statement
		int i = 0;
		for(System.out.println("init"); i < 5; System.out.println("increment statement #" + i++)) {
			System.out.println("body statement #" + i);
		}

		/*
		1. Initialization statement executes
		2. Check boolean expression
		3. Body execute
		4. Increment statement
		5. Return to step 2
		*/

		// semi-infinit loop
		System.out.println("------------------");
		for( ; ; ) {
			if (i == 10) break;
			System.out.println("Infinity loop example i = " + i++);		
		}

	
		//-------------------
		System.out.println("------------------");

		//For-each statment
		//collection must inmplement java.lang.iterable


		//-------------------
		System.out.println("------------------");
		// Optional lable

		int[][] arr = new int[][] {{11,12,13,14,},{21,22,23,24,},{31,32,33,34,},{41,42,43,44,}};

		for (int[] innerArr : arr) {
			for(int index = 0; index < innerArr.length; index++) {
				System.out.print(innerArr[index] + " ");
			}
			System.out.println();
		}

		System.out.println("--------------");

		excludeRow2Column(2, 2, arr);

		
	}
	public static void testSwitch(final String caseVar,String var) {
		final String finStr = new String(caseVar.toString());
		//switch (var) {
		//	case finStr :
		//		System.out.println("case");
		//		break;
		//}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println(var);
	}

	public static void excludeRow2Column(int row, int column, int[][] arr) {
		int rowCount = 1;
		column--;	
		OUTER_LABLE:
			for (int[] innerArr : arr) {
				for(int index = 0; index < innerArr.length; index++) {
					if (row == rowCount || column == index) {
						System.out.print("  ");
						continue;
					}
					System.out.print(innerArr[index] + " ");
				}
			rowCount++;
			System.out.println();
		}
	}
}
