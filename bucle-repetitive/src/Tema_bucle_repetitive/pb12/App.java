package Tema_bucle_repetitive.pb12;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //TODO: Să se scrie un program care să determine ultima cifră pară a unui număr natural citit de la tastatură.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul !");

        int nr = scanner.nextInt();
        int cifraPara = 0;

        boolean gasit = false;

        while (nr != 0 && gasit == false) {
            int cifra = nr % 10;
            if (cifra % 2 == 0) {
                cifraPara = cifra;
                gasit = true;
            }
            nr = nr / 10;
        }
        System.out.println(cifraPara);
    }
}
//cum aflu care e ultima ?