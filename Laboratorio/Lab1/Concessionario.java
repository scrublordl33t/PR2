class Concessionario{
	public static void main(String[] args){
		Auto auto = new Auto("MX5","Mazda",32.59,true);
		
		System.out.println(auto.getModello());
		System.out.println(auto.getMarca());
		System.out.println(auto.getCostoAlGiorno());
		System.out.println(auto.getDisponibilita());		
	}
}	
		
