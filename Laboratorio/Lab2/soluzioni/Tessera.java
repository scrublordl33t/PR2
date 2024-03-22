public class Tessera{

	//attributi
	private String nome;
	private String cognome;
	private int numeroIngressi;
	private int codiceTessera;
	public boolean accessoConsentito;


	//costruttore con parametri
	public Tessera(String nome, String cognome, int codiceTessera){
		this();
		this.nome = nome;
		this.cognome = cognome;
		this.codiceTessera = codiceTessera;
	}

	//costruttore senza parametri
	public Tessera(){
		this.nome = "default_name";
		this.cognome = "default_surname";
		this.numeroIngressi = 0;
		this.codiceTessera = -1;
		this.accessoConsentito = true;
	}

	//costruttore copia
	public Tessera(Tessera altraTessera){
		this.nome = altraTessera.getNome();
		this.cognome = altraTessera.getCognome();
		this.numeroIngressi = altraTessera.getNumeroIngressi();
		this.codiceTessera = altraTessera.getCodiceTessera();
		this.accessoConsentito = altraTessera.getAccesso();
	}


	//metodi getter
	public String getNome(){
		return this.nome;
	}

	public String getCognome(){
		return this.cognome;
	}

	public int getNumeroIngressi(){
		return this.numeroIngressi;
	}

	public int getCodiceTessera(){
		return this.codiceTessera;
	}

	public boolean getAccesso(){
		return this.accessoConsentito;
	}


	//metodi setter
	public void setNome(String nuovoNome){
		this.nome = nuovoNome;
	}

	public void setCognome(String nuovoCognome){
		this.cognome = nuovoCognome;
	}

	public boolean setNumeroIngressi(int nuovoNumeroIngressi){
		//impedisco che venga impostato un numero inferiore di ingressi
		if(nuovoNumeroIngressi > this.numeroIngressi){
			this.numeroIngressi = nuovoNumeroIngressi;
			return true;
		}
		return false;
	}



	//altri metodi
	public boolean timbra(){
		//se siamo abilitati all'accesso...
		if(this.accessoConsentito == true){
			//incremento il numero di ingressi
			this.numeroIngressi = this.numeroIngressi + 1;
			//se siamo arrivati alla decima timbratura blocco la tessera
			if(this.numeroIngressi % 10 == 0){
				this.accessoConsentito = false;
			}
			return true;
		}

		//altrimenti nega l'accesso
		return false;
	}

	public void rinnova(){
		this.accessoConsentito = true;
		this.numeroIngressi = 0;
	}


	//metodo toString
	@Override
	public String toString(){
		String s = "";
		s = s + "Nome: " + this.nome
			+ "\nCognome: " + this.cognome
			+ "\nNumero ingressi: " + this.numeroIngressi
			+ "\nCodice Tessera: " + this.codiceTessera;
		return s;
	}




}
