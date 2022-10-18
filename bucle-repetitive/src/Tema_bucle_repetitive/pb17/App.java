package Tema_bucle_repetitive.pb17;

//todo sa se verifice daca o anumita cifra exista in numar
public class App {
    public static void main(String[] args) {

        int nr = 1234;
        int cifra = 1;
        boolean flag = false;

        while (nr != 0&&flag==false) {
            int a = nr % 10;
            if (a == cifra) {
                flag = true;
            }
            nr = nr / 10;
        }
        System.out.println(flag);
    }
}
