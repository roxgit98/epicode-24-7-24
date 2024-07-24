package es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci base");
        double base1 = Integer.parseInt(scanner.nextLine());
        System.out.println("inserisci altezza");
        double altezza1 = Integer.parseInt(scanner.nextLine());

        Rettangolo rettangolo1 = new Rettangolo(base1, altezza1);


        System.out.println("inserisci 2° base");
        double base2 = Integer.parseInt(scanner.nextLine());
        System.out.println("inserisci 2° altezza");
        double altezza2 = Integer.parseInt(scanner.nextLine());

        Rettangolo rettangolo2 = new Rettangolo(base2, altezza2);

        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}
