package Tema_bucle_repetitive.pb8;

public class Application {
    public static void main(String[] args) {

        //TODO: Se dau numerele naturale n și k, unde k este o cifră. Să se verifice dacă toate cifrele lui n sunt mai mici sau egale decât k.

        int nr = 123455;
        int k = 7;

        boolean semn = true;

        while (nr != 0) {
            int cifra = nr % 10;
            if (cifra > k) {

                semn = false;
            }
            nr = nr / 10;
        }

        if (semn == true) {
            System.out.println("Este adevarat");
        } else {
            System.out.println("Nu este adevarat");
        }



    }
}
