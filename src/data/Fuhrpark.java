package data;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Fuhrpark {
    private ArrayList<Fahrzeug> fahrzeuge;

    public Fuhrpark() {
        fahrzeuge = new ArrayList<>();
    }

    public void hinzufuegen(Fahrzeug x) throws MainException{
           if( x == null|| fahrzeuge.contains(x)){
               throw new MainException("Fehler beim erstellen");
           } else{
               if(x.getFahreugnummer() == 0){ //Fahrzeugnummer setzen
                   int groeste = 0;
                   for (Fahrzeug fahrzeug : fahrzeuge) {
                       if (fahrzeug.getFahreugnummer() > groeste) {
                           groeste = fahrzeug.getFahreugnummer();
                       }
                   }
                   x.setFahreugnummer(groeste +1);
               }
               fahrzeuge.add(x);
           }
    }

    public boolean check(Fahrzeug x) {  //Diese Methode macht .contains
        for (Fahrzeug xx : fahrzeuge) {
            if (xx.equals(x)) {
                return true;
            }
        }
        return false;
    }

    public boolean entfernen(int num){
       for(int i = 0; i < fahrzeuge.size(); i++){
           if(fahrzeuge.get(i).getFahreugnummer() == num) {
               fahrzeuge.remove(i);
               return true;
           }
       }
        return false;
    }

    public void ausgabeFahrzeuge(boolean nurKraftfahrzeuge){
        if (nurKraftfahrzeuge){
            for (Fahrzeug fahrzeug : fahrzeuge) {
                if(fahrzeug instanceof Kraftfahrzeug){
                    fahrzeug.printInfo();
                }

            }
        } else {
            for (Fahrzeug fahrzeug : fahrzeuge) {
                fahrzeug.printInfo();
            }
        }
    }

    public Fahrzeug sucheFreiesFahrzeug(int hatPlatzFuer){
        for (Fahrzeug fahrzeug : fahrzeuge) {
            if (fahrzeug.getInsassen() == 0 && fahrzeug.getAnzahlPlaetze() > hatPlatzFuer) {
                return fahrzeug;
            }
        }
        return null;
    }

    public void fahrzeugeSortiertNachFahrzeugnummer(){
        Collections.sort(fahrzeuge);
    }

    public void fahrzeugeSortiertNachMaxSitzplaetze(){
        fahrzeuge.sort(new Vergleiche());
    }

    public float tanke(){
        float gesammt = 0;
        for (Fahrzeug fahrzeug : fahrzeuge) {
            if (fahrzeug instanceof Kraftfahrzeug) {
                float x = ((Kraftfahrzeug) fahrzeug).getTankgroesse() - ((Kraftfahrzeug) fahrzeug).getTankinhalt();
                gesammt = gesammt + x;
                ((Kraftfahrzeug) fahrzeug).tankinhalt = ((Kraftfahrzeug) fahrzeug).tankgroesse;
            }
        }
        return gesammt;
    }


    //Erweiterung durch speichern mit Srialisierung
    public void speichernMitSerialisierung(String filename) throws IOException {
        try(ObjectOutputStream ops = new ObjectOutputStream(new FileOutputStream(filename))) {
            ops.writeObject(fahrzeuge);
        }
    }

    public void ladenMitSerialisierung(String filename2) throws IOException {
        try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream(filename2))) {
            try {
                //lädt alle daten direkt in die ArrayList
                fahrzeuge = (ArrayList<Fahrzeug>) oos.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    //Ist eine Hilfsmethode damit ich die Anzahl der elemte in der lsite anzeigen lassen kann
   public int size(){
        return fahrzeuge.size();
   }

}
