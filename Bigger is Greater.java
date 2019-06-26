import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {

        char [] ws = w.toCharArray();
        int length = w.length();
        int flag = 0;
        int i;
        for(i= length-1; i>0;i--){
            if(ws[i] > ws[i-1]){
                flag=1;
                break;
            }
        }
        if(flag==0)
            return "no answer";
        else{   
            char temp;
            int m = i;
            for ( int j=i+1;j<length;j++){
                if(ws[j] > ws[i-1] && ws[j] < ws[m] ){
                    m = j;
                }
            }
            temp = ws[m];
            ws[m]=ws[i-1];
            ws[i-1]=temp;
        }
        Arrays.sort(ws, i, length);

        return new String(ws);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
