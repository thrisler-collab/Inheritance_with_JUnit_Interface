package data;

public class Fahrrad extends Fahrzeug{
    int rahmenhoehe;

    public Fahrrad(int fahreugnummer, int leergewicht, int zulaessigesGewicht, int anzahlPlaetze, int insassen, int rahmenhoehe) throws MainException {
        super(fahreugnummer, leergewicht, zulaessigesGewicht, anzahlPlaetze, insassen);
        this.rahmenhoehe = rahmenhoehe;
        setAnzahlPlaetze(anzahlPlaetze);
        berechneGewicht();
    }

    public int getRahmenhoehe() {
        return rahmenhoehe;
    }

    public void setRahmenhoehe(int rahmenhoehe) {
        this.rahmenhoehe = rahmenhoehe;
    }

    @Override
    public int berechneGewicht() {
        return 0;
    }

    @Override
     public void setAnzahlPlaetze(int anzahlPlaetze) throws MainException {
        if(anzahlPlaetze < 1 || anzahlPlaetze > 2){
            anzahlPlaetze = 1;
        }

        super.setAnzahlPlaetze(anzahlPlaetze);

    }


    @Override
    public int compareTo(Fahrzeug o) {
        return 0;
    }
}
