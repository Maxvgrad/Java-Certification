import java.util.*;


public class Ch3Pt4 {
    public static void main(String[] args) {
        String s1 = "Java";
        StringBuilder sb1 = new StringBuilder("Java");

        // if (s1 != sb1)
            // System.out.println("true");
        // } else {
            // System.out.println("false");
        // }

        List l = new ArrayList();
        ArrayList al = new ArrayList();
        Set set = new HashSet();

        if (l == al) {
            System.out.println("true");
        }

        if (al != set) {
            System.out.println("!=");
        }

        String s = "s";
        String java = "s";
        String Java = "s";

        s += 1;

        System.out.println(s);
    }
}
