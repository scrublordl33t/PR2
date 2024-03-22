public class Manutentore extends Tessera{

	//attributi
	private String specializzazione;
	private String dataAssunzione;
	private Boolean soggettoARischio;


	//costruttore con parametri
	public Manutentore(String nome, String cognome, int codiceTessera, String specializzazione,
					String dataAssunzione, Boolean soggettoARischio){
		super(nome, cognome, codiceTessera);
		this.specializzazione = specializzazione;
		this.dataAssunzione = dataAssunzione;
		this.soggettoARischio = soggettoARischio;
	}

	//costruttore senza parametri
	public Manutentore(){
		super();
		this.specializzazione = "default_specialization";
		this.dataAssunzione = "01/01/1900";
		this.soggettoARischio = false;
	}

	//costruttore copia
	public Manutentore(Manutentore altroManutentore){
		super(altroManutentore);
		this.specializzazione = altroManutentore.getSpecializzazione();
		this.dataAssunzione = altroManutentore.getDataAssunzione();
		this.soggettoARischio = altroManutentore.isSoggettoARischio();
	}


	//metodi getter
	public String getSpecializzazione(){
		return this.specializzazione;
	}

	public String getDataAssunzione(){
		return this.dataAssunzione;
	}

	public boolean isSoggettoARischio(){
		return this.soggettoARischio;
	}


	//metodi setter
	public void setSpecializzazione(String nuovaSpecializzazione){
		this.specializzazione = nuovaSpecializzazione;
	}

	public void setDataAssunzione(String nuovaDataAssunzione){
		this.dataAssunzione = nuovaDataAssunzione;
	}

	public void setSoggettoARischio(boolean nuovoValore){
		this.soggettoARischio = nuovoValore;
	}


	//altri metodi
	@Override
	public boolean timbra(){
		boolean response;

		response = super.timbra();
		//se la timbratura è stata negata
		if(response == false){
			//rinnovo la tessera in automatico
			super.rinnova();
			//e timbro di nuovo
			super.timbra();
		}
		return true;
	}


	//metodo toString
	@Override
	public String toString(){
		String s = super.toString();
		s = s + "\nSpecializzazione: " + this.specializzazione
			+ "\nData assunzione: " + this.dataAssunzione
			+ "\nSoggetto a rischio: " + this.soggettoARischio;
		return s;
	}
}