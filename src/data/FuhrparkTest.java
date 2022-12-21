package data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuhrparkTest {

    Kraftfahrzeug k1;
    Kraftfahrzeug k2;
    Kraftfahrzeug k3;
    Fuhrpark ffp;


    @BeforeEach
    void setUp() {
        try {
            k1 = new Kraftfahrzeug(44, 7832, 40000, 4, 1, 100, 400, 58, 60, 20);
            k2 = new Kraftfahrzeug(734, 739, 40000, 6, 2, 60, 67, 987453, 100, 50);
            k3 = new Kraftfahrzeug(830, 984, 40000, 4, 2, 600, 400, 8498, 30, 10);
            ffp = new Fuhrpark();
            ffp.hinzufuegen(k3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Test ist vorbereitet");
    }

    @Test
    void hinzufuegen() {
        //Mit der erstellen hilfsmethode kann ich die Anzahl einlsen wie viele elemente in meiner Liste sind
        int size = ffp.size();
        try {
            //Tipp: sollten bereits mehere Elemente drinenn sein müssen diese berücksichtoigt werden darum eine lokale
            // Variable welche mir anzeigt wie viele bereits drinnen sind
            ffp.hinzufuegen(k1);
            ffp.hinzufuegen(k2);
            ffp.hinzufuegen(k3);
        } catch (MainException e) {
            e.printStackTrace();
        }
        assertEquals(size + 3, ffp.size());
        //.size + 3 Zählt die bereits vorhandenen Fahrzeiuge zusammen inklusive den neuen Autos
        // mit ffp.size auf der anderen Seite wird dann die ganze Zahl von der Hilfsmethode hergezogen
    }

    @Test
    void check() {
        try {
            ffp.check(k1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertFalse(ffp.check(k1));
    }

    @Test
    void entfernen() {
        try {
            assertTrue(ffp.entfernen(830));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    void tanke() {
        //ffp.tanke();
        assertEquals(20, ffp.tanke());
    }

    //Man darf nicht die methoden 2 mal aufrufen da es bereits verändert wurde wesshalb es dann im Asser equals zu Fehlern kommt
    //Ebenso werden die anderen Methoden unabhänig voneinader ausgeführt wessehalb die anderen Fahrzeuge nicht drinnen sind weil sie nur bei
    //hinzufügen sind darum können die Fahrzeuge nicht in andere Methoden aufgerufen werden!!
    //logischer Denkfehler!!
}