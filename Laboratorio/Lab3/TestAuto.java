package it.unica.pr2.veicoli;
import it.unica.pr2.veicoli.tipi.*;

public class TestAuto{

    public static void main(String[] args){
        
        Moto m = new Moto("Yamaha", "MT-09", 2017); //marca, modello, anno
        Moto m2 = new Moto(m);
        Auto a = new Auto("Fiat", "Panda", 2016); // marca, modello, anno
        assert a instanceof Veicolo;
        assert m instanceof Veicolo;

        
        m.setCilindrata(850);
        assert m.descrizione().equals("Moto Yamaha MT-09, 2017, 850cc");

        a.setCilindrata(1200);
        assert a.descrizione().equals("Auto Fiat Panda, 2016, 1200cc");

        
        Trattore t = new Trattore("fiat", 3.58, 3.2); //marca, peso in tonnellate, altezza
        Ruspa r = new Ruspa("caterpillar", 5.5, 4.5); //marca, peso in tonnellate, altezza

        assert t instanceof MezziPesanti && r instanceof MezziPesanti;

        
        Auto a2 = new Auto(a);
        assert a2.descrizione().equals("Auto Fiat Panda, 2016, 1200cc");
        assert a2.equals(a);

        
        m.hasABS(true);
        m2.hasABS(false);
        assert m.sicurezza().equals("La moto Yamaha MT-09, 2017, 850cc ha ABS, sei abbastanza sicuro!");
        assert m2.sicurezza().equals("La moto Yamaha MT-09, 2017, 650cc non ha ABS, non sei abbastanza sicuro!");

        a.hasFourAirbags(true);
        a2.hasFourAirbags(false);
        assert a.sicurezza().equals("L'auto Fiat Panda, 2016, 1200cc ha 4 airbags, sei abbastanza sicuro!");
        assert a2.sicurezza().equals("L'auto Fiat Panda, 2016, 1200cc non ha 4 airbags, non sei abbastanza sicuro!");
        /**/
    }
}