public class Autonoleggio{

    // Attributi
    private Auto[] garage;
    private int dimensioneGarage;
    private int ultimaAutoDentroIlGarage;


    // Costruttore
    public Autonoleggio(int dimensioneGarage){
        this.garage = new Auto[dimensioneGarage];
        this.dimensioneGarage = dimensioneGarage;
        this.ultimaAutoDentroIlGarage = 0;
    }


    // Metodi
    public boolean aggiungiAuto(Auto a){
        if(ultimaAutoDentroIlGarage < dimensioneGarage ){
            garage[ultimaAutoDentroIlGarage] = a;
            ultimaAutoDentroIlGarage++;
            return true;
        }
        return false;
    }


    public String visualizzaGarage(){
        String s = "";
        for (int i = 0; i < ultimaAutoDentroIlGarage; i++){
            if(garage[i].isDisponibile()){
                s = s + "-- " + (i + 1) + " --\n" + "Marca: " + garage[i].getMarca() 
                    + ".\nModello: " + garage[i].getModello() 
                    + ".\nCosto giornaliero: " + garage[i].getCostoAlGiorno()
                    + "\n\n";
            }
        }

        return s;
    }
    
}