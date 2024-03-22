public class Auto{

    // Attributi
    private String marca;
    private String modello;
    private float costoAlGiorno;
    private int km;
    private boolean disponibile;


    // Costruttore
    public Auto(String marca, String modello, float costoAlGiorno,int km){
        this.marca = marca;
        this.modello = modello;
        this.costoAlGiorno = costoAlGiorno;
        this.km = km;
        this.disponibile = true;
    }


    // Metodi
    public void setMarca(String marca){
        this.marca = marca;
    }


    public void setModello(String modello){
        this.modello = modello;
    }


    public void setCostoAlGiorno(float costoAlGiorno){
        this.costoAlGiorno = costoAlGiorno;
    }


    public void setDisponibile(boolean disponibile){
        this.disponibile = disponibile;
    }


    public void setKm(int km){
        this.km = km;
    }


    public int getKm(){
        return this.km;
    }


    public void viaggio(int km){
        this.km += km;
    }


    public String getMarca(){
        return this.marca;
    }


    public String getModello(){
        return this.modello;
    }


    public float getCostoAlGiorno(){
        return this.costoAlGiorno;
    }


    public boolean isDisponibile(){
        return this.disponibile;
    }



    public String visualizzaAuto(){
        return "Marca: " + this.marca 
                + ".\nModello: " + this.modello
                + ".\nCosto giornaliero: " + this.costoAlGiorno 
                + ".\nKm: " + this.km + "\n";
    }
}