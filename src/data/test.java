package data;

public class test {
    public static void main(String[] args) throws MainException {
        //==================================================================================
        // ! VERALTETE TESTKLASSE ! BITTE TESTB ALS TESTKLASSE VERWENDEN !
        //==================================================================================


        Fahrrad f = new Fahrrad(245, 120, 170, 1, 1, 2);
        f.printInfo();

        // Kraftfahrzeug kf = new Kraftfahrzeug(69, 12000, 40000, 2, 1, 80, 400, 120000);
        // kf.printInfo();

        /*LastKraftWagen lkw = new LastKraftWagen(15, 20000, 40000, 2, 1, 80, 400, 15975);
        lkw.printInfo();

         */

        //Motorad m = new Motorad(99, 125, 200, 2, 1, 100, 40, 1247, true);
        //m.printInfo();

       // PersonenKraftWagen pkw = new PersonenKraftWagen(48, 1200, 3500,5, 2,190, 60, 105001, Art.SUV);
        //pkw.printInfo();

        //Fehler fahrrad

        Fahrrad x = new Fahrrad(00, 100, 150, 6,88, 2);
        x.printInfo();

        //Fehler Lastkraftwagen

        //LastKraftWagen x1 = new LastKraftWagen(000, 5000, 40000, 2, 1, 80, 400, 8, 5000, 1000);
        //x1.printInfo();

       // LastKraftWagen x11 = new LastKraftWagen(0000,500,1782,9999, 1, 80,45,1254, 10, 78);
       // x11.printInfo();

        //Fehler Motorad
        //Motorad x2 = new Motorad(00000, 500, 1200, 99, 1,55,33,12, true);

        //Fehler PersonenKraftWagen
        //PersonenKraftWagen x3 = new PersonenKraftWagen(000,145,458,77,33,100,450,14895,Art.Kombi);
        //x3.printInfo();

    }
}
