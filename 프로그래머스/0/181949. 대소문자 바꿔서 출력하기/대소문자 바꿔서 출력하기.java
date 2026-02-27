import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String output = "";
        for(int i = 0;i<a.length();i++){
            int temp = (int)a.charAt(i);
            if((65<=temp) && (temp <= 90))
                output += (char)(temp + 32);
            else if((97 <= temp) && (temp<=122))
                output += (char)(temp - 32);
        }
        System.out.print(output);
    }
}