package data;

import java.util.ArrayList;

public class TestB {
    public static void main(String[] args) {
        Fuhrpark f = new Fuhrpark();
        //hinzufügen
         Kraftfahrzeug kf1 = new Kraftfahrzeug(561, 20000, 40000, 2, 1, 80, 440, 1237, 4000, 1254);
         f.hinzufuegen(kf1);

        // entfernen Irgendwas funktioniert da noch nicht so richtig (kann auch ein denkfehler meiner Seite sein)
        System.out.println(f.entfernen(561));
        f.entfernen(561);
        System.out.println(f.entfernen(541));
        f.entfernen(541);

        // ausgabe nur Kraftfahrzeuge
        Fahrrad x1 = new Fahrrad(1, 200, 210, 1, 1, 3);
        Kraftfahrzeug kf2 = new Kraftfahrzeug(582, 21534, 40000, 2, 1, 80, 400, 17946, 4000, 1458);
        f.hinzufuegen(x1);
        f.hinzufuegen(kf1);
        f.ausgabeFahrzeuge(true);

        //suche freies Fahrzeug
        Kraftfahrzeug y1 = new Kraftfahrzeug(88, 2000, 40000, 4, 0, 80, 440, 222, 2145, 120);
        Kraftfahrzeug y2 = new Kraftfahrzeug(55, 1782, 78542, 2, 2, 100, 400, 44444, 400, 18);
        f.hinzufuegen(y1);
        f.hinzufuegen(y2);
        f.sucheFreiesFahrzeug(2);
        System.out.println("Freis fahrzeug" + f.sucheFreiesFahrzeug(2));

        //Sortiert nach Fahrzeugnummer
        f.fahrzeugeSortiertNachFahrzeugnummer();

        //Sortiert nach MaxSitzplätze
        f.fahrzeugeSortiertNachMaxSitzplaetze();

        //tanke Kraftfahrzeug
        Kraftfahrzeug tankex = new Kraftfahrzeug(875, 1245, 80, 2, 1, 80, 400, 489, 4000, 1452);
        tankex.tanken(tankex);
        System.out.println( tankex.tanken(tankex));

        // Fuhrpark tanken
        Kraftfahrzeug t1 = new Kraftfahrzeug(156, 6782, 15878, 3, 1, 100, 90, 1567, 400, 12);
        Kraftfahrzeug t2 = new Kraftfahrzeug(456, 4864, 41278, 3, 1, 111, 100, 815, 200, 145);
        Kraftfahrzeug t3 = new Kraftfahrzeug(60, 485, 7412, 2, 1, 80, 91, 112769, 560, 100);
        f.hinzufuegen(t1);
        f.hinzufuegen(t2);
        f.hinzufuegen(t3);

        System.out.println(f.tanke()); //Korrektur: Text vorher damit man weiß was diese zahl ist.
    }
}
