package ro.mycode.pb5;

public class Application {
    public static void main(String[] args) {
        // TODO: Cea mai mare cifra para.

        int nr = 97841;
        int cifraMaximaPara = -1;
        while (nr != 0) {

            int cifra = nr % 10;

            if (cifra > cifraMaximaPara && cifra % 2 == 0) {

                cifraMaximaPara = cifra;

            }
            nr = nr / 10;
        }
        System.out.println("Cea mai amre cifra para este " + cifraMaximaPara);

     }
  }
