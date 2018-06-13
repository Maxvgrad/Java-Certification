//single line comment

/*
* multiline comment
* and so on
*/

/**
*JAVADOC comment
*/


//How to import two classes with the same name
import java.util.Date;
//import java.sql.Date;


public class ChapterOneComments {

	
	public String one = "one";
	public String two = "two";
	public String oneTwo = one + two + 	three;
	public static String three = "three";
	
	public String test1;

	//instance initializer
	//Everything inside a BRACES { } is a code block, so it's the CODE BLOCK at the same time
	{		
		test1 = "test1";
		//Why it's not an illegal forward reference???
		test2 = "test2";

		//Why it's an illegal forward reference???		
		//System.out.print(test2);	
	}
	
	public String test2;

	public ChapterOneComments() {
		System.out.println("From constructor: " + test2);
	}

	public static void main(String[] args) {

		/*		
		System.out.println("Hello world");
		if (args.length == 2) {
			System.out.println(args[0]);
			System.out.println(args[1]);
		}
		
		testParameters(new String[]{"Max", "is", "Happy!",});
		testParameters(8, 952, 885, 9, 6);
		*/
		
		//java.sql.Date date;

		ChapterOneComments chapter = new ChapterOneComments();

		System.out.println(chapter.oneTwo);

		System.out.println(chapter.test1);

		System.out.println(chapter.test2);
		
	}
	
	//It is not a construcor
	public void ChapterOneComments() {
		System.out.println("It's not a constructor!");
	}

	public static void testParameters(String args[]) {
		for (String arg : args) {System.out.println(arg);}
	}

	public static void testParameters(Integer...args) {
		for (Integer arg : args) {System.out.println(arg);}
	}
}
