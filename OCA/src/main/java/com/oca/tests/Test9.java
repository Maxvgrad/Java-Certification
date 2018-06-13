import java.time.*;
import java.time.temporal.*;


public class Test9 {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime rand = LocalDateTime.of(2018, 1, 15, 16, 0);
        System.out.println(today);
        System.out.println(rand);
        System.out.println(today.adjustInto(rand));
        System.out.println(today);
        System.out.println(rand);

        Test9 t = new Test9();
        //Testable test = t;
        //String str = t;

        System.out.println(t instanceof Testable);
        //System.out.println(t instanceof String);

    }
}
