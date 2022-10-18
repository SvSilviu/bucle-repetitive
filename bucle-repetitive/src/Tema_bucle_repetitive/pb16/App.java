package Tema_bucle_repetitive.pb16;

//TODO:     Se citeşte de la tastatură un număr natural. Să se determine cea mai mare cifră care apare în scrierea acestuia şi numărul de apariţii ale ei.

public class App {
    public static void main(String[] args) {

        int nr = 459499;
        int cifraMax = 0;

        while(nr!=0){
            int cifra = nr % 10;
            if (cifra == 9){
                cifra=cifraMax++;
            }
            nr=nr/10;
        }
        System.out.println("Cifra cea mai mare din nr. este 9");
        System.out.println("Cifra se gaseste in numar de "+cifraMax+" ori");
    }
   }
