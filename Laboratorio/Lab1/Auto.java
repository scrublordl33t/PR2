public class Auto{

    private String marca;
    private String modello;
    private float prezzoAlGiorno;
    private boolean disponibilita;

    public Auto(String marca, String modello, float prezzoAlGiorno){

        this.marca = marca;
        this.modello = modello;
        this.prezzoAlGiorno = prezzoAlGiorno;
        this.disponibilita = true;
    }

    public Auto(String marca, String modello, float prezzoAlGiorno,boolean disponibilita){

        this.marca = marca;
        this.modello = modello;
        this.prezzoAlGiorno = prezzoAlGiorno;
        this.disponibilita = disponibilita;
    }

    public void setMarca(String marca){

        this.marca = marca;
    }

    public void setModello(String modello){

        this.modello = modello;
    }

    public void setPrezzoAlGiorno(float prezzoAlGiorno){
        
        this.prezzoAlGiorno = prezzoAlGiorno;
    }

    public void setDisponibilta(boolean disponibilita){

        this.disponibilita = disponibilita;
    }

    public String getMarca(){
        
        return this.marca;
    }

    public String getModello(){

        return this.modello;
    }

    public float getPrezzoAlGiorno(){

        return this.prezzoAlGiorno;
    }

    public boolean getDisponibilita(){

        return this.disponibilita;
    }

    public String visualizzaDati(){

        String s = "";
        s += "Marca: "+this.marca+".\nModello: "+this.modello+".\nPrezzo: "+this.prezzoAlGiorno+".\n";
        return s;
    }

    public static void main(String[] args){

        Auto a = new Auto("Subaru","Baracca",3);
        System.out.println(a.visualizzaDati());
    }
}