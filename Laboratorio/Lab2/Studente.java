package Lab2;

public class Studente extends Persona {
    private int matricola;
    private int annoIscrizione;

    public Studente(){
        super();
        this.matricola = -1;
        this.annoIscrizione = 0;
    }

    public Studente(String nome, String cognome, int eta, int matricola, int annoIscrizione){
        super(nome, cognome, eta);
        this.matricola = matricola;
        this.annoIscrizione = annoIscrizione;
    }

    public Studente(Studente copiaStudente){
        super();
        if(copiaStudente != null){
            super.setNome(copiaStudente.getNome());
            super.setCognome(copiaStudente.getCognome());
            super.setEta(copiaStudente.getEta());
            this.matricola = copiaStudente.getMatricola();
        }
    }


    public void setMatricola(int newMatricola){
        this.matricola = newMatricola;
    }
    public int getMatricola(){
        return this.matricola;
    }
    
    public void setAnnoIscrizione(int newAnnoIscrizione){
        this.annoIscrizione = newAnnoIscrizione;
    }
    public int getAnnoIscrizione(){
        return this.annoIscrizione;
    }

    @Override
    public double calcolaCostoBiglietto(double prezzoBiglietto){
        if(super.getEta() < 30){
            return prezzoBiglietto = 0.0;
        }
    }
}
