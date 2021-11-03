package study;

import java.util.Scanner;

/**
 */
public class Test1021 {
    public static void main(String[] args) {
        System.out.println("Input Messages : ");
        try {

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            sc.close();

            char [] arr = str.toCharArray();

            for(char out : arr){
                System.out.print(out);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
