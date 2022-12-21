package data;

public class LastKraftWagen extends Kraftfahrzeug{
    int lademenge; //in KG
    int maximaleLademenge;


    public LastKraftWagen(int fahreugnummer, int leergewicht, int zulaessigesGewicht, int anzahlPlaetze, int insassen, int hoechstgeschwindigkeit, int leistungPS, int kilometerstand, int lademenge, int maximaleLademenge, float tankgroesse, float tankinhalt) throws MainException {
        super(fahreugnummer, leergewicht, zulaessigesGewicht, anzahlPlaetze, insassen, hoechstgeschwindigkeit, leistungPS, kilometerstand, tankgroesse, tankinhalt);

        this.maximaleLademenge = maximaleLademenge;
        setLademenge(lademenge);
        berechneGewicht();
        setAnzahlPlaetze(anzahlPlaetze);
    }

    public int getLademenge() {
        return lademenge;
    }

    public int getMaximaleLademenge() {
        return maximaleLademenge;
    }

    public void setLademenge(int lademenge) throws MainException {
        if(lademenge > maximaleLademenge){
            throw new MainException("Die Ladung ist zu schwer für den LKW -> setLademenge LastKraftWagen");
        }

        this.lademenge = lademenge;
    }

    public void setMaximaleLademenge(int maximaleLademenge) {
        this.maximaleLademenge = maximaleLademenge;
    }

    @Override
    public int berechneGewicht() {
        return leergewicht + insassen * 60 + lademenge;
    }

    @Override
    public void setAnzahlPlaetze(int anzahlPlaetze) throws MainException {
        if(anzahlPlaetze > 5){
            throw new MainException("Zu viele Plätze in der Kabine -> setAnzahlPlaetze LastKraftWagen");
            //Korrektur: nach dem i fgehört ein super setanzahl plätze!!!! es kamen keine fehler da kein set methoden im konstuktor waren!!!!
        }
    }
}
