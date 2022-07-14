package Tema_bucle_repetitive.pb3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //TODO: Se dă un număr natural nenul n. Calculați suma cifrelor lui n care sunt mai mari sau egale cu 3 și mai mici sau egale cu 7.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti nr. !");

        int nr = scanner.nextInt();
        int suma = 0;

        while (nr != 0) {

            int cifra = nr % 10;

            if (cifra >= 3 && cifra <= 7) {
                suma = suma + cifra;
            }
            nr = nr / 10;
        }
        System.out.println("Suma este: "+suma);
    }
}
