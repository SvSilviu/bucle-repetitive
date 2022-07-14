package ro.mycode.pb1;

public class Application {
    // todo: algoritm suma cifre

    public static void main(String[] args) {

        int nr = 9212;
        int s = 0;

        while (nr != 0) {
            int c = nr % 10;
            s = s + c;
            nr = nr / 10;
        }

        System.out.println("Suma cifrelor este " +s);
    }
}
