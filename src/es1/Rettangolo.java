package es1;

public class Rettangolo {
    public double base;
    public double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("rettangolo 1: ");
        rettangolo1.stampaRettangolo();
        System.out.println("rettangolo 2: ");
        rettangolo2.stampaRettangolo();
        System.out.println("somma perimetri: " + (rettangolo1.perimetro() + rettangolo2.perimetro()));
        System.out.println("somma aree: " + (rettangolo1.area() + rettangolo2.area()));
    }

    public double perimetro() {
        return (this.base * 2) + (this.altezza * 2);
    }

    public double area() {
        return this.base * this.altezza;
    }

    public void stampaRettangolo() {
        System.out.println("il perimetro è " + perimetro());
        System.out.println("l'aera è " + area());
    }
}
