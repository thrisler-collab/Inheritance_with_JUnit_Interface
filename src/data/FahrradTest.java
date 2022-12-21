package data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrradTest {

    Fahrrad f;
    @BeforeEach
    void setUp() {
        try {
            f = new Fahrrad(23, 129, 199, 1, 0, 3);
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Test vorbereitet");
    }

    @Test
    void setAnzahlPlaetze() {
        try {
            f.setAnzahlPlaetze(2);
        } catch (Exception e){
            e.printStackTrace();
        }
        assertEquals(2, f.getAnzahlPlaetze());
    }

    //Dieser Test soll einen Fehler ergeben
    @Test
    void setAnzahlPlaetzeF(){
        try {
            f.setAnzahlPlaetze(4);
        }catch (Exception e){
            e.printStackTrace();
        }
        assertEquals(4, f.getAnzahlPlaetze());
    }
}