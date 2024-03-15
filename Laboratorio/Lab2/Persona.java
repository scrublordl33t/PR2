public class Persona{
    private String nome;
    private String cognome;
    private int eta;

    public Persona(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public Persona(){
        this.nome = "nome default";
        this.cognome = "cognome default";
        this.eta = 0;
    }

    public Persona(Persona copiaPersona){
        this();
        if(copiaPersona != null){
            this.nome = copiaPersona.getNome();
            this.cognome = copiaPersona.getCognome();
            this.eta = copiaPersona.getEta();
        }
    }

    public double calcolaCostoBiglietto(double prezzoBiglietto){
        if(this.eta >= 50){
            return prezzoBiglietto *= 0.90;
        }
        else if(this.eta >= 70){
            return prezzoBiglietto *= 0.80;
        }
        else{
            return prezzoBiglietto;
        }
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String newNome){
        this.nome = newNome;
    }

    public String getCognome(){
        return this.cognome;
    }
    public void setCognome(String newCognome){
        this.cognome = newCognome;
    }

    public int getEta(){
        return this.eta;
    }
    public void setEta(int newEta){
        this.eta = newEta;
    }

}