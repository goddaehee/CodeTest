package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 */
public class Test1010 {
    public static void main(String[] args) {
        System.out.println("Input Messages : ");
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String strMsg;
            while (true) {
                strMsg = bufferRead.readLine();

                System.out.println(strMsg);

                if (strMsg.equals("exit")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
