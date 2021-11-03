package study;

import java.util.Scanner;

/**
 */
public class Test1020 {
    public static void main(String[] args) {
        System.out.println("Input Messages : ");
        try {

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            sc.close();

            String[] jumin = str.split("-");
            System.out.printf("%06d%06d", Integer.parseInt(jumin[0]), Integer.valueOf(jumin[1]));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
