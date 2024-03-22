public class Autonoleggio{

    // Attributi
    private Auto[] garage;
    private int dimensioneGarage;
    private int nAutoDentroIlGarage;


    public Autonoleggio(int dimensioneGarage){ 
        this.garage = new Auto[dimensioneGarage];
        this.dimensioneGarage = dimensioneGarage;
        this.nAutoDentroIlGarage = 0;
    }


    // Costruttore
    public boolean aggiungiAuto(Auto a){
        if(nAutoDentroIlGarage < dimensioneGarage){
            garage[nAutoDentroIlGarage] = a;
            nAutoDentroIlGarage++;
            return true;
        }
        return false;
    }


    // Metodi
    public String visualizzaGarage(){
        String s = "";
        for (int i = 0; i < nAutoDentroIlGarage; i++){
            if(garage[i].isDisponibile()){
                s = s + "-- " + (i + 1) + " --\n" + "Marca: " + garage[i].getMarca() 
                    + ".\nModello: " + garage[i].getModello() 
                    + ".\nCosto giornaliero: " + garage[i].getCostoAlGiorno()
                    + "\n\n";
            }
        }

        return s;
    }


    public void noleggia(int indiceAuto){
        if((indiceAuto >= 0) && (indiceAuto < nAutoDentroIlGarage))
            garage[indiceAuto].setDisponibile(false);
    }


    public void restiuisci(int indiceAuto, int kmFatti){
        if((indiceAuto >= 0) && (indiceAuto < nAutoDentroIlGarage)){
            garage[indiceAuto].setDisponibile(true);
            garage[indiceAuto].viaggio(kmFatti);
        }
    }


    public Auto menoKm(){
        int minKm;
        Auto autoMenoKm = null;

        // se c'è almeno un auto
        if (nAutoDentroIlGarage > 0){

            // prendo in considerazione la prima
            minKm = garage[0].getKm();
            autoMenoKm = garage[0];

            // controllo le altre auto
            for(int i = 1; i < nAutoDentroIlGarage; i++){
                if(garage[i].isDisponibile()){
                    if(garage[i].getKm() < minKm){
                        minKm = garage[i].getKm();
                        autoMenoKm = garage[i];
                    }
                }
            }
        }
        
        return autoMenoKm;
    }


    public Auto piuKm(){
        int maxKm;
        Auto autoPiuKm = null;

        //se c'è almeno un auto
        if (nAutoDentroIlGarage > 0){

            // prendo in considerazione la prima
            maxKm = garage[0].getKm();
            autoPiuKm = garage[0];

            // controllo le altre auto
            for(int i = 1; i < nAutoDentroIlGarage; i++){
                if(garage[i].isDisponibile()){
                    if(garage[i].getKm() > maxKm){
                        maxKm = garage[i].getKm();
                        autoPiuKm = garage[i];
                    }
                }
            }
        }
        
        return autoPiuKm;
    }


    public double mediaKm(){
        double somma = 0;
        double media = 0;
        int numero = 0;

        for(int i = 0;i < nAutoDentroIlGarage; i++){
            if(garage[i].isDisponibile()){
                somma = somma + garage[i].getKm();
                numero++;
            }
        }

        media = somma / numero;

        return media;
    }

}