package data;

import java.io.IOException;

public class TestSaveLoad {
    public static void main(String[] args) {
        try {
            Kraftfahrzeug k1 = new Kraftfahrzeug(44, 7832, 40000, 4, 1, 100, 400, 58, 60, 20);
            Kraftfahrzeug k2 = new Kraftfahrzeug(734, 739,40000, 6, 2, 60, 67, 987453, 100, 50);
            Kraftfahrzeug k3 = new Kraftfahrzeug(830, 984, 40000, 4, 2, 600, 400, 8498, 30, 10);

            Fuhrpark fp = new Fuhrpark();
            fp.hinzufuegen(k1);
            fp.hinzufuegen(k2);
            fp.hinzufuegen(k3);
            fp.speichernMitSerialisierung("Fuhrpark.fp");

            fp.ladenMitSerialisierung("Fuhrpark.fp");
            fp.ausgabeFahrzeuge(false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
