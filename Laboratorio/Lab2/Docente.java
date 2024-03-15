public class Docente extends Persona{

    private String insegnamento;

    public Docente(Docente copiaDocente){
        super();
        if(copiaDocente != null){
            super.setNome(copiaDocente.getCognome());
            super.setCognome(copiaDocente.getCognome());
            super.setEta(copiaDocente.getEta());
            this.insegnamento = copiaDocente.getInsegnamento();
        }
    }
    
}
