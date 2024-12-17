import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число A: ");
        int a = scan.nextInt();
        System.out.println("Введите второе число B: ");
        int b = scan.nextInt();

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        System.out.println("Четные числа между " + start + " и " + end + ":");

        for (int i = start; i <= end; i++){
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

    }
}