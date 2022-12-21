package data;

public class Kraftfahrzeug extends Fahrzeug implements Tank{
    int hoechstgeschwindigkeit;
    int leistungPS; //wert des PSs was das Auto liefern kann
    int kilometerstand;

    float tankgroesse;

    float tankinhalt;

    public Kraftfahrzeug(int fahreugnummer, int leergewicht, int zulaessigesGewicht, int anzahlPlaetze, int insassen, int hoechstgeschwindigkeit, int leistungPS, int kilometerstand, float tankgroesse, float tankinhalt ) {
        super(fahreugnummer, leergewicht, zulaessigesGewicht, anzahlPlaetze, insassen);
        this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
        this.leistungPS = leistungPS;
        this.kilometerstand = kilometerstand;
        setTankgroesse(tankgroesse);
        setTankinhalt(tankinhalt);
        berechneGewicht();

    }
    public void setTankgroesse(float tankgroesse) throws MainException{
        if(tankgroesse < 0){
            throw new MainException("Wieso sollte die Tankgröße negativ sein? sowas geht nicht -> setTankgroesse() Kraftfahrzeug");
        }

        this.tankgroesse = tankgroesse;
    }

    public void setTankinhalt(float tankinhalt) throws MainException{
        if(tankinhalt > tankgroesse || tankinhalt < 0){
            throw new MainException("Du kannst nicht mehr tanken als reinpasst in das Fahrzeug! Oder du tankst im negativen bereich -> setTankinhalt Kraftfahrzeug");
        }

        this.tankinhalt = tankinhalt;
    }

    public int getHoechstgeschwindigkeit() {
        return hoechstgeschwindigkeit;
    }

    public int getLeistungPS() {
        return leistungPS;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public void setHoechstgeschwindigkeit(int hoechstgeschwindigkeit) {
        this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
    }

    public void setLeistungPS(int leistungPS) {
        this.leistungPS = leistungPS;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }


    public int berechneGewicht(){
        return leergewicht + insassen * 80;
    }


    @Override
    public float getTankgroesse() {
        return tankgroesse;
    }

    @Override
    public float getTankinhalt() {
        return tankinhalt;
    }

    @Override
    public float tanken(Kraftfahrzeug x) {
        float menge = x.tankgroesse - x.tankinhalt;
       x.tankinhalt = x.tankgroesse;
        return menge;
        // Voher wurde der wert bereits korriert wesshalb am ende nur 0 rauskommen ab da der wert als das gleiche wie der andere gesetzt wurde.

    }

    // korrektur: to String für jdees eigene
}
