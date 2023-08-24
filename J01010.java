
package com.mycompany.codeaptit;

import java.util.Scanner;


public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            String res = "";
            boolean check = true;
          
            for (int i = 0; i< s.length(); i++) {
                if(s.charAt(i) == '0')
                        res += "0";
                else if(s.charAt(i) == '1')
                                res += "1";
                else if(s.charAt(i) == '8')
                        res += "0";
                else if(s.charAt(i) == '9')
                        res += "0";
                else{
                       check = false;
                       break;
                }
            }
            StringBuilder sb = new StringBuilder(res);
            while(sb.length() > 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
            res = sb.toString();
           
            if (check == true && !res.equals(""))
                System.out.println(res);
            else System.out.println("INVALID");
        }
    }
}

