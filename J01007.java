package com.mycompany.codeaptit;

import java.util.Arrays;
import java.util.Scanner;


public class J01007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long fb[] = new long[95];
        fb[0] =  0;
        fb[1] = 1;
        for(int i = 2; i< 93; i++){
            fb[i] = fb[i-1] + fb[i-2];
        }
        
        int t;
        t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(Arrays.binarySearch(fb, 0, 92, n) >=0){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}