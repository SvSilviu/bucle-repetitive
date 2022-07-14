package Tema_bucle_repetitive.pb11;

public class Application {
    public static void main(String[] args) {

       //TODO: inmultirea cifrelor impare din nr.

        int nr = 983;
        int produs = 1;

        while (nr != 0) {
            int cifraImpara = nr % 10;
            if (cifraImpara % 2 != 0) {
                produs = produs * cifraImpara;
            }
            nr = nr / 10;
        }
        System.out.println(produs);
    }
}
