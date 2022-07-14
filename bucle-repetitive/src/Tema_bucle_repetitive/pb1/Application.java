package Tema_bucle_repetitive.pb1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //TODO:Să se scrie un program care să determine suma cifrelor unui număr natural citit de la tastatură.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un nr. : ");

        int nr = scanner.nextInt();
        int suma = 0;

        while (nr % 10 != 0) {
            int cifra = nr % 10;
            suma = suma + cifra;
            nr = nr / 10;
        }
        System.out.println("Suma cifrelor din numar este : " + suma);
    }
}
