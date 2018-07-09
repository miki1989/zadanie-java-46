import java.util.Scanner;

public class Kot {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        String name;

        name = scan1.nextLine(); //zakładam, że użytkownik wpisze po prostu "KOT" i tym samym uzyskamy pożądaną odpowiedź;
        System.out.println(name);

        scan1.close();
    }
}
