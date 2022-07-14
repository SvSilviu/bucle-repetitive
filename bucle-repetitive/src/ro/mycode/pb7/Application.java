package ro.mycode.pb7;

public class Application {
    public static void main(String[] args) {

        //todo:cate cifre are numarul.

        int nr = 9675234;
        int contor = 0;


        while (nr != 0) {
            int cifra = nr % 10;
            contor++;
            nr = nr / 10;
        }
        System.out.println("Numarul are "+contor+" cifre");


    }

}
