package data;

import java.util.Comparator;

public class Vergleiche implements Comparator<Fahrzeug>{

    @Override
    public int compare(Fahrzeug o1, Fahrzeug o2) {
        return Integer.compare(o1.anzahlPlaetze, o2.anzahlPlaetze);
    }
}
