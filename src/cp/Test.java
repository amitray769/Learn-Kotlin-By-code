package src.cp;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        System.out.println(10.566);

        System.out.println(isPalindrome(121));
    }



    public static boolean isPalindrome(int x) {

        String s = Integer.toString(x);

        StringBuilder sb1 = new StringBuilder();

        for( int i = s.length()-1; i > 0 ; i--){
           // sb1.append(s.get);

        }
        return s.equalsIgnoreCase(sb1.toString());

    }
}


