package data;

public class PersonenKraftWagen extends Kraftfahrzeug{

    Art art;

    public PersonenKraftWagen(int fahreugnummer, int leergewicht, int zulaessigesGewicht, int anzahlPlaetze, int insassen, int hoechstgeschwindigkeit, int leistungPS, int kilometerstand, Art art, float tankgroesse, float tankinhalt) throws MainException {
        super(fahreugnummer, leergewicht, zulaessigesGewicht, anzahlPlaetze, insassen, hoechstgeschwindigkeit, leistungPS, kilometerstand, tankgroesse, tankinhalt);
        this.art = art;
        setInsassen(insassen);
    }

    public Art getArt() {
        return art;
    }

    public void setArt(Art art) {
        this.art = art;
    }

    @Override
    public void setInsassen(int insassen) throws MainException {
        if(insassen > 9){
            insassen = 5;
            throw new MainException("Achtung wir können nicht sicherstellen das du den D oder D1 Führerschein besitzt darum haben wir die Insassen auf 5 reduziert! -> Personenkraftwagwen @overrride setinsassen");
        }
        super.setInsassen(insassen);
    }


}
