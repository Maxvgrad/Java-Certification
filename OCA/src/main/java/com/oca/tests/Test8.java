import java.util.*;
import java.io.*;

public class Test8 {
    public static void main(String[] args) throws Exception {
        testTryCatch();
        Car car = null;
        try {
            car = new Car();
        } catch (IOException e) {
            System.out.println("IOException");
        }
        System.out.println(car);
        //System.out.println(car.i);

        tryLable();

        new Test8().ohNo();



        Integer i = 9;
        Short s = 9;
        //System.out.println(i == s);
        String str = "ddd";
        //System.out.println(str instanceof Date);
        System.out.println(9 == new Long(9));
        //System.out.println(str instanceof Date);
        //System.out.println(str instanceof Date);

        int zero = -0;
        System.out.println(zero);
    }

    public static void testTryCatch() {
        try {
            System.out.println("1");
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2");
            //throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("3");
        } finally {
            System.out.println("4");
        }

        B b = new B();

        System.out.println(b instanceof A);
    }
    public static void tryLable() {
        Lable :
        {
            int i = 5;
            System.out.println("block");

            if (i < 10) break Lable;
            System.out.println("Hey");
        }

        System.out.println("After block");
    }

    public int ohNo() throws IOException {
        return 7;
    }


}
class Car {
    int i = 5;

    public Car() throws IOException {
        throw new IOException();
    }
}
