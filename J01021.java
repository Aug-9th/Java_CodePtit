
package com.mycompany.codeaptit;

import java.util.Scanner;


public class J01021 {
    static int mod = (int)1e9 + 7;
    public static long mu(long a, long b){
        long res = 1;
        
        while(b > 0){
            if(b % 2 == 1){
                res *= a;
                res %= mod;
            }
            a *= a;
            a %= mod;
            b/= 2;
        }
        
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            
            if(a == 0 && b == 0){
                break;
            }
            System.out.println(mu(a, b));
        }
    }
}
