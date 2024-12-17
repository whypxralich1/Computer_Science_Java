import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите натуральное число... ");
        int n = scan.nextInt();

        if (n <0 ){
            System.out.println("Невозможное значение");
        } else {
            int factorial = 1;
            for (int a = 1; a <= n; a++){
                factorial *= a;
            }
            System.out.println("Факториал " + n + " равен " + factorial);
        }

    }
        }