

public interface Testable {
    public static final int testVar1 = 42;
    static final int testVar2 = 2;
    final int testVar3 = 3;
    //int default = 5;

    //public abstract void testM1();
    //abstract void testM2();
    //void testM3();

    public static void staticMethod() {
        System.out.println("Testable.class staticMethod");
    }
}
