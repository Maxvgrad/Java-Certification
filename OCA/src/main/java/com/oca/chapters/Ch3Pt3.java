import java.util.*;

import java.util.function.*;

public class Ch3Pt3 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("Hello");
        System.out.println(list1);
        list1.add(0, "He");
        list1.add(1, "Helloo");
        System.out.println(list1);

        list1.set(0, "world");
        System.out.println(list1);

        System.out.println(list1.remove(2));
        System.out.println(list1);
        System.out.println(list1.remove("Lady"));
        list1.clear();
        System.out.println(list1.isEmpty());

        //-----------------

        Integer wrapper1 = Integer.valueOf("123");
        int prim1 = Integer.parseInt("123");

        //-----------------

        List<Integer> list2 = new ArrayList<>();
        list2.add(null);
        list2.add(null);
        list2.add(new Integer(1));
        list2.add(Integer.valueOf("2"));
        list2.add(3);
        System.out.println(list2);

        int i1 = list2.get(3);
        try {
            int i2 = list2.get(1); //Throws NullPointerException
        } catch (NullPointerException e) {
            //unboxint isn't work in null
        }

        //-------------------

        List<String> strList = new ArrayList<>();
        strList.add("one");
        strList.add("two");
        strList.add("three");

        Object[] arrFromList1 = strList.toArray();

        System.out.println(Arrays.toString(arrFromList1));

        String[] strArrFromlist = strList.toArray(new String[0]);
        System.out.println(Arrays.toString(strArrFromlist));

        String[] strArrFromlist2 = strList.toArray(new String[5]);
        System.out.println(Arrays.toString(strArrFromlist2));

        String sFun = "fun";
        Supplier<String> supFun = () -> sFun;
        System.out.println(supFun.get());
        //String sfun = () -> "hello";
        //System.out.println(sfun);
    }

}
