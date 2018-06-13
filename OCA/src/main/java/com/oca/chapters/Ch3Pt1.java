public class Ch3Pt1 {
	public static void main(String[] ar) {
		System.out.println("\t---------------------------------");
		System.out.println("\tCREATING AND MANIPULATION STRINGS");
		System.out.println("\tConcatination");
		System.out.println("\tImmutabilaty");

		String s1 = "2";

		System.out.println(s1.concat("3"));
		System.out.println(s1);

		System.out.println(s1 += s1.concat("3"));
		System.out.println(s1);

		System.out.println("String pool");

		String s2 = "pool"; //using pool
		String s3 = new String("pool");	// no pool

		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));

		System.out.println("\n\tString methods");

		String str = "The String class has dozens of methods.";

		System.out.println(str.length());

		System.out.println(str.charAt(38));
		System.out.println(str.charAt(11));

		System.out.println(str.indexOf('c')); //11
		System.out.println(str.indexOf('d', 12));

		System.out.println(str.indexOf("has"));
		//System.out.println(str.indexOf('of', 12)); error
		System.out.println(str.indexOf("of", 12));
		System.out.println(str.indexOf("class"));  // 11
		System.out.println(str.indexOf("clazz")); // -1

		//String.substring(int start, int end) -> [start, end)

		System.out.println(str.substring(11)); //class ....
		System.out.println(str.substring(11, 15)); // clas
		System.out.println(str.substring(11, 16)); //class
		System.out.println(str.substring(11, 38)); //class .... without last dot
		System.out.println(str.substring(11, 39)); //class .... with a last dot
		//System.out.println(str.substring(11, 40)); //StringIndexOutOfBoundsException
		System.out.println(str.substring(11, 11)); //empty string
		//System.out.println(str.substring(11, 10)); //exception //StringIndexOutOfBoundsException

		System.out.println(str.startsWith("The")); //true
		System.out.println(str.startsWith("[Tt]")); //false
		System.out.println(str.startsWith("Thee")); //false
		System.out.println(str.endsWith("The")); //false
		System.out.println(str.endsWith(".")); //true
		System.out.println(str.endsWith(". ")); //false

		System.out.println(str.contains("")); //true
		System.out.println(str.contains(" ")); //true
		System.out.println(str.contains("class")); //true
		System.out.println(str.contains("class.")); //false


		//Interface CharSequence is implemented by String, StringBuilder, StringBuffer, CharBuffer, Segment
		System.out.println(str.replace("class", "dragon"));
		System.out.println(str.replace("class.", "dragon")); //returns the old string, because it doesn't contains "class."

		System.out.println("a b c\t\n".trim());
		System.out.println("a b c\t\n");

		//Method chain

		System.out.println(" \nAniMaL ".trim().toLowerCase().replaceFirst("a", "A"));

		//String ref test
		System.out.println("-------------------");
		String s11 = "Test";
		String s12 = s11;

		System.out.println("s11 == s12 -> " + (s11 == s12));

		s12 = null;
		System.out.println(s11);
		System.out.println(s12);


		//StringBuilder
		System.out.println("StringBuilder\n");

		StringBuilder sb1 = new StringBuilder("Ready");
		StringBuilder sb2 = sb1.append(" Steady");
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);

		sb2.append(" Go");
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);

		sb2 = null;
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);

		//StringBuilder methods
		System.out.println("\n--------------------");
		StringBuilder sb3 = new StringBuilder("animal");
		System.out.println(sb3.length());
		String subStr = sb3.substring(sb3.indexOf("a"), sb3.indexOf("a", 1));
		System.out.println(sb3.length());
		System.out.println(sb3.indexOf("n",1));

		StringBuilder sb4 = new StringBuilder(10);
		System.out.println(sb4.length());

		//StringBuolder methods
		StringBuilder sb5 = new StringBuilder("isRunning==").append(true);
		System.out.println(sb5);

		System.out.println("indexOf(\"=\") " + sb5.indexOf("="));
		sb5.insert(sb5.indexOf("="), "!");
		System.out.println("length = " + sb5.length()); //16
		System.out.println(sb5);
		System.out.println(sb5.insert(16, "@"));
		//System.out.println(sb5.insert(17, "@")); StringIndexOutOfBoundsException
		System.out.println(sb5.insert(0, "@"));
		System.out.println(sb5.delete(0,1));
		System.out.println(sb5.delete(0,0));
		//System.out.println(sb5.delete(4,0));

		System.out.println(sb5.delete(0,20));
		System.out.println(sb5.length());
		//System.out.println(sb5.deleteCharAt(0)); exve[tion]

		System.out.println(sb5.append("NewAnimal").deleteCharAt(0));

		System.out.println(sb5.reverse());
		CharSequence cs = sb5.toString();
		System.out.println(cs.equals(sb5));
		new Ch3Pt1().checkReturnNull();

	}

	public Void checkReturnNull() {
		System.out.println("Hey");
		return null;
	}
























}
