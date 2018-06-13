

public class Test3 {
    public static void main(String[] args) {
        System.out.println(args);
        //System.out.println(null);  error: reference to println is ambiguous
        System.out.println("" + null);

        //Remember that the args array is never null.
        if (args != null) {System.out.println("true block");}
        {System.out.println("other block");}

        //--------------
        if (false)
        if (false) System.out.println("True False");
        else System.out.println("True True");
        else System.out.println("Hello");

        //-------------
        int i = 4;
        if (3 == 4 ) {
            System.out.println("");
        }

        //
        //System.out.println(null + true); //1
        System.out.println(new Boolean("true").toString() + null); //2
        //System.out.println(null + null); //3
        //-----------

        int k = 1;
        int[] a = { 1 };
        k += (k = 4) * (k = 5);
        a[0] += (a[0] = 4) * (a[0] + 2);
        System.out.println( k + " , " + a[0]);

        //switch (2l) { //incompatible types: possible lossy conversion from long to int
    //        case 2l : System.out.println("2l");
    //        default : System.out.println("default");
    //    }

        System.out.println(4!=4?out2():out1());

        Object t = new Integer(105);
        int k2 = ((Integer) t)/10;
        System.out.println(k2);
        //---------

        System.out.println('a' + 1); //98
        System.out.println((char)('a' + 1)); //b

        byte b1 = 3;
        Byte b2 = new Byte((byte)1);
        System.out.println(b2);

        switch(b2) {
            case 1 : System.out.println("case 1"); break;
            default : System.out.println("default");
        }



    }



    static String out1() {return "d";}
    static int out2() {return 2;}

}
