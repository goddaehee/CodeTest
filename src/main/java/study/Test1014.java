package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 */
public class Test1014 {
    public static void main(String[] args) {
        System.out.println("Input Messages : ");
        try {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();

            for(int i = str.length()-1; i>=0; i--){
                System.out.print(str.charAt(i));
            }
            System.out.println();
            System.out.println("******************************************");

            StringBuffer sb = new StringBuffer();
            sb.append(str);

            System.out.print(sb.reverse());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
