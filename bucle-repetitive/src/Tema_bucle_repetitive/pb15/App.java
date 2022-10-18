package Tema_bucle_repetitive.pb15;

public class App {
    public static void main(String[] args) {

        //TODO: Să se scrie un program care să determine suma primelor două cifre ale unui număr natural citit de la tastatură.
        int nr = 4598;
        int suma = 0;
        boolean flag = true;

        while (nr > 100) {

            nr = nr / 10;
        }

        int pc = nr / 10;
        int uc = nr % 10;

        System.out.println(uc + pc);

    }
}
