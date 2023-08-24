
package com.mycompany.codeaptit;

import java.util.Scanner;


public class J01022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long fb[] = new long[94];
        fb[0] = 0;
        fb[1] = fb[2] = 1;
        
        for(int i = 3; i<= 92; i++){
            fb[i] = fb[i-1] + fb[i-2];
        }
        
        int t = sc.nextInt();
        String s = "001";
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            
            while(n > 2){
                if(k <= fb[n-2]){
                    n-=2;
                }
                else{
                    k -= fb[n-2];
                    n--; 
                }
            }
            
            System.out.println(s.charAt(n));
        }
    }
}
