package Tema_bucle_repetitive.pb18;

public class App {
    public static void main(String[] args) {

        //TODO: de cate ori apare o anumita cifra in numar
        
        int nr = 12311;
        int cifraCautata = 5;
        int contor = 0;

        while (nr != 0) {
            int cifra = nr % 10;
            if (cifra == cifraCautata){
                contor++;
            }
            nr=nr/10;
        }
        System.out.println("Cifra apare de "+contor+" ori");
    }
}
