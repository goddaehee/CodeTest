package study;

import java.util.Scanner;

/**
 */
public class Test1019 {
    public static void main(String[] args) {
        System.out.println("Input Messages : ");
        try {

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            sc.close();

            String[] time = str.split("\\.");
            int y = Integer.parseInt(time[0]);
            int m = Integer.parseInt(time[1]);
            int d = Integer.parseInt(time[2]);

            System.out.printf("%04d.%02d.%02d", y, m, d);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
