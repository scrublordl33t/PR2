class Numero{
	
	int n;
	
	public Numero(int n){
		this.n = n;
	}
	
	int somma(Numero num){
		return this.n + num.n;	
	}
	
	void aggiungi(Numero num){
		this.n += num.n;
	}
	
	public static void main(String[] args){
		Numero n1 = new Numero(5);
		Numero n2 = new Numero(4);
		
		int s = n1.somma(n2);
		System.out.println(s);
		
	}
}
