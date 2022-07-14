package Tema_bucle_repetitive.pb5;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //TODO: Să se scrie un program care să determine cea mai mare cifră a unui număr natural citit de la tastatură.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul !");

        int nr = scanner.nextInt();
        int cifraMax = -1;

        while (nr != 0) {
            int cifra = nr % 10;
            if (cifra > cifraMax) {
                cifraMax = cifra;
            }
            nr = nr / 10;
        }
        System.out.println("Cea mai mare cifra din nr. este : " + cifraMax);

    }
}
