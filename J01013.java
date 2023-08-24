
package com.mycompany.codeaptit;

import java.util.Scanner;

public class J01013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[2000005];
        a[0] = a[1] = 1; 
        for(int i = 2; i<= Math.sqrt(2000000); i++){
            if(a[i] == 0){
                for(int j = i*i; j<= 2000000; j+=i){
                    a[j] = i;
                }
            }
        }
        
        for(int i = 2; i<= 2000000; i++){
            if(a[i] == 0){
                a[i] = i;
            }
        }
        
        int n = sc.nextInt();
        long sum = 0;
        while(n-- > 0){
//            System.out.println(n);
            int tmp = sc.nextInt();
            while(tmp > 1){
                sum += a[tmp];
                tmp /= a[tmp];
            }
            
        }
        
        System.out.println(sum);
    }
}
