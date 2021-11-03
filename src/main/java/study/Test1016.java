package study;

import java.util.Scanner;

/**
 */
public class Test1016 {
    public static void main(String[] args) {
        System.out.println("Input Messages : ");
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            System.out.printf("%d", num);
            System.out.printf("%d", num);
            System.out.printf("%d", num);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
