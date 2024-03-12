class Rettangolo{
	private	int base;
	private int altezza;
	
	public Rettangolo(int base, int altezza){
	
		this.base = base;
		this.altezza = altezza;
		
	}
	
	public void setBase(int base){
		if(base>0)
			this.base = base;
		else
			System.out.println("Errore");
		}
		
	public void setAltezza(int altezza){
		if(altezza>0)
			this.altezza = altezza;
		else
			System.out.println("Errore");
		}
	
	int area(){
		return this.base * this.altezza;
	}
}
		
