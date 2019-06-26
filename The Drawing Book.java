import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {

        int page1 = Math.abs((p) / 2);
        if(n%2==0){
            n++;
        }
        int page2 = Math.abs((p - (n)) / 2);
    return page1 < page2 ? page1 : page2;
    }
       
    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        

        int p = scanner.nextInt();
        

        int result = pageCount(n, p);

        System.out.println(result);


        scanner.close();
    }
}
