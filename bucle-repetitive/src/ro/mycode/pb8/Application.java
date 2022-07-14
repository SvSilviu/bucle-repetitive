package ro.mycode.pb8;


public class Application {
    public static void main(String[] args) {

        //TODO: contor cifre pare.

        int nr = 4251829;
        int contor = 0;

        while (nr != 0) {
            int cifra = nr % 10;
            if (cifra % 2 == 0) {
                contor++;
            }
            nr=nr/10;


        }
        System.out.println("Numarul are "+contor+" cifre pare");
    }
}
