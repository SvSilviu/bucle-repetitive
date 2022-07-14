package Tema_bucle_repetitive.pb4;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //TODO: Să se scrie un program care să determine numărul de cifre ale unui număr natural citit de la tastatură.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti nr. dorit !");

        int nr = scanner.nextInt();
        int contor =0;


        while(nr!=0){
            int cifra = nr%10;
            contor++;
            nr=nr/10;
        }
                System.out.println("Suma cifrelor numarului este : "+contor);
    }
}
