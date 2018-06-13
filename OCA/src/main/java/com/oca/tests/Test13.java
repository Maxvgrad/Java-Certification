import java.util.*;
import java.io.*;

public class Test13 {

    static {STATIC_CONST = 6;}
    {INSTANCE_CONST = 7;}

    public static final int STATIC_CONST;
    public static final int STATIC_CONST2=5;
    public final int INSTANCE_CONST;

    public void m1() {System.out.println("Test13");}

    public static void main(String[] args) {
        for (int i = 0; i < 5; System.out.println(i++)) System.out.println("for");

        int i1 = 0;
        while(i1 < 5) System.out.println(i1++);
        System.out.println("while");

        System.out.println("" + 'a' + 'b');

        int unInit;


        //if(STATIC_CONST < 10) unInit = 10;
        if(STATIC_CONST2 < 10) unInit = 10;

        System.out.println(unInit);

        System.out.println(null + "");


        //------------------

        try {
            System.out.println("ee");
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    //class SubTest13 extends Test13 { public static void m1() { System.out.println("SubTest13"); } }
}
