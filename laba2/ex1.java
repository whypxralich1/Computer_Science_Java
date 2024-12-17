import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше число...");
        double n = scan.nextDouble();
        long rounded = Math.round(n);
        System.out.println("Ваше число: " + rounded);
    }
}
