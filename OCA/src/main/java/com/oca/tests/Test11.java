import java.util.*;
import java.util.function.*;

public class Test11 implements Testable {
    public static void main(String[] args) {
        //String s1 = 'a';
        char[] arr1 = new char[] {'a', 'b', 'c'};
        String s2 = null;
        for(char s : arr1) {
            s2 += s;
        }

        System.out.println(s2);

        String hello = "hello";
        String lo = "lo";

        System.out.println("hellolo" == (hello + lo));
        System.out.println("hellolo" == (hello + lo).intern());

        System.out.println(Math.round(-0.5));
        System.out.println(Math.round(-0.6));
        System.out.println(Math.round(-0.4));
        System.out.println(Math.round(0.5));
        System.out.println(Math.round(0.6));
        System.out.println(Math.round(0.4));

        //-------------
        //System.out.println(getIndex());
        int i;
        int[] arr = getArr();
        System.out.println(arr[0]);
        //------------
        boolean b1 = false;
        boolean b2 = false;

        //Unexpected type
        //if (b1 != b2 = !b1) {System.out.println("hello");}


        //---------------
        System.out.println(testVar1);
        System.out.println(new Test11().testVar1);
        System.out.println(Testable.testVar1);
        System.out.println(Test11.testVar1);

        Testable.staticMethod();
        //Test11.staticMethod();

        //return 1L;

        int i4=6;
        System.out.println(returnShort());
        System.out.println(returnInt(i4++));

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(11);
        list.add(121);
        filter(list, num -> num%2!=0);

        System.out.println("-----------------------");

        switch (list.get(0)) {
            case 3 : boolean b = true; break;
            //case 4 : if (b) System.out.println("case 4");
        }
    }

    public static int[] getArr() { System.out.println("getArr()"); return new int[] {1, 2, 3, 4}; }
    public static int getIndex() {System.out.println("getIndex()"); return 0;}

    public void testM1() {}
    public void testM2() {}
    public void testM3() {}

    public static short returnShort() {
        return 4;}
    public static int returnInt(int i) {return i;}

    public static List<Integer> filter (List<Integer> list, CustomPredicate<Integer> p) {
        Iterator<Integer> iterator = list.iterator();
        System.out.println("----filter (List<Integer> list, CustomPredicate<Integer> p)----");
        while (iterator.hasNext()) {
            int i = iterator.next();
            if(p.test(i))
            System.out.println(i);
            //list.remove(iterator.next());
        }
        return list;
    }

}
