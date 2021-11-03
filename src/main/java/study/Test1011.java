package study;

import org.omg.Messaging.SyncScopeHelper;

import java.util.Scanner;

public class Test1011 {
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
            char strMsg;
            strMsg = scan.next().charAt(0);
            System.out.println(strMsg);
            scan.close();

            /*while(true) {


                *//*char[] arrCh = strMsg.toCharArray();

                for(char c : arrCh){
                    System.out.println(c);
                }*//*

                *//*if (strMsg.equals("exit")) {
                    break;
                }*//*
            }
            scan.close();*/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
