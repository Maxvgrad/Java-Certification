import java.util.*;


public class Test2 {
    public static void main(String[] args) {
        short short1 = 12;
        short short2 = 13, short3 = 15, short4 = 17, short5;

        //------------
        int i1 = 5;
        int a = new Integer(4) + i1;
        System.out.println(a);

        //------------
        System.out.println(new Boolean("True"));
        System.out.println(new Boolean("TruE"));
        System.out.println(new Boolean("true"));

        System.out.println(true == new Boolean("true"));
        System.out.println(new Boolean("true") == new Boolean("true"));
        System.out.println(new Boolean("true").equals(new Boolean("truE")));

        //----------
        System.out.println(new Long("123"));
        //System.out.println(new Long("123L"));
        //System.out.println(new Long("123l"));
        //System.out.println(Long.parseLong("123l"));
        //System.out.println(Long.valueOf("2l"));

        //----------
        System.out.println("ROUNDING");
        System.out.println(Math.round(0.5));
        System.out.println(Math.round(0.5f));

        System.out.println(Math.round(0.4f));
        System.out.println(Math.round(0.4));

        System.out.println(Math.round(0.6f));
        System.out.println(Math.round(0.6));
        //-------------
        //variable might not been initilized
        int n = 4;
        String notInitialized;
        if(n > 0) notInitialized = "init";
        else if (n <= 0) notInitialized = "init";
        else notInitialized = "FINALINIT";
        if(n <= 0) notInitialized = "init";
        System.out.println(notInitialized);
        //---------------
        //An underscore can only occur in between two digits.
        long l1 = 34_43_54L;
        //long l2 = 34_4354_L;
        float f1 = 34_4.3_54f;
        //float f2 = 34_43_5.4_f;


    }
    //class NewInteger extends Integer {}  Integer is final as Boolean, Byte, Character, Short, Float, Double

    //TODO Long constructors
    //TODO Math round
}
