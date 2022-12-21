package data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
                                                                 // Serializable nicht vergessen großer Fehler !!!
public abstract class Fahrzeug implements Comparable<Fahrzeug> , Serializable {
    int fahreugnummer;
    int leergewicht;
    int zulaessigesGewicht;
    int anzahlPlaetze;
    int insassen;

    public Fahrzeug(int fahreugnummer, int leergewicht, int zulaessigesGewicht, int anzahlPlaetze, int insassen) {
        this.fahreugnummer = fahreugnummer;
        this.leergewicht = leergewicht;
        this.zulaessigesGewicht = zulaessigesGewicht;
        this.anzahlPlaetze = anzahlPlaetze;      // korrektur: Seter verwenden
        this.insassen = insassen;
    }

    public int getFahreugnummer() {
        return fahreugnummer;
    }

    public int getLeergewicht() {
        return leergewicht;
    }

    public int getZulaessigesGewicht() {
        return zulaessigesGewicht;
    }

    public int getAnzahlPlaetze() {
        return anzahlPlaetze;
    }

    public void setFahreugnummer(int fahreugnummer) {
        this.fahreugnummer = fahreugnummer;
    }

    public void setLeergewicht(int leergewicht) {
        this.leergewicht = leergewicht;
    }

    public void setZulaessigesGewicht(int zulaessigesGewicht) {
        this.zulaessigesGewicht = zulaessigesGewicht;
    }

    public void setAnzahlPlaetze(int anzahlPlaetze) throws MainException {
        this.anzahlPlaetze = anzahlPlaetze;
    }

    public int getInsassen() {
        return insassen;
    }

    public void setInsassen(int insassen) throws MainException{
       if(insassen > anzahlPlaetze){
           throw new MainException("Zu viele Insassen in diesem Auto -> setInsassen() Fahrzeug");
       } else {
           this.insassen = insassen;
       }
    }


    public abstract int berechneGewicht();

    @Override
    public String toString() {  // korrektur: statt fahrzeug getclass.getsimplename liefert den namen der dklasse von dem objekt
        return "Fahrzeug{" +
                "fahreugnummer=" + fahreugnummer +
                ", leergewicht=" + leergewicht +
                ", zulaessigesGewicht=" + zulaessigesGewicht +
                ", anzahlPlaetze=" + anzahlPlaetze +
                ", insassen=" + insassen +
                ", Aktuelles Gewicht= " + berechneGewicht() +
                '}';
    }

    public void printInfo(){
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fahrzeug fahrzeug = (Fahrzeug) o;
        return fahreugnummer == fahrzeug.fahreugnummer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fahreugnummer);
    }

    @Override
    public int compareTo(Fahrzeug o) {
        return Long.compare(this.fahreugnummer, o.getFahreugnummer());
    }


}
