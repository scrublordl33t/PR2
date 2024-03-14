class Auto{
	private String modello;
	private String marca;
	private double costoAlGiorno;
	private boolean disponibilita;
	
	public Auto(String modello, String marca, double costoAlGiorno, boolean disponibilita){
		this.modello = modello;
		this.marca = marca;
		this.costoAlGiorno = costoAlGiorno;
		this.disponibilita = disponibilita;
	}
	
	public String getModello(){
		return this.modello;
	}
	public void setModello(String newModello){
		this.modello = newModello;
	}
	
	public String getMarca(){
		return this.marca;
	}	
	public void setMarca(String newMarca){
		this.marca = newMarca;
	}
	
	public double getCostoAlGiorno(){
		return this.costoAlGiorno;
	}
	public void setCostoAlGiorno(double newCostoAlGiorno){
		this.costoAlGiorno = newCostoAlGiorno;
	}
	
	public boolean getDisponibilita(){
		return this.disponibilita;
	}
	public void setDisponibilita(boolean newDisponibilita){
		this.disponibilita = newDisponibilita;
	}
	
}
