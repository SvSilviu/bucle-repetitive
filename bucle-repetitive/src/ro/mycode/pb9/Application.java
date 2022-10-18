package ro.mycode.pb9;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //TODO : Algoritm de inversare.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul pe care doriti sa-l inversati !");
        int n = scanner.nextInt();
        int nou = 0;

        while (n != 0) {
            int cifra = n % 10;
            nou = (nou * 10) + cifra;

            n = n / 10;
        }
        System.out.println("Numarul inversat este: " + nou);
    }
}
