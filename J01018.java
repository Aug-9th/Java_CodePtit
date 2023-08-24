
package com.mycompany.codeaptit;

import java.util.Scanner;

public class J01018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            boolean check = true;
            String s = sc.next();
            int sum = s.charAt(0) - '0';
            for(int i = 1; i< s.length(); i++){
                if (Math.abs(s.charAt(i) - s.charAt(i-1)) != 2){
                    check = false;
                    break;
                }
                sum += s.charAt(i) - '0';
            }
            
            if(check == true && sum % 10 == 0){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
