package Tema_bucle_repetitive.pb7;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //TODO:  Să se scrie un program care să determine cea mai mare cifră impară a unui număr natural citit de la tastatură.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti nr. dorit !");
        int nr = scanner.nextInt();
        int nrImpar = -1;

        while (nr != 0) {
            int cifra = nr % 10;
            if (cifra % 2 != 0 && cifra > nrImpar) {
                nrImpar = cifra;
            }
            nr = nr / 10;
        }

        if(nrImpar==-1){
            System.out.println("nu avem cifre impare");
        }else{
            System.out.println("Cea mai mare cifra impara este: " + nrImpar);
        }


    }
}
// daca nu am nicio cifra impara in numar imi afiseaza 1 chiar daca 1 nu exista in numarul initial.