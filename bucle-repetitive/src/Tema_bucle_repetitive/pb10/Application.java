package Tema_bucle_repetitive.pb10;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //TODO: Să se scrie un program care să determine oglinditul unui număr natural citit de la tastatură.

        Scanner scaner = new Scanner(System.in);
        System.out.println("Introduceri un nr. !");
        int nr = scaner.nextInt();
        int nou = 0;

        while (nr != 0) {
            int cifra = nr % 10;
            nou = (nou * 10) + cifra;
            nr = nr / 10;
        }
        System.out.println("Numarul inversat este : " + nou);

    }

}
