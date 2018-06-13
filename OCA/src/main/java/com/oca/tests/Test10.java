public class Test10 {
    public static void main(String[] args) {
        //public int a = 0;
        //protected int b = 0;
        int c = 0;
        //private int d = 0;
        //static int e = 0;
        final int f = 0;


        System.out.println(25.5 % 2);
        System.out.println(25.5 % 2.5);
        System.out.println(25 % 2.5);

        System.out.println(25.5 % -2);
        System.out.println(-25.5 % 2.5);


        //float fl = 10.0;
        //int in = 10l;
        //System.out.println(fl);
        //char c3 = 67000;
        char e = 8;
        switch(e) {
            case 6700 : break;
        }

        switch (e) {}

        byte b =127;

        switch (b) {
            case -128 : System.out.println(-128);
            case 127 : System.out.println(127);
        }

        Integer i5 = 5;
        switch (i5) {
            //case (byte)5 : System.out.println("case (byte)5:");
            case 5 : System.out.println("case 5:");
        }

        int i6 = 6;
        switch (i6) {
            //case (byte)6 : System.out.println("case (byte)6:");
            case 6 : System.out.println("case 6:");
        }

        //------------------------
        int i1 = 1234567890;
        float f1 = i1;
        System.out.printf("Int=%d Float=%f", i1, f1);
        System.out.println(i1 - (int)f1);
        //-------------
        converter(145);
        converter(1456);
        converter(14568);
        converter(145689);
        converter(1456892);
        converter(14568924);
        converter(445689248);
        converter(545689248);
        converter(945689248);
        converter(1456892482);
        converter(2118924822);
        //-------------

//BreakLable:
        System.out.println("before if");
BreakLable:
        if(true) {
            System.out.println("if");
            break BreakLable;
        }

        System.out.println("after if");

        System.out.println("before if 2");

        if(true) {
            //BreakLable:
            System.out.println("if 2");
            //break BreakLable;
            //break;
        }
        System.out.println("after if 2");
        A:
        {
            System.out.println("1");
            {
                System.out.println("2");
                if(true) {
                    System.out.println("3");
                    break A;
                }
                System.out.println("4");
            }
            System.out.println("5");
        }
        System.out.println("6"); // -> 1236

        //----------------

        short sh = Short.MAX_VALUE;
        char ch = (char)sh;
        System.out.println(ch == Short.MAX_VALUE);

        //------------------
        if (false) ; else ;
    }

    public static void converter(int i1) {
        System.out.println("\t Converter of " + i1);
        float f1 = i1;
        System.out.printf("Int=%d Float=%f\n", i1, f1);
        System.out.println(i1 - (int)f1);
    }
}
