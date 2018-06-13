

public class Test6 {
    static {

        const2 = "const2";
        //System.out.println(const2);
    }
    public static final String const1 = "const1";
    public static final String const2;
    //public static final String const3;


    public final String const4 = "const4";
    public final String const5;
    {const5 = "5";}

    public Test6() {
        //const3 = "const3";
        //const5 = "const5";
    }

    public static void main(String[] args) {
        System.out.println(const2);

        sum(1.0, 0.0);
        sum(1, 1);
        sum(1.0f, 2.0);

        new Test6New().byPass(5);
    }

    static void sum(float a, float b) {
        System.out.println("f + f:" + (a + b));
    }

    static void sum(double a, double b) {
        System.out.println("d + d:" + (a + b));
    }

    static void sum(double a, float b) {
        System.out.println("d + f:" + (a + b));
    }

    public int byPass(long a) {
        System.out.println("parant");
        return a;
    }
}
class Test6New extends Test6 {
   public long byPass(long a) {
       System.out.println("chaild");
       return 4;
   }
}
