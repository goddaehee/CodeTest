package study;

import java.util.Scanner;

/**
 */
public class Test1015 {
    public static void main(String[] args) {
        System.out.println("Input Messages : ");
        try {
            Scanner scanner = new Scanner(System.in);
            Float num = scanner.nextFloat();

            System.out.printf("%.2f", num);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
