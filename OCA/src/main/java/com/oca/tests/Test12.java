

public class Test12 {
    public static void main(String[] args) {
        try {
            testException();
        } catch (SubNewException e) {
            System.out.println("SubNewException");
            System.out.println(e);
        } catch (NewException e) {
            System.out.println("NewException");
            System.out.println(e);
        }
        System.out.println("---------------");
        final Boolean flag = false;
        //for (int i=0; false; i++) {System.out.println("for");}
        //while (false) {}//{System.out.println("while");}

        for (int i=0; flag; i++) {System.out.println("for");}
        while (flag) {}//{System.out.println("while");}

        if(false){System.out.println("if");}

        //-------
        final int i4 = 4;
        byte b3 = i4;

        int i5 = 5;
        //b3 = i5;

        short s4 = 4;
        //b3 = s4;

        long l4 = 01;
        System.out.println(l4);
        System.out.println(05);

        l4 = 00005;
        System.out.println(l4=0b10);

        //System.out.println( = 39);

        //Byte b4 = new Byte(5);
        //System.out.println(b4);

        final int i7 = 8;
        //takeCoin(i7);
    }
    public static void testException() throws NewException {
        //throw new Exception();
        throw new SubNewException();
    };

    public static void takeCoin(byte coin) {
        System.out.println(coin);
    }

}

class NewException extends Exception {}
class SubNewException extends NewException {}
