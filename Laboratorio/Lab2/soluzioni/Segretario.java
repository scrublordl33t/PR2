public class Segretario extends Tessera{

	//attributi
	private int numeroGiorniDiLavoro;


	//costruttore con parametri
	public Segretario(String nome, String cognome, int codiceTessera, int numeroGiorniDiLavoro){
		super(nome, cognome, codiceTessera);
		if(numeroGiorniDiLavoro >= 0 && numeroGiorniDiLavoro <= 5){			
			this.numeroGiorniDiLavoro = numeroGiorniDiLavoro;
		}
	}

	//costruttore senza parametri
	public Segretario(){
		super();
		this.numeroGiorniDiLavoro = 0;
	}

	//costruttore copia
	public Segretario(Segretario altroSegretario){
		super(altroSegretario);
		this.numeroGiorniDiLavoro = altroSegretario.getNumeroGiorniDiLavoro();
	}


	//metodi getter
	public int getNumeroGiorniDiLavoro(){
		return this.numeroGiorniDiLavoro;
	}


	//metodi setter
	public void setNumeroGiorniDiLavoro(int nuovoNumeroGiorniDiLavoro){
		if(nuovoNumeroGiorniDiLavoro >= 0 && nuovoNumeroGiorniDiLavoro <= 5){			
			this.numeroGiorniDiLavoro = nuovoNumeroGiorniDiLavoro;
		}
	}


	//metodo toString
	@Override
	public String toString(){
		String s = super.toString();
		s = s + "\nNumero giorni di lavoro: " + this.numeroGiorniDiLavoro;
		return s;
	}
}