package ro.mycode.pb6;

public class Application {
    public static void main(String[] args) {

        //TODO: Cea mai mica cifa impara dintr-un nr.


        int nr = 98637;
        int nrImparMic = 10;

        while (nr != 0) {
            int cifra = nr % 10;
            if (cifra < nrImparMic && cifra % 2 != 0) {
                nrImparMic = cifra;
            }
            nr = nr / 10;

        }
        System.out.println(nrImparMic);
    }
}