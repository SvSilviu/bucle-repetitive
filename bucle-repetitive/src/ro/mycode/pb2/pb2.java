package ro.mycode.pb2;
//TODO:Suma cifrelor pare dintr-un nr.
public class pb2 {
    public static void main(String[] args) {


        int numar = 23493;
        int s = 0;

        while (numar != 0) {

            int cifra = numar % 10;
            if (cifra % 2 == 0) {

                s = s + cifra;
            }
            numar = numar / 10;
        }

        System.out.println("Suma cifrelor pare este "+s);
    }


}
