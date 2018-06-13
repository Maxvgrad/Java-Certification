import static bar.Test15.foo;

public class Test16 {
    static int m = 4;
    public static void main(String[] args) {
        m(4, 4);
        System.out.println(m);
        short sh = new Short("3");
        System.out.println(sh);
    }
    //public static void m(int i) {    System.out.println("int"); }

    //public static void m(long i) {System.out.println("long");}

    public static void m(Long i) { System.out.println("Long"); }
    //public static void m(Number i) {System.out.println("Number");}
    public static void m(Object i) {System.out.println("Object");}
    public static void m(int... i) {
        System.out.println("int...");
    }
    //public static void m(Number i, Number i2) {System.out.println("Number, Number");}
    //public static void m(Object i, Object i2) {System.out.println("Obj, Obj");}

}
