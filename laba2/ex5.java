import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввдеите значение a...");
        int a = scan.nextInt();
        System.out.println("Ввдеите значение b...");
        int b = scan.nextInt();
        if (a==0){
            if (b == 0) {
                System.out.println("inf"); //решений бесконечно
            } else {
                System.out.println("no"); //решений нет
            }
        } else {
            int x = -b / a;
            if (-b % a == 0){
                System.out.println(x);
            } else {
                System.out.println("no");
            }
        }
    }
}