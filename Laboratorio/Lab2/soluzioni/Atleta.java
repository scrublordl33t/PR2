public class Atleta extends Tessera{

	//attributi
	private String sport;
	private String dataIscrizione;


	//costruttore con parametri
	public Atleta(String nome, String cognome, int codiceTessera, String sport, String dataIscrizione){
		super(nome, cognome, codiceTessera);
		this.sport = sport;
		this.dataIscrizione = dataIscrizione;
	}

	//costruttore senza parametri
	public Atleta(){
		super();
		this.sport = "default_sport";
		this.dataIscrizione = "01/01/1900";
	}

	//costruttore copia
	public Atleta(Atleta altroAtleta){
		super(altroAtleta);
		this.sport = altroAtleta.getSport();
		this.dataIscrizione = altroAtleta.getDataIscrizione();
	}


	//metodi getter
	public String getSport(){
		return this.sport;
	}

	public String getDataIscrizione(){
		return this.dataIscrizione;
	}


	//metodi setter
	public void setSport(String nuovoSport){
		this.sport = nuovoSport;
	}

	public void setDataIscrizione(String nuovaDataIscrizione){
		this.dataIscrizione = nuovaDataIscrizione;
	}


	//altri metodi
	@Override
	public boolean timbra(){
		//se siamo abilitati all'accesso...
		if(super.getAccesso() == true){
			//incremento il numero di ingressi
			super.setNumeroIngressi(super.getNumeroIngressi() + 1);
			//se siamo arrivati alla decima timbratura blocco la tessera
			if(super.getNumeroIngressi() % 20 == 0){
				super.accessoConsentito = false;
			}
			return true;
		}

		//altrimenti nega l'accesso
		return false;
	}


	//metodo toString
	@Override
	public String toString(){
		String s = super.toString();
		s = s + "\nSport: " + this.sport
			+ "\nData iscrizione: " + this.dataIscrizione;
		return s;
	}
}