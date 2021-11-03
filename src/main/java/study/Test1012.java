package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 */
public class Test1012 {
    public static void main(String[] args) {
        System.out.println("Input Messages : ");
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String[] line = bf.readLine().split(" ");
            int a;
            int b;

            a = Integer.parseInt(line[0]);
            b = Integer.parseInt(line[1]);
            System.out.print(a);
            System.out.print(" ");
            System.out.println(b);

            System.out.println("***************************************************");

            for(String str : line){
                System.out.print(str);
                System.out.print(" ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
