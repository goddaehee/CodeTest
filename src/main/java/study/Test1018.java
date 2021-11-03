package study;

import java.util.Scanner;

/**
 */
public class Test1018 {
    public static void main(String[] args) {
        System.out.println("Input Messages : ");
        try {

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            sc.close();

            System.out.printf("%s", str);

            /*
            // 2번째
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            sc.close();

            String[] time = str.split(":");
            System.out.printf("%d:%d", Integer.parseInt(time[0]), Integer.parseInt(time[1]));
            */

            /*
            // 3번째
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            sc.close();

            String[] time = str.split(":");
            System.out.printf("%d:%d", Integer.valueOf(time[0]), Integer.valueOf(time[1]));
            */

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
