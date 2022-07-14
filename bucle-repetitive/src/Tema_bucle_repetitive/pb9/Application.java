package Tema_bucle_repetitive.pb9;

public class Application {
    public static void main(String[] args) {

        //TODO: Se dă un număr natural n cu cel puțin două cifre, care conține atât cifre pare cât și cifre impare.
        // Calculați produsul dintre cea mai mare cifră pară și cea mai mică cifră impară a lui n.

        int nr = 49268;
        int cifraPara = 0;
        int cifraImpara = 1;

        while(nr!=0){
            int cifra=nr%10;
            if(cifra%2==0&&cifra>cifraPara){
                cifraPara=cifra*cifraImpara;
            }
            if(cifra%2!=0&&cifra<cifraImpara){
                cifraImpara=cifra*cifraPara;
            }
            nr=nr/10;
        }
        System.out.println(cifraPara*cifraImpara);

        //nu este rezultatul care trebuie.

    }
}
