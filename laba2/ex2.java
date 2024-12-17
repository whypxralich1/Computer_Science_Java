import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

    double pound = 1.487;
    double franc = 0.172;
    double marka = 0.584;
    double yen = 0.00955;

    System.out.print ("Введите сумну: ");
    double dollars = scan.nextDouble();

    double pounds = dollars / pound;
    double francs = dollars / franc;
    double marks = dollars / marka;
    double yens = dollars / yen;

    System.out.printf ("Вы получите: \n");
    System.out.printf("%.3f фунта\n", pounds);
    System.out.printf("%.3f франка\n", francs);
    System.out.printf("%.3f немецкой марки\n", marks);
    System.out.printf("%.3f йены\n", yens);

    }
}