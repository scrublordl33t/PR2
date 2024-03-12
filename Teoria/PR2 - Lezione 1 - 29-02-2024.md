# Introduzione

## I linguaggi di programmazione
Un linguaggio di programmazione è un insieme di parole, codici e simboli che permettono ad un programmatore di dare istruzioni ad un calcolatore. Essi forniscono delle astrazioni e si distinguono in:
- Linguaggi macchina
	- Si tratta di linguaggi in cui sono scritti i programmi *direttamente eseguibili* da un calcolatore. Definiscono l'insieme di istruzioni che un processore è in grado di compiere e in cui i codici da eseguire devono essere tradotti
- Linguaggi ad alto livello
	- Si tratta di linguaggi *indipendenti* dall'hardware, più semplici da comprendere per un programmatore. Affinché i programmi scritti in linguaggio ad alto livello possano essere eseguite devono essere tradotti in linguaggio macchina. Ciò avviene secondo due modi:
		- Compilazione
		- Interpretazione

La complessità dei problemi risolvibili è direttamente correlata al genere e alla qualità dell'astrazione considerata. Un programmatore deve essere in grado di stabilire l'associazione tra il modello della macchina e il modello del problema che viene risolto.

## I paradigmi di programmazione
Si distinguono 4 paradigmi fondamentali:
- **Imperativo** (es: Pascal, C)
- **Funzionale** (es: Lisp)
- **Logico** (es: Prolog)
- **Ad Oggetti** (es: C++, Java)

## Java e come si differenzia dal linguaggio C
In entrambi i casi si tratta di linguaggi compilati, tuttavia nel caso del linguaggio C la compilazione di un programma per una certa architettura hardware andava a vincolare l'eseguibile a quella particolare architettura, impedendone la portabilità.
Java funziona diversamente, il programma viene infatti compilato (tramite JavaC, Java Compiler) ma non tradotto in linguaggio macchina proprietario per l'architettura di destinazione, ma viene tradotto per la macchina virtuale JVM (Java Virtual Machine), che funziona da strato intermedio tra compilatore e hardware. Il vantaggio di questo approccio è che il programma compilato può di conseguenza girare su qualsiasi configurazione hardware, purché su di essa sia installato Java e la JVM.
Per lo sviluppo di software Java è necessario installare JDK (Java Development Kit), mentre per l'esecuzione di programmi compilati per Java è sufficiente JRE (Java Runtime Environment)


## La programmazione orientata agli oggetti
La Programmazione orientata ad oggetti (OOP) è un paradigma di programmazione organizzato attorno a degli "oggetti" piuttosto che delle "azioni" e a dei "dati" piuttosto che alla "logica".
Esso prevede il raggruppamento sotto ad un'entità detta "*Classe*" di strutture dati e delle procedure che operano su di esse, creando un *oggetto* dotato di proprietà e metodi che operano sui dati dell'oggetto stesso.
I principi alla base dell'OOP sono:
- Astrazione
- Incapsulamento (ed information hiding)
- Modularità
- Gerarchia
- Polimorfismo

### Astrazione
L'astrazione viene utilizzata per la gestione della complessitò di un programma in base alle caratteristiche di un'entità che la distingue dalle altre. Tramite l'astrazione è possibile scomporre un sistema software complesso in componenti più piccole e semplici, garantendo facilità e al contempo efficienza.
L'approccio orientato agli oggetti consente al programmatore di rappresentare in maniera generalizzata gli elementi nello spazio dei problemi (oggetti).
La classe rappresenta una certa categoria di oggetti e definisce un tipo di dato per un determinato oggetto della classe stessa. Essa possiede delle proprietà dette **attributi**, delle operazioni dette **relazioni** ed una semantica. Ciascun oggetto viene detto **istanza** di una classe e possiede:
- Uno **stato**
	- Si tratta di una possibile condizione nella quale l'oggetto dovrebbe esistere. Esso può cambiare nel tempo e viene implementato tramite attributi e collegamenti ad altri oggetti.
- Un **comportamento**
	- Determina come un oggetto agisce e reagisce alle richieste di un altro oggetto. Viene rappresentato mediante le operazioni
- Un'**identità**
	- Rende possibile la distinzione tra due oggetti anche nel caso in cui abbiano lo stesso stato e lo stesso valore negli attributi


### Incapsulamento e Information Hiding
Nella programmazione ad oggetti, i dettagli implementativi e le scelte interne di design di tutti i costrutti risultano nascosti all'utente, così come gli effetti che esse comportano sono nascoste ai possibili client.
Ciascun oggetto "incapsula" al suo interno gli attributi e i metodi che agiscono su di essi. L'utilizzo dell'incapsulamento riduce mediamente il costo necessario a correggere gli errori in fase di sviluppo.


### Modularità
Il modulo è un componente di un sistema più vasto, il quale opera all'interno del sistema in modo indipendente dalle operazioni degli altri moduli.
Gli oggetti sono raggruppabili in **package**, **componenti** e **subsystem**.


### Ereditarietà
I concetti che raggruppano i dati e le funzionalità possono essere organizzati in base ad un certo ordine grazie all'ereditarietà, la quale può essere rappresentata sotto forma di un albero.
Tramite l'ereditarietà viene espressa la similarità tra tipi, utilizzando concetti di **tipo base** e **tipo derivato**; il primo contiene tutte le caratteristiche ed i comportamenti condivisi dal secondo. Il tipo ereditato duplica l'interfaccia del tipo base, quindi in termini di classe la classe derivata deve essere dello stesso tipo di quella base.
Per differenziare le due classi vengono utilizzati due metodi:
- Estensione
	- vengono aggiunti nuovi metodi alla classe derivata, estenendo la classe base
- Overriding (sovrascrittura)
	- viene sovrascritto il metodo mediante il quale si cambia il comportamento del metodo della classe base


### Polimorifsmo
Il polimorifsmo permette alle variabili e ai loro valori di avere più di un tipo.