public class Docente extends Persona{
	private String insegnamento;


	// Costruttore senza parametri
	public Docente(){
		super(); //potrei ometterlo
		this.insegnamento = "default value";
	}

	// Costruttore con parametri
	public Docente(String nome, String cognome, int eta, String insegnamento){
		super(nome, cognome, eta);
		this.insegnamento = insegnamento;
	}

	// Costruttore copia
	public Docente(Docente altroDocente){
		super();
		if(altroDocente != null){
			super.setNome(altroDocente.getNome());
			super.setCognome(altroDocente.getCognome());
			super.setEta(altroDocente.getEta());
			this.insegnamento = altroDocente.getInsegnamento();
		}
	}



	//metodi getter
	public String getInsegnamento(){
		return this.insegnamento;
	}

	//metodi setter
	public void setInsegnamento(String nuovoInsegnamento){
		this.insegnamento = nuovoInsegnamento;
	}


	@Override
	public double calcolaCostoBiglietto(double costoBiglietto){
		double prezzoScontato = 0;

		if(costoBiglietto > 0){
			prezzoScontato = costoBiglietto - ((costoBiglietto / 100) * 90);
		}
		return prezzoScontato;
	}



	@Override
	public String toString(){
		String s = "";
		s = s + super.toString()
			+ "Insegnamento: " + this.getInsegnamento();
		return s;
	}

}