package bar;

import java.util.*;

public class Test15 {
    static int foo = 40;
    static void foo() {
        System.out.println("foo");
    }
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("12345678");
        System.out.println(sb1);
        sb1.setLength(5);
        JIL: System.out.println(sb1);

        JON:
        {break JON;}
        System.out.println("after JON");
        JON: ;

        int _d = 5;
        System.out.println(_d);
        int $d = 6;
        System.out.println($d);
        //int 2d = 6;
        //int .d = 5;
        System.out.println($d);

        List<Integer> listOne = new ArrayList<>();
        System.out.println(listOne.add(4));
        listOne.add(0, 7);
        listOne.add(0, 8);
        listOne.add(0, 8);
        listOne.add(0, 8);
        System.out.println(listOne);
        System.out.println(listOne.remove(4));
        System.out.println(listOne.remove(new Integer(8)));
        System.out.println(listOne);
        Testable.staticMethod();

        Testable test = new Test15();
        //test.staticMethod();
        System.out.println(test.testVar1);
        //System.out.println(((Test15) test).testVar1);

        System.out.println("StringBuilde capacity");
        StringBuilder sb2 = new StringBuilder(50);
        System.out.println(sb2.capacity());
        sb2.ensureCapacity(20);
        System.out.println(sb2.capacity());
        sb2.ensureCapacity(103);
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        sb2.setLength(10);
        System.out.println(sb2.length());
        sb2.append("goal");
        System.out.println(sb2);
        sb2.trimToSize();
        System.out.println(sb2.capacity());

        System.out.println(.4);
    }

}
