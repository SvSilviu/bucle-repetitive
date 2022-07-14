package ro.mycode.pb4;

public class Application {

    public static void main(String[] args) {

        //todo : cifra minima  a unui numar.

        int nr = 41972;
        int nrMin = 10;

        while (nr != 0) {
            int cifra = nr % 10;
            if (cifra < nrMin) {

                nrMin=cifra;
            }
            nr = nr / 10;
        }
        System.out.println(nrMin);
    }
}
