public class TestPalestra{
	public static void main(String[] args){
		Tessera tessera1 = new Tessera();
		Tessera tessera2 = new Tessera("Simone", "Picciau", 123);
		Tessera tessera3 = new Tessera(tessera2);
		tessera3.setCognome("Rossi");

		System.out.println("*** Tessera 1: ***\n" + tessera1.toString());
		System.out.println("\n*** Tessera 2: ***\n" + tessera2.toString());
		System.out.println("\n*** Tessera 3: ***\n" + tessera3.toString());

		Atleta tessera4 = new Atleta("Paolo", "Bianchi", 321, "Nuoto", "15/02/2024");
		Manutentore tessera5 = new Manutentore();
		Segretario tessera6 = new Segretario("Luisa", "Verdi", 654, 10);

		System.out.println("\n*** Tessera 4: ***\n" + tessera4.toString());
		System.out.println("\n*** Tessera 5: ***\n" + tessera5.toString());
		System.out.println("\n*** Tessera 6: ***\n" + tessera6.toString());


	}
}