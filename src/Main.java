import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Zahl;
        System.out.println("Bis zu welcher Zahl soll nach Primzahlen geprüft werden ?");
        Zahl = scanner.nextInt();
        for (int m = 2; m <= Zahl; m++) {
            boolean Primzahl = true;

            for (int n = 2; n < m && Primzahl; n++) {

                if ((m % n) == 0) {
                    Primzahl = false;
                }
            }
            if (Primzahl) {
                System.out.println(m + " ist eine Primzahl.");
            }
        }
    }
}