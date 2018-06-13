import java.time.*;
import java.util.*;



public class Test17 {

    public int j = 6;
    public int h = j;

    public static void main(String[] args) {
        System.out.println(5 >= 6 == 7 < 6);

        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);

        LocalDate ld = LocalDate.of(2015, 3, 4);
        System.out.println(ld);

        String str = "hey2";
        System.out.println(10<5 ? "hey" : str+"d");

        StringBuilder sb1 = new StringBuilder("cat");
        StringBuilder sb2 = new StringBuilder("cat");
        System.out.println(sb1.equals(sb2));

        Test17 test = new Test17();
        System.out.println(test.j + " " + test.h);
        //int var.var = 3;
        int var$var = 3;
        //int var&var = 3;
        boolean bool = true;
        //System.out.println(-bool);

    }

    public Test17() {
        System.out.println(j);
        j = 3;
    }
}
