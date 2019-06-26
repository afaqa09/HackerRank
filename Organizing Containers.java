import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String isSame(long[] a, long[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return "Impossible";
            }
        }
        return "Possible";
    }

    // Complete the organizingContainers function below.
    static String organizingContainers(int[][] container) {

        int n = container.length;

        long[] rowSums = new long[n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                rowSums[r] += container[r][c];
            }
        }

        long[] colSums = new long[n];
        for (int c = 0; c < n; c++) {
            for (int r = 0; r < n; r++) {
                colSums[c] += container[r][c];
            }
        }

        return isSame(rowSums, colSums);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] container = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] containerRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowItems[j]);
                    container[i][j] = containerItem;
                }
            }

            String result = organizingContainers(container);

            System.out.println(result);
        }

       

        
    }
}
