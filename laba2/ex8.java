import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите начальный вклад...");
        double deposit = scan.nextDouble();
        System.out.println("Введите количество лет...");
        int years = scan.nextInt();
        System.out.println("Введите процентную ставку...");
        double interestRate = scan.nextDouble() / 100;

        double totalAmount = deposit;
        System.out.println("Расчет по годам: ");
        for (int year = 1; year <= years; year++){
            totalAmount += totalAmount * interestRate;
            System.out.printf("В конце %d года вы получите %.2f долларов.%n", year, totalAmount);
        }
        System.out.printf("%nЧерез %d лет вы получите %.2f долларов.%n", years, totalAmount);
    }
}