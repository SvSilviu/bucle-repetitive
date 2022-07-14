package Tema_bucle_repetitive.pb14;

public class App {
    public static void main(String[] args) {

        //TODO: Să se scrie un program care să determine numărul de apariţii a ultimei cifre în scrierea unui număr natural citit de la tastatură.

        int nr = 123333365;
        int ultimaCifra = 0;

        while (nr != 0) {
            int cifra = nr % 10;
            if (cifra == 3) {
                cifra = ultimaCifra++;
            }
            nr = nr / 10;
        }
        System.out.println("Numarul 3 apare de "+ultimaCifra+" ori");
    }
}
