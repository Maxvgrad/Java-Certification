import java.util.*;


public class Ch4Pt1 {
    private static String statOne = "statOne";
    static{System.out.println(statOne);}
    static{new Ch4Pt1();}
    private static final int one;
    //private static final int two; varaible two is not initialized in default constructor
    private final static ArrayList<Integer> list = new ArrayList<>();
    static {
        //System.out.println(one); variable one might not been initialized
        int a = 0; //local vatiable
        System.out.println(a);
        one = 3;
    }

    private String color;
    public Ch4Pt1(String color) {
        color = this.color;
        System.out.println(color);
    }
    public Ch4Pt1() {
        //WOOOOOOPS
        //System.out.println("ddd");
        this("Red");
    }

    public static void main(String[] args) {
        //String[] args; Variable is already defined in method
        list.add(5);
        System.out.println(list);
        //list = null; can not assign value to final vatiable

        //--------------

        System.out.println(one);
        fly();
        fly(1);
        fly(1,2);

        //f1(1); reference to f1 is ambiguouse

        f2(1);
        f2(0.1);

        //In java languge variables passes by value


        //-------------
        new Ch4Pt1("Red");

        new Ch4Pt1();

    }

    public static void fly() {System.out.println("fly()");}
    //public static int fly() {} method is alredy defined in class
    //public void fly() throws Exception {}
    public static void fly(int a) {System.out.println("fly(int a)");}
    public static void fly(int... a) {System.out.println("fly(int... a)");}

    public static void f1(int a , int... b) {System.out.println("f1(int...a , int b)");}
    public static void f1(int a , String... b) {System.out.println("f2(int...a , String b)");}
    //public static void f1(int a , String... b) {System.out.println("f3(int...a , String... b)");}
    //public static void f1(int a , int... b) {System.out.println("f4(int a , int... b)");}

    //public static void f2(int a) {System.out.println("f2(int...a)");}
    //public static void f2(Integer a) {System.out.println("f2(Integer...a)");}
    public static void f2(Double a) {System.out.println("f2(Double...a)");}
    public static void f2(Number a) {System.out.println("f2(Number...a)");}
    public static void f2(Object a) {System.out.println("f2(Object...a)");}


}
