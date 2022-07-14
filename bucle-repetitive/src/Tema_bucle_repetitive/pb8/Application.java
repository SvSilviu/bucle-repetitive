package Tema_bucle_repetitive.pb8;

public class Application {
    public static void main(String[] args) {

        //TODO: Se dau numerele naturale n și k, unde k este o cifră. Să se verifice dacă toate cifrele lui n sunt mai mici sau egale decât k.

        int n = 12345678;
        int k = 9;

        while (n != 0) {
            int x = n % 10;
            if (x <= k) {
                System.out.println("Toate cifrele lui n sunt mai mici sau egale cu cifra k !");
            } else {
                System.out.println("K este mai mare decat toate cifrele lui n !");
            }
            n = n / 10;
        }

        //Se afiseaza mesajul pentru fiecare cifra !!!


    }
}
