package Tema_bucle_repetitive.pb6;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //TODO:  Se dă un număr natural n. Determinaţi cea mai mare cifră pară a sa. Dacă numărul nu are cifre pare se va afişa numărul 10.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti nr. dorit !");
        int nr = scanner.nextInt();
        int nrPar = 0;

        while (nr != 0) {
            int cifra = nr % 10;
            if (cifra % 2 == 0 && cifra > nrPar) {
                nrPar = cifra;
            }
            if(cifra%2!=0){
                System.out.println("10");
            }

            nr = nr / 10;
        }
        System.out.println("Cifra para cea mai mare este: "+nrPar);
    }
}
// Se afiseaza 10 la fiecare nr impar din numar , afiseaza 0 daca nu exista numere pari.