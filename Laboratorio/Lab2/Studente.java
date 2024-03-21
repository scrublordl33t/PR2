public class Studente extends Persona{
	private int matricola;
	private int annoIscrizione;

	// Costruttore senza parametri
	public Studente(){
		super(); //potrei ometterlo
		this.matricola = -1;
	}

	// Costruttore con parametri
	public Studente(String nome, String cognome, int eta, int matricola, int annoIscrizione){
		super(nome, cognome, eta);
		this.matricola = matricola;
		this.annoIscrizione = annoIscrizione;
	}

	// Costruttore copia
	public Studente(Studente altroStudente){
		super();
		if(altroStudente != null){
			super.setNome(altroStudente.getNome());
			super.setCognome(altroStudente.getCognome());
			super.setEta(altroStudente.getEta());
			this.matricola = altroStudente.getMatricola();
			this.annoIscrizione = altroStudente.getAnnoIscrizione();
		}
	}



	//metodi getter
	public int getMatricola(){
		return this.matricola;
	}

	public int getAnnoIscrizione(){
		return this.annoIscrizione;
	}


	//metodi setter
	public void setMatricola(int nuovaMatricola){
		this.matricola = nuovaMatricola;
	}

	public void setAnnoIscrizione(int nuovoAnnoIscrizione){
		this.annoIscrizione = nuovoAnnoIscrizione;
	}


	@Override
	public double calcolaCostoBiglietto(double costoBiglietto){
		double prezzoScontato = 0;

		if(costoBiglietto > 0){
			if(super.getEta() < 30){
				prezzoScontato = 0;
			}else if(2024 - this.annoIscrizione <= 3){
				prezzoScontato = costoBiglietto - ((costoBiglietto / 100) * 50);
			}else{
				prezzoScontato = super.calcolaCostoBiglietto(costoBiglietto);
			}
		}
		return prezzoScontato;
	}


	

	@Override
	public String toString(){
		String s = "";
		s = s + super.toString()
			+ "Matricola: " + this.getMatricola()
			+ "annoIscrizione: " + this.getAnnoIscrizione();
		return s;
	}

}