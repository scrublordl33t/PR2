public class Test{
	public static void main(String[] args){
        Auto a1 = new Auto("Ford", "Focus", 40, 250);
        Auto a2 = new Auto("Fiat", "Punto", 32, 180);

        boolean aggiunta = true;

        Autonoleggio noleggio = new Autonoleggio(3);

        aggiunta = noleggio.aggiungiAuto(a1);
        if(aggiunta == true){
        	System.out.println("Auto aggiunta con successo!\n");
        }else{
			System.out.println("Non è possibile aggiungere l'auto!\n");
        }
        System.out.println("Garage:");
        System.out.println(noleggio.visualizzaGarage() + "\n");
        

        aggiunta = noleggio.aggiungiAuto(a2);
        if(aggiunta == true){
        	System.out.println("Auto aggiunta con successo!\n");
        }else{
			System.out.println("Non è possibile aggiungere l'auto!\n");
        }
		System.out.println("Garage:");
        System.out.println(noleggio.visualizzaGarage() + "\n");


        Auto a3 = new Auto("Volkswagen", "Golf", 38, 80);
        aggiunta = noleggio.aggiungiAuto(a3);
        if(aggiunta == true){
        	System.out.println("Auto aggiunta con successo!\n");
        }else{
			System.out.println("Non è possibile aggiungere l'auto!\n");
        }
		System.out.println("Garage:");
        System.out.println(noleggio.visualizzaGarage() + "\n");


        Auto a4 = new Auto("Opel", "Corsa", 20, 110);
        aggiunta = noleggio.aggiungiAuto(a4);
        if(aggiunta == true){
        	System.out.println("Auto aggiunta con successo!\n");
        }else{
			System.out.println("Non è possibile aggiungere l'auto!\n");
        }
		System.out.println("Garage:");
        System.out.println(noleggio.visualizzaGarage() + "\n");

    }
}