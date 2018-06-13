

public class Ch6Pt1 {
    public static void main(String[] args) {
/*
* Ch6Pt1.java:5: error: 'try' without 'catch', 'finally' or resource declarations
*        try{
        ^
*1 error


        try{
            System.out.println("hello");
        }
*/

        try {
            System.out.println("try");
            System.exit(0);
        } catch(Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }

    }
}
