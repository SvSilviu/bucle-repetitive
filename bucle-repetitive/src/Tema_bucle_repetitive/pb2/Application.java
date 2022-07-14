package Tema_bucle_repetitive.pb2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //TODO: Să se scrie un program care să determine produsul cifrelor impare ale unui număr natural citit de la tastatură.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un nr. pentru a calcula produsul cifrelor impare ale lui ! ");
        int nr = scanner.nextInt();
        int produs = 1;

        while (nr != 0) {
            int nrImpar = nr % 10;
            if (nrImpar % 2 != 0) {
                produs=produs*nrImpar;
            }
            nr = nr / 10;
        }
        System.out.println("Rezultatul inmultirii este : "+produs);
    }
}
