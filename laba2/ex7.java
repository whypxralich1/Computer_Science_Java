import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        System.out.println("Четные числа от 25 до 62: ");
        for (int n = 25; n <= 62; n++){
            if (n % 2 == 0){
                System.out.println(n);
            }
        }
    }
}