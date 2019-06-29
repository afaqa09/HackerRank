import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void sprprint(int [][] a, int n, int m){
        
        int t=0,b=n-1,l=0,r=m-1;
        int dir = 0; // 0(l to R) 1(t to b) 2(r to l) 3(b to t)
        while( t<=b && l<=r){
            
            if(dir==0){
            for(int i=l; i<=r; i++)
                System.out.print(a[t][i]+" ");
            t++;
            }
            
            else if(dir==1){
            for(int i=t; i<=b; i++)
                System.out.print(a[i][r]+" ");
            r--;
            
            
            }
            
            else if(dir==2){
            for(int i=r; i>=l; i--)
                System.out.print(a[b][i]+" ");
            b--;
            }
            
            else if(dir==3){
            for(int i=b; i>=t; i--)
                System.out.print(a[i][l]+" ");
            l++;
            }
            
            dir = (dir+1)%4;
            
        }
        
    }
    public static void main(String[] args) {
        int [][] a = { { 1, 2, 3, 4, 5, 6 }, 
                      { 7, 8, 9, 10, 11, 12 }, 
                      { 13, 14, 15, 16, 17, 18 } };
        sprprint(a,3,6);
        
    }
}