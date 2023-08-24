
package com.mycompany.codeaptit;

import java.util.Scanner;


public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            boolean check = true;
            String s = sc.next();
            for(int i = 1; i< s.length(); i++){
                if (Math.abs(s.charAt(i) - s.charAt(i-1)) != 1){
                    check = false;
                    break;
                }
            }
            
            if(check == true){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
