package data;

public class Motorad extends Kraftfahrzeug{
    boolean beiwagen;


    public Motorad(int fahreugnummer, int leergewicht, int zulaessigesGewicht, int anzahlPlaetze, int insassen, int hoechstgeschwindigkeit, int leistungPS, int kilometerstand, boolean beiwagen, float tankgroesse, float tankinhalt) {
        super(fahreugnummer, leergewicht, zulaessigesGewicht, anzahlPlaetze, insassen, hoechstgeschwindigkeit, leistungPS, kilometerstand, tankgroesse, tankinhalt);
        this.beiwagen = beiwagen;
    }

    public boolean isBeiwagen() {
        return beiwagen;
    }

    public void setBeiwagen(boolean beiwagen) {
        this.beiwagen = beiwagen;
    }

    @Override
    public void setAnzahlPlaetze(int anzahlPlaetze) throws MainException {
        if(anzahlPlaetze < 1 || anzahlPlaetze >2){

            anzahlPlaetze = 1;
            throw new MainException("Ungültige Anzahl der Sitzplätze der wert wurde auf 1 korrigiert -> Motorad override setAnzahlPlaetze");
        }

        super.setAnzahlPlaetze(anzahlPlaetze);
    }
}
