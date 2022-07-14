package ro.mycode.pb3;

//todo:cea mai mare cifra a unui numar
public class Application {
    public static void main(String[] args) {

        int nr = 78541234;
        int cifraMax = -1;

        while (nr != 0) {
            int cifra = nr % 10;
            if (cifra > cifraMax) {
                cifraMax = cifra;
            }
            nr = nr / 10;
        }

        System.out.println("Cifra maxima este " + cifraMax);
    }
}
