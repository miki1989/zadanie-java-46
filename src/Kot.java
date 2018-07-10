import java.util.Scanner;

public class Kot {
    public static void main(String[] args) {

        /*Scanner scan1 = new Scanner(System.in);
        String name;

        name = scan1.nextLine(); //zakładam, że użytkownik wpisze po prostu "KOT" i tym samym uzyskamy pożądaną odpowiedź;
        System.out.println(name);

        scan1.close();
        */
        //wartosci dla znaków przyjąłem z kodu ASCII i przez rzutowanie zamieniłem z int na char i połączyłem.
        int ascii = 75;
        int ascii2 = 79;
        int ascii3 = 84;
        char znak = (char)ascii;
        char znak2 = (char)ascii2;
        char znak3 = (char)ascii3;
        System.out.print(znak);
        System.out.print(znak2);
        System.out.print(znak3);

    }
}
