import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int counter = 0;
        for (int value : arr) {
            //counter++;
           if (counter >= 3) {
               break;
           } else {
               continue;
           }
//Test5.java:13: error: unreachable statement
           //if (value > 4) {
        //     arr[counter] = value + 1;
         //  }
         //  counter++;
        }
        System.out.println(arr[counter]);

        //------------
        //Note that for is a keyword and so cannot be used as a label. But you can use any other identifier as a label.
        //For example, The following code is valid even though String is a class name and String is also used as an identifier!
        System.out.println("--------------");
        String: for(int i = 0; i < 5; i++) {
            if (i == 3) {
                continue String;
            } else {
                System.out.println(i);
            }
        }

        String Arrays = "String";
        System.out.println(Arrays.toString());
        //System.out.println(Arrays.toString(arr));
    }
}
