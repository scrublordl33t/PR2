public class TestPersona{
	public static void main(String[] args){

		/*
			'scommentare' il test che si desidera eseguire
		*/

		test1A();
		//test1B();
		//test1C();
		//test1D();
		//test1E();

	}


	private static void test1A(){
		// Creo due persone e ne stampo i loro attributi

		Persona persona1 = new Persona("Simone", "Picciau", 18);
		System.out.println("--- Persona 1 ---");
		System.out.println("Nome: " + persona1.getNome());
		System.out.println("Cognome: " + persona1.getCognome());
		System.out.println("Eta: " + persona1.getEta());


		Persona persona2 = new Persona();
		System.out.println("\n--- Persona 2 ---");
		System.out.println("Nome: " + persona2.getNome());
		System.out.println("Cognome: " + persona2.getCognome());
		System.out.println("Eta: " + persona2.getEta());


		// Clono la persona1
		Persona personaX = null;
		Persona persona3 = new Persona(personaX);
		System.out.println("\n--- Persona 3 ---");
		System.out.println("Nome: " + persona3.getNome());
		System.out.println("Cognome: " + persona3.getCognome());
		System.out.println("Eta: " + persona3.getEta());
	}


	private static void test1B(){
		Studente studente1 = new Studente();
		System.out.println("--- Studente 1 ---");
		System.out.println("Nome: " + studente1.getNome());
		System.out.println("Cognome: " + studente1.getCognome());
		System.out.println("Eta: " + studente1.getEta());
		System.out.println("Matricola: " + studente1.getMatricola());
		System.out.println("Anno iscrizione: " + studente1.getAnnoIscrizione());

		Studente studente2 = new Studente("Paolo", "Rossi", 20, 10254, 2022);
		System.out.println("--- Studente 2 ---");
		System.out.println("Nome: " + studente2.getNome());
		System.out.println("Cognome: " + studente2.getCognome());
		System.out.println("Eta: " + studente2.getEta());
		System.out.println("Matricola: " + studente2.getMatricola());
		System.out.println("Anno iscrizione: " + studente2.getAnnoIscrizione());

		Studente studente3 = new Studente(studente2);
		System.out.println("--- Studente 3 ---");
		System.out.println("Nome: " + studente3.getNome());
		System.out.println("Cognome: " + studente3.getCognome());
		System.out.println("Eta: " + studente3.getEta());
		System.out.println("Matricola: " + studente3.getMatricola());
		System.out.println("Anno iscrizione: " + studente3.getAnnoIscrizione());

		Docente docente1 = new Docente();
		System.out.println("--- Docente 1 ---");
		System.out.println("Nome: " + docente1.getNome());
		System.out.println("Cognome: " + docente1.getCognome());
		System.out.println("Eta: " + docente1.getEta());
		System.out.println("Matricola: " + docente1.getInsegnamento());

		Docente docente2 = new Docente("Laura", "Bianchi", 20, "Programmazione 2");
		System.out.println("--- Docente 2 ---");
		System.out.println("Nome: " + docente2.getNome());
		System.out.println("Cognome: " + docente2.getCognome());
		System.out.println("Eta: " + docente2.getEta());
		System.out.println("Matricola: " + docente2.getInsegnamento());

		Docente docente3 = new Docente(docente2);
		System.out.println("--- Docente 3 ---");
		System.out.println("Nome: " + docente3.getNome());
		System.out.println("Cognome: " + docente3.getCognome());
		System.out.println("Eta: " + docente3.getEta());
		System.out.println("Matricola: " + docente3.getInsegnamento());
	}


	private static void test1C(){
		Persona persona = new Persona("Simone", "Picciau", 18);
		Studente studente = new Studente("Paolo", "Rossi", 20, 10254, 2022);
		Docente docente = new Docente("Laura", "Bianchi", 20, "Programmazione 2");
		double costoBigliettoIntero = 100;
		
		System.out.println("Costo Biglietto per la persona generica: " + persona.calcolaCostoBiglietto(costoBigliettoIntero));
		System.out.println("Costo Biglietto per il docente: " + docente.calcolaCostoBiglietto(costoBigliettoIntero));
		System.out.println("Costo Biglietto per lo studente: " + studente.calcolaCostoBiglietto(costoBigliettoIntero));
	}


	private static void test1D(){
		Persona persona = null;
		persona = new Studente("Paolo", "Rossi", 20, 10254, 2022);
		double costoBigliettoIntero = 100;

		System.out.println("Costo Biglietto scontato: " + persona.calcolaCostoBiglietto(costoBigliettoIntero));


		Studente studente = (Studente) persona;

		System.out.println("Costo Biglietto scontato: " + persona.calcolaCostoBiglietto(costoBigliettoIntero));


	}


	private static void test1E(){
		

	}

}