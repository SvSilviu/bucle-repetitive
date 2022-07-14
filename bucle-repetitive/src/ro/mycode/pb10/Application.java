package ro.mycode.pb10;

public class Application {
    public static void main(String[] args) {
        //TODO: Să se scrie un program care să determine produsul cifrelor impare ale unui număr natural citit de la tastatură.

        int nr = 975321;
        int produs = 1;

        while (nr != 0) {
            int nrImpar = nr % 10;
            if (nrImpar % 2 != 0) {
                produs = produs * nrImpar;

            }
            nr = nr / 10;

        }
        System.out.println("Produsul numerelor impare este : " + produs);
    }
}
