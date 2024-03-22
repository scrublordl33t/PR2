package it.unica.pr2.azienda;

import it.unica.pr2.azienda.dipendenti.*; // le classi andranno create qua dentro

public class TestAzienda{

    public static void main(String[] args){

        Dipendente d = new Dipendente("Mario", "Rossi", 1000); //nome, cognome, stipendio
        d.straordinari(10, 14.5); // ore, paga oraria
        assert d.stipendioNetto() == 1145;

        
        Azienda a = new Azienda("Unica", "Via Is Mirrionis 1", "Cagliri"); //nome azienda, sede legale, citta NB: OGNI AZIENDA PUO' ASSUMERE MASSIMO 5 DIPENDENTI
        a.assumi(d);
        assert a.totaleStipendi() == 1145;
        assert a.totaleDipendenti() == 1;

        
        DipendenteTemporaneo dt1 = new DipendenteTemporaneo("Giovanni", "Bianchi", 1000, 2025); //nome, cognome, stipendio , anno scadenza contratto
        a.assumi(dt1);
        assert a.totaleStipendi() == 2145;

        DipendenteIndeterminato di1 = new DipendenteIndeterminato("Paolo", "Verdi", 1000,"Manager"); //nome, cognome, stipendio , mansione
        a.assumi(di1);
        DipendenteIndeterminato di2 = new DipendenteIndeterminato("Luca", "Neri", 1000,"Segretario"); //nome, cognome, stipendio , mansione
        a.assumi(di2);
        DipendenteIndeterminato di3 = new DipendenteIndeterminato("Marco", "Gialli", 1000,"Segretario"); //nome, cognome, stipendio , mansione
        a.assumi(di3); 
        assert a.totaleStipendi() == 5145;
        assert a.totaleDipendenti() == 5;
        
        
        DipendenteIndeterminato di4 = new DipendenteIndeterminato("Andrea", "Rosa", 1000,"Segretario"); //nome, cognome, stipendio , mansione
        a.assumi(di4); //ERRORE: L'azienda ha già 5 dipendenti
        assert a.lavoraQui(di4) == false;

        //hint: oggetto instanceof Classe per controllare se un oggetto è o meno istanza di una determinata classe

        assert a.contaManager() == 1;
        assert a.contaSegretari() == 2;

        
        assert a.contaDipendentiTemporanei() == 1;
        assert a.contaDipendentiIndeterminati() == 3;

        /**/ 
    }
}