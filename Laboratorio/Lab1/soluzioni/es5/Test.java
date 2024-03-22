public class Test{

	public static void main(String[] args){
        Auto a1 = new Auto("Ford", "Focus", 25, 100);
        Auto a2 = new Auto("Fiat", "Punto", 18, 120);
        Auto a3 = new Auto("Volkswagen", "Golf", 30, 750);
        Autonoleggio noleggio = new Autonoleggio(3);
        boolean aggiunta;


        a1.viaggio(303);
        a2.viaggio(238);
        a3.viaggio(98);


        aggiunta = noleggio.aggiungiAuto(a1);
        if(aggiunta == true){
            System.out.println("Auto aggiunta con successo!\n");
        }else{
            System.out.println("Non è possibile aggiungere l'auto!\n");
        }

        aggiunta = noleggio.aggiungiAuto(a2);
        if(aggiunta == true){
            System.out.println("Auto aggiunta con successo!\n");
        }else{
            System.out.println("Non è possibile aggiungere l'auto!\n");
        }
        
        aggiunta = noleggio.aggiungiAuto(a3);
        if(aggiunta == true){
            System.out.println("Auto aggiunta con successo!\n");
        }else{
            System.out.println("Non è possibile aggiungere l'auto!\n");
        }

        Auto autoMin = noleggio.menoKm();
        Auto autoMax = noleggio.piuKm();

        System.out.println("L'auto con meno km è:\n" + autoMin.visualizzaAuto());
        System.out.println("L'auto con più km è:\n" + autoMax.visualizzaAuto());
        System.out.println("La media dei km percorsi dalle auto è: ");
        System.out.printf("%.2f\n", noleggio.mediaKm());
        
    }

}