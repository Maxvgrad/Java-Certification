public class Test4 {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][];
        System.out.println(arr1[0]); //null

        //int[][] arr2 = new int[][2];
        //System.out.println(arr2);

        Object[] arr3 = new Object[]{new String[]{ }};
        System.out.println(((String[])arr3[0]).length);
        //-----------

        System.out.println("" + null);
        System.out.println(null + "");
        //-----------
        int[][] matrix = new int[4][5];
        for(int i=0; i<5;i++) matrix[1][i] = 1;






    }
    //Note that the program ends with ExceptionInInitializerError
    // any exception thrown in a static block is wrapped into ExceptionInInitializerError
    // and then that ExceptionInInitializerError is thrown.
    //Remember that a static or instance initializer can only throw a RuntimeException.
    //If you try to throw a checked exception from a static or instance initializer block to the outside, the code will not compile.

    //Exception in thread "main" java.lang.ExceptionInInitializerError
    //Caused by: java.lang.ArrayIndexOutOfBoundsException: 0
	//     at Test4.<clinit>(Test4.java:29)

    static {
        int[] arr1 = {};
        //arr1[0]=5;
    }
    //Even though the line x[0] = 10; will throw java.lang.ArrayIndexOutOfBoundsException,
    //JVM will wrap it and rethrow java.lang.ExceptionInInitializerError.
}
