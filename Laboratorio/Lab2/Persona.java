public class Persona{
	private String nome;
	private String cognome;
	private int eta;

	
	// Costruttore con parametri
	public Persona(String nome, String cognome, int eta){
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}


	// Costruttore senza parametri
	public Persona(){
		this.nome = "default name";
		this.cognome = "default surname";
		this.eta = 0;
	}

	
	// Costruttore copia
	public Persona(Persona altraPersona){
		this();
		if (altraPersona != null){
			this.nome = altraPersona.getNome();
			this.cognome = altraPersona.getCognome();
			this.eta = altraPersona.getEta();
		}
	}


	// Altro Costruttore
	public Persona(String nome){
		this();
		this.nome = nome;
	}


	// Metodi getter
	public String getNome(){
		return this.nome;
	}

	public String getCognome(){
		return this.cognome;
	}

	public int getEta(){
		return this.eta;
	}


	// Metodi setter
	public void setNome(String nuovoNome){
		this.nome = nuovoNome;
	}

	public void setCognome(String nuovoCognome){
		this.cognome = nuovoCognome;
	}

	public void setEta(int nuovaEta){
		this.eta = nuovaEta;
	}



	public double calcolaCostoBiglietto(double costoBiglietto){
		double prezzoScontato = 0;

		if(costoBiglietto > 0){
			if(this.eta >= 50){
				prezzoScontato = costoBiglietto - ((costoBiglietto / 100) * 10);
			}else if(this.eta >= 70){
				prezzoScontato = costoBiglietto - ((costoBiglietto / 100) * 20);
			}else{
				prezzoScontato = costoBiglietto;
			}
		}
		return prezzoScontato;
	}



	@Override
	public String toString(){
		String s = "";
		s = s + "Nome: " + this.getNome()
			+ "Cognome: " + this.getCognome()
			+ "Età: " + this.getEta();
		return s;
	}

}