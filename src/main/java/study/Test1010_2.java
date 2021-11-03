package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 */
public class Test1010_2 {
    public static void main(String[] args) {
        System.out.println("Input Messages : ");
        try {
            /*BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String strMsg;
            while (true) {
                strMsg = bufferRead.readLine();

                System.out.println(strMsg);

                if (strMsg.equals("exit")) {
                    break;
                }
            }*/
            Scanner scan = new Scanner(System.in);
            String strMsg;
            while(true) {
                strMsg = scan.nextLine();

                System.out.println(strMsg);
                if (strMsg.equals("exit")) {
                    break;
                }
            }
            scan.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
