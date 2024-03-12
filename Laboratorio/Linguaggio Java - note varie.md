# Primi passi

## Hello World

Nel linguaggio Java, ciascuna applicazione inizia con un nome di una classe il quale deve essere lo stesso del file associato.
Ad esempio, supponiamo di creare un file chiamato Main.java e di scrivere al suo interno il seguente codice:
````java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
````
In questo caso abbiamo quindi creato una classe main, con all'interno una procedura main associata la quale andrà a stampare il messaggio "Hello World"

Affinché il file possa essere eseguito è necessario compilarlo. Per fare ciò si utilizza il comando *javac* da terminale, seguito dal nome del file .java che si vuole compilare.
`javac Main.java`
Una volta compilato, verrà creato nella stessa cartella un file .class associato.  
Per eseguire il programma sarà poi necessario richiamare il comando *java* seguito dal nome del programma (senza l'estensione del file).
`java Main`
Nel caso del nostro esempio, l'output risultante sarebbe:  
`Hello World`

### Spiegazione dell'esempio

Come detto sopra, ciascuna riga di codice del linguaggio Java deve essere contenuta all'interno di una **classe**. Nell'esempio sopra abbiamo chiamato questa classe Main. Per convenzione una classe dovrebbe sempre iniziare con la prima lettera maiuscola e seguire la regola stilistica del CamelCase per le lettere a seguire.  
**ATTENZIONE**: Java è un linguaggio case-sensitive, pertanto se si avessero due classi chiamate "MyClass" e "myclass" esse sarebbero due cose distinte.  
Come già detto, in Java il nome del file deve obbligatoriamente corrispondere al nome della classe.

### Il metodo "main"
Il metodo *main()* è essenziale per il funzionamento di qualunque programma Java
```java
public static void main(String[] args) {
  System.out.println("Hello World");
}
```
Tutto il codice all'interno del metodo *main()* verrà eseguito.
Nell'esempio sopra abbiamo utilizzato il metodo *println()* per stampare a video il testo "Hello World".

**Note aggiuntive:** le parentesi graffe { } segnano l'inizio e la fine di un blocco di codice.  
*System* è una classe predefinita di Java che contiene al suo interno diversi membri utili, tra cui *out* (abbreviazione di *output*). Il metodo *println()* (abbreviazione di *print line*) viene utilizzato per stampare un valore a schermo (o su un file).  
La terminazione di ciascuna riga di codice deve essere indicata col punto e virgola ( ; ).


# L'output in Java

## Output del testo

Come detto nell'esempio sopra, è possibile utilizzare il metodo *println()* per produrre in output dei valori o del testo in Java.
```java
System.out.println("Hello World!");
```
È possibile aggiungere quante *println()* si vuole, tuttavia è opportuno ricordare che verrà aggiunta una nuova riga per ciascun metodo utilizzato.
```java
System.out.println("Hello World!");
System.out.println("I am learning Java.");
System.out.println("It is awesome!");
```
### Le doppie virgolette ( " " )

Quando si lavora con del testo, esso deve essere contenuto all'interno delle doppie virgolette "".  
Dimenticare di fare ciò produrrà un errore in fase di compilazione
```java
System.out.println("This sentence will work!"); // Questo codice è corretto
System.out.println(This sentence will produce an error); // Questo codice è errato
```
### Il metodo Print()

In Java esiste anche il metodo *print()*, il quale è simile a *println()*, la differenza sostanziale è che non aggiunge automaticamente un carattere di newline alla fine dell'output, pertanto due invocazioni del metodo print andranno a scrivere sulla stessa riga.
## Output numerico

Il metodo *println()* può essere utilizzato anche per l'output di valori numerici, tuttavia a differenza dell'output di testo non utilizzeremo le doppie virgolette:
```java
System.out.println(3);
System.out.println(358);
System.out.println(50000);
```
È inoltre possibile fare dei calcoli matematici all'interno di un metodo *println()*
```java
System.out.println(3 + 3);
System.out.println(2 * 5);
```


# Commenti in Java

I commenti possono essere utilizzati per spiegare porzioni di codice Java, rendendolo di conseguenza più leggibile. Possono inoltre essere utilizzati per prevenire l'esecuzione di certe porzioni di codice in fase di testing.  
Si distinguono due tipi di commenti:
### Single-Line comments

I commenti single-line iniziano con due forward slash // e tutto il testo compreso tra questi slash e la fine della riga è ignorato da Java (e di conseguenza non viene eseguito).  
Alcuni esempi di commento single-line possono essere i seguenti:
```java
// This is a comment
System.out.println("Hello World");
System.out.println("Hello World"); // This is also a comment
```

### Multi-Line comments

I commenti multi-line iniziano con /* e terminano con \*/.
Tutto il testo racchiuso tra i delimitatori verrà ignorato da Java.
Un esempio di commento multi-line utilizzato per spiegare il codice può essere il seguente:
```java
/* The code below will print the words Hello World
to the screen, and it is amazing */
System.out.println("Hello World");
```
Anche i commenti multi-line possono essere utilizzati per commentare intere parti di codice che si desidera non eseguire.


# Variabili in Java

## Tipi di Variabile

Le variabili sono dei "contenitori" in cui vengono conservati dei valori. In Java esistono diversi **tipi** di variabili, ad esempio:
- *String*
	- conservano del testo e i suoi valori sono delimitati da doppie virgolette
- *int*
	- conservano numeri interi, senza parte decimale
- *float*
	- conservano numeri a virgola mobile, con parte decimale
- *char*
	- conservano singoli caratteri e i suoi valori sono delimitati da singole virgolette
- *boolean*
	- conservano valori a due stati, vero o falso

### Dichiarazione (creazione) di variabili singole

Per creare una variabile in Java è necessario specificarne il tipo ed assegnargli un valore:
`type variableName = value`
Dove *type* è uno dei tipi di Java (come quelli menzionati sopra), *variableName* è il nome della variabile.  
Il simbolo di uguale ( = ) viene utilizzato per assegnare un valore alla variabile.  
**ATTENZIONE**: non bisogna confondere il singolo uguale ( = ) ed il doppio uguale ( == ) in quanto il primo viene usato per l'**assegnazione** di un valore ad una variabile, mentre il secondo viene utilizzato per il **confronto** tra due variabili o valori.

Supponiamo di voler creare una variabile per conservare del testo (es: il nome di una persona), andremo quindi a dichiarare una variabile di nome "name", di tipo String e a cui assegneremo il valore "John":
```java
String name = "John";
```
Ora supponiamo di voler fare lo stesso, ma per una variabile di tipo numerico. Andremo allora a dichiarare una variabile chiamata myNum, di tipo int a cui assegneremo il valore 15:
```java
int myNum = 15;
```

Non è obbligatorio assegnare immediatamente il valore ad una variabile in fase di dichiarazione, è possibile farlo in seguito. Ad esempio:
```java
int myNum;
myNum = 15;
```
**ATTENZIONE**: assegnare un nuovo variabile ad una variabile già esistente andrà a sovrascrivere il valore precedentemente assegnato.

È possibile evitare la sovrascrittura di una variabile utilizzando la keyword *final* prima della dichiarazione del tipo della variabile. Facendo ciò si renderà la variabile "finale" o "costante", ciò significa che non sarà possibile cambiarne il contenuto, rendendola di "sola-lettura".
```java
final int myNum = 15;
myNum = 20;  // will generate an error: cannot assign a value to a final variable
```

Di seguito alcuni esempi di come dichiarare gli altri tipi di variabili sopracitate:
```java
int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";
```
### Dichiarazione (creazione) di variabili multiple

Per dichiarare più di una variabile dello stesso tipo, è possibile utilizzare una lista di elementi separati da virgole. In questo modo anziché scrivere:
```java
int x = 5;
int y = 6;
int z = 50;
System.out.println(x + y + z);
```
possiamo direttamente scrivere (riducendo il numero di righe utilizzate):
```java
int x = 5, y = 6, z = 50;
System.out.println(x + y + z);
```

## Stampa delle variabili

### Mostrare le variabili a schermo

Il metodo *println()* è solitamente utilizzato per mostrare le variabili. È possibile combinare del testo e delle variabili utilizzando il carattere + come mostrato nell'esempio che segue:
```java
String name = "John";
System.out.println("Hello " + name);
```
È inoltre possibile utilizzare il carattere + per aggiungere una variabile ad un'altra variabile:
```java
String firstName = "John ";
String lastName = "Doe";
String fullName = firstName + lastName;
System.out.println(fullName);
```
Per valori numerici, il carattere + funziona come operatore matematico (nell'esempio che segue verranno usati delle variabili di tipo integer)
```java
int x = 5;
int y = 6;
System.out.println(x + y); // Print the value of x + y
```
Nell'esempio di sopra avremo quindi che x prende il valore 5, y prende il valore 6 e tramite println() andremo a mostrare il valore dell'operazione x+y, ossia 11.


## Identificatori

Tutte le variabili in Java devono essere identificate da nomi univoci.  
Questi nomi sono chiamati *identificatori*.  
Gli identificatori possono essere nomi corti (es: *x* ed *y*) oppure nomi più descrittivi (es: *età*, *somma*, *valoreTotale*). Per questione stilistica, in Java si consiglia di utilizzare nomi descrittivi in modo da scrivere un codice facilmente comprensibile e mantenibile.
```java
// Good
int minutesPerHour = 60;

// OK, but not so easy to understand what m actually is
int m = 60;
```


## Tipi di dato

Come detto in precedenza, una variabile in Java deve essere di un tipo di dato specifico:
```java
int myNum = 5;               // Integer (whole number)
float myFloatNum = 5.99f;    // Floating point number
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String
```
I tipi di dato si suddividono in due gruppi:
- **Primitivi**
	- byte, short, int, long, float, double, boolean, char
- **Non-Primitivi**
	- String, Array, Classi

I tipi di dato primitivi indicano la *dimensione* e il *tipo* di valori di una data variabile, ma non possiedono metodi aggiuntivi.


### Tipi di dato primitivi
#### Numbers

I tipi di dato numerici primitivi si dividono in due gruppi:
- Integer
	- Conservano al loro interno soltanto numeri interi, siano essi positivi o negativi, senza cifra decimale. Nello specifico distinguiamo *byte*, *short*, *int*, e *long*.
- Floating point
	- Rappresentano i numeri con parte frazionaria, contengono una o più cifre decimali. In particolare distinguiamo in *float*, e *double*. (La differenza sta nella precisione dopo la virgola)

Nonostante in Java esistano tutti questi tipi diversi per rappresentare i numeri, solitamente si utilizzano i tipi *int* per la rappresentazione di numeri interi e *double* per la rappresentazione di numeri in virgola mobile.

#### Boolean

Molto spesso nella programmazione è necessario avere un tipo di dato il cui valore possa oscillare solo tra due stati (es: SI/NO, ON/OFF, VERO/FALSO). Per questo scopo in Java esiste il tipo *boolean,* che può assumere soltanto i valori *true* e *false*.
```java
boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);     // Outputs true
System.out.println(isFishTasty);   // Outputs false
```

#### Characters

Il tipo di dato *char* viene utilizzato per salvare un singolo carattere, il quale deve essere inserito tra singoli apici:
```java
char myGrade = 'B';
System.out.println(myGrade);
```
In alternativa, è possibile utilizzare i valori ASCII per mostrare i caratteri
```java
char myVar1 = 65, myVar2 = 66, myVar3 = 67;
System.out.println(myVar1);
System.out.println(myVar2);
System.out.println(myVar3);
```

#### String (eccezione)

Il tipo di dato *String* viene utilizzato per salvare sequenze di caratteri (es: del testo). Il testo salvato deve essere inserito tra doppi apici:
```java
String greeting = "Hello World";
System.out.println(greeting);
```
Il tipo *String* in realtà non è un tipo primitivo, in quanto si riferisce ad un oggetto. Gli oggetti di tipo *String* possiedono dei metodi appositi per eseguire operazioni specifiche per le stringhe.


### Tipi di dato non-primitivi

I tipi di dato non-primitivi sono anche detti *reference types* (tipi riferiti), perché si riferiscono a degli oggetti. Le principali differenze tra tipi di dato primitivi e non-primitivi sono:
- I tipi primitivi sono predefiniti in Java, i non primitivi (ad eccezione del tipo *String*) sono creati dal programmatore e non definiti da Java.
- I tipi non-primitivi possono essere utilizzati per richiamare metodi che eseguono certe operazioni, cosa che non possono fare i tipi primitivi.
- Un tipo primitivo ha sempre un valore, un tipo non-primitivo può essere *null*.
- I nomi dei tipi primitivi iniziano con la prima lettera minuscola (es: *float*), mentre i tipi non primitivi iniziano con la lettera maiuscola (es: *String*).

Alcuni esempi di tipi non-primitivi sono *String, Array, Class, Interface*, ecc...


### Casting del tipo

Il casting del tipo è ciò che avviene quando si assegna il valore di un tipo primitivo di dato ad un altro tipo. In Java si distinguono due tipi di casting:
- **Widening Casting** (automatico)
	- Avviene automaticamente ogni qual volta si converte un tipo di dato piccolo a un corrispettivo più grande (es: byte -> short -> char -> int -> long -> float -> double)
- **Narrowing Casting** (manuale)
	- Deve essere effettuato manualmente quando si passa da un tipo di dato grande ad un corrispettivo più piccolo (es: double -> float -> long -> int -> char -> short -> byte)

Un esempio di codice dove avviene un widening casting è il seguente:
```java
public class Main {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
  }
}
```

Mentre un esempio dove avviene un narrowing casting (tramite apposizione del tipo tra parentesi davanti al valore) è il seguente:
```java
public class Main {
  public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}
```


# Operatori in Java

Gli operatori sono utilizzati per effettuare operazioni su variabili e rispettivi valori.  
Java distingue gli operatori in cinque gruppi principali:  
- **Operatori Aritmetici**
  Consentono di eseguire operazioni aritmetiche sulle variabili
	- Somma (+)
	- Sottrazione (-)
	- Moltiplicazione (\*)
	- Divisione (/)
	- Modulo (%)
	- Incremento (++)
	- Decremento (--)
- **Operatori di Assegnamento**
  Consentono di assegnare valori alle variabili
	- Assegnamento semplice (=)
	- è possibile combinare l'operatore di assegnamento con gli operatori aritmetici per assegnare alla variabile interessata il risultato di un'operazione tra essa e un valore o un'altra variabile (es: x +=3 -> x = x + 3)
- **Operatori di Confronto**
  Gli operatori di confronto vengono utilizzati per confrontare due valori o due variabili. La loro applicazione tipica è nei casi in cui bisogna prendere delle decisioni sul flusso d'esecuzione del programma (es: if/else). Il valore restituito da un confronto è un *booleano*  (*true* o *false*)
	- Uguale a (\==)
	- Diverso (!=)
	- Maggiore di (>)
	- Minore di (<)
	- Maggiore o uguale (>=)
	- Minore o uguale (<=)
- **Operatori Logici**
  Gli operatori logici sono un altro modo di verificare per valori *true* o *false*. Vengono adoperati per determinare la logica tra due variabili o valori
	- AND logico (&&)
	- OR logico (||)
	- NOT logico (!)
- **Operatori Bitwise**


# Stringhe in Java

## Variabili di tipo stringa

Le stringhe vengono utilizzate per memorizzare del testo. Una variabile di tipo *String* contiene una collezione di caratteri, racchiusa tra doppi apici.
```java
String greeting = "Hello";
```
Nel linguaggio Java una stringa è in realtà un oggetto, il quale contiene metodi che possono effettuare certe operazioni sulle stringhe. Ad esempio, è possibile conoscere la lunghezza di una stringa tramite il metodo *length()*:
```java
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());
```
Altri metodi utilizzati sono *toUpperCase()* e *toLowerCase()*, i quali consentono di convertire una generica stringa a caratteri maiuscoli o minuscoli rispettivamente.
```java
String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"
```
È inoltre possibile trovare l'indice (posizione) della prima occorrenza di un certo testo all'interno di una stringa tramite *indexOf()*, tuttavia nel conteggio delle posizioni viene tenuto conto anche degli spazi vuoti.

## Concatenazione di stringhe

L'operatore aritmetico di addizione (+) può essere utilizzato tra stringhe per combinarle. Questa operazione prende il nome di **concatenazione**. Di seguito un esempio pratico:
```java
String firstName = "John";
String lastName = "Doe";
System.out.println(firstName + " " + lastName);
```
In questo caso abbiamo utilizzato un blocco di testo vuoto (" ") per creare uno spazio tra *firstName* e *lastName* in fase di stampa.  
È anche possibile utilizzare il metodo *concat()* per concatenare due stringhe, come nell'esempio seguente:
```java
String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));
```

## Numeri e Stringhe in Java

Come visto sopra, è possibile utilizzate l'operatore aritmetico di addizione (+) sia per l'operazione di addizione che per l'operazione di concatenazione. Nel caso di due variabili numeriche verrà restituita la somma dei loro valori, nel caso di due stringhe verrà restituita la loro concatenazione.  
Nel caso invece di un numero e una stringa, verrà comunque eseguita una concatenazione, come nell'esempio seguente:
```java
String x = "10";
int y = 20;
String z = x + y;  // z will be 1020 (a String)
```


## Stringhe - caratteri speciali

Poiché le stringe vanno scritte all'interno dei doppi apici, potrebbero capitare situazioni in cui Java potrebbe interpretare male una certa porzione di testo, generando un errore come nell'esempio seguente:
```java
String txt = "We are the so-called "Vikings" from the north.";
```
Affinché la stringa venga interpretata correttamente, è necessario utilizzare un carattere di *escape* tramite backslash ( \\ ).  
```java
String txt = "We are the so-called \"Vikings\" from the north.";
```
Alcuni tipi comuni di escape validi in Java sono:
- \\' - Singolo Apice
- \\" - Doppio Apice
- \\ - Backslash
- \\n - New Line
- \\r - Carriage Return
- \\t - Tab
- \\b - Backspace
- \\f - Form Feed


# Matematica in Java

## Java Math

La classe Math di Java contiene diversi metodi che consentono di effettuare operazioni matematiche sui numeri.
Alcuni esempi di operazioni possono essere:
- **Math.max(x,y)**
	- restituisce il valore più alto tra x ed y
- **Math.min(x,y)**
	- restituisce il valore più piccolo tra x ed y
- **Math.sqrt(x)**
	- restituisce la radice quadrata di x
- **Math.abs(x)**
	- restituisce il valore assoluto di x
- **Math.random()**
	- restituisce un numero positivo tra 0.0 (incluso) e 1.0 (escluso)
	- è possibile imporre un range arbitrario di valori usando questa formula (nell'esempio un range da 0 a 100)
	  `int randomNum = (int)(Math.random() * 101);  // 0 to 100`

Esistono tanti altri metodi all'interno della classe *Math*, abbiamo riportato solo alcuni dei più utilizzati. 


# Esecuzione condizionale in Java

## if...else

Come visto in precedenza, Java supporta la valutazione di espressioni logico-matematiche. Possiamo usare queste condizioni per effettuare azioni diverse in base agli esiti della valutazione. In Java esistono quattro dichiarazioni condizionali:
- **if**
	- da utilizzare quando si vuole eseguire il codice se la condizione da verificare è vera
- **else**
	- da utilizzare quando si vuole eseguire il codice se se la condizione da verificare è falsa
- **else if**
	- da utilizzare quando si vuole eseguire il codice se la prima (o precedente) condizione è falsa
- **switch**
	- da utilizzare quando si vogliono proporre più alternative da eseguire

La sintassi di un costrutto *if* è la seguente:
```java
if (condition) {
  // block of code to be executed if the condition is true
}
```
Mentre un esempio pratico può essere il seguente:
```java
if (20 > 18) {
  System.out.println("20 is greater than 18");
}
```
In questo caso la condizione restituirà *true*, pertanto verrà stampato a schermo l'output della *println()*.
**ATTENZIONE**: l'*if* è scritto in minuscolo. L'uso di lettere maiuscole (If, IF) causerà un errore.

La sintassi di un costrutto *if-else* è invece la seguente
```java
if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}
```
Un esempio pratico dell'applicazione può essere:
```java
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."
```
In questo caso la condizione restituirà *false*, pertanto si entrerà nel ramo dell'else e andrà in stampa il relativo output.

Nel caso si volesse proporre una terza alternativa possibile si utilizza l'*else-if*
```java
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
```
Un esempio pratico può essere:
```java
int time = 22;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."
```
In questo caso andiamo a verificare due condizioni diverse, entrambe restituiranno *false*, pertanto verrà stampato a video nuovamente l'output della clausola *else*.

## Operatore ternario

Esiste un altro modo per compattare un costrutto if-else, ossia tramite l'utilizzo dell'**operatore ternario**.
La sua sintassi è la seguente:
```java
variable = (condition) ? expressionTrue :  expressionFalse;
```
Prendiamo come esempio il seguente codice:
```java
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
```
Possiamo utilizzare l'operatore ternario per compattarlo e riscriverlo come:
```java
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);
```

## Switch

È possibile rimpiazzare molteplici *if-else* con uno *switch*.  
Lo switch seleziona ed esegue solo uno tra diversi blocchi di codice, dopo la valutazione di una condizione. La sua sintassi è la seguente:
```java
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
```
Il suo funzionamento è piuttosto semplice:
1. L'espressione *switch* viene valutata una sola volta
2. Il valore dell'espressione viene confrontato con il valore di ciascun *case*
3. Se avviene un match, il blocco di codice associato viene eseguito
4. Le keywords *break* e *default* sono opzionali. 
   La prima indica la fine del blocco di codice associato ad un dato case, ciò fa si che l'esecuzione del codice si limiti a quella del blocco corrispondente, ignorando gli altri blocchi; 
   La seconda indica un generico case non rientrante tra quelli specificati.


# Cicli in Java

I cicli eseguono blocchi di codice fintanto che una certa condizione è valida. Risultano utili in quanto fanno risparmiare del tempo, riducono gli errori e rendono il codice più leggibile.

## Cicli While

I cicli *while* continuano l'esecuzione di un blocco di codice fintanto che una certa condizione specificata è vera (*true*). La loro sintassi è la seguente:
```java
while (condition) {
  // code block to be executed
}
```
Un esempio pratico può essere invece:
```java
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}
```
**ATTENZIONE**: non bisogna dimenticare di modificare il valore della variabile utilizzato nella valutazione della condizione, altrimenti si rischia di avere cicli infiniti.

## Cicli Do/While

Una variante del ciclo *while* è il *do/while*. La differenza sostanziale è che in questo caso il blocco di codice contenuto all'interno del ciclo verrà eseguito sicuramente almeno una volta prima di controllare la condizione. La sua sintassi è la seguente:
```java
do {
  // code block to be executed
}
while (condition);
```
Un esempio pratico invece può essere:
```java
int i = 0;do {
  System.out.println(i);
  i++;
}
while (i < 5);
```

## Cicli For

I cicli *while* e *do/while* risultano comodi quando non si ha idea di quante volte dovrà essere eseguito un certo blocco di codice, ma quando questo valore è invece noto si può utilizzare un ciclo *for*. La sua sintassi è la seguente:
```java
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
```
- Statement 1 verrà eseguito una volta prima dell'esecuzione del blocco di codice
- Statement 2 definisce la condizione per l'esecuzione del blocco di codice
- Statement 3 viene eseguito (ogni volta) dopo che il blocco di codice è stato eseguito

Un esempio semplice può essere il seguente:
```java
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
```
In questo caso andremo a scrivere i numeri da 0 a 4

### Cicli For innestati

È possibile inserire un ciclo for all'interno di un altro ciclo for. In questo caso si parla di **cicli innestati**. Il ciclo interno verrà eseguito una volta per ciascuna iterazione del ciclo esterno. Ad esempio: 
```java
// Outer loop
for (int i = 1; i <= 2; i++) {
  System.out.println("Outer: " + i); // Executes 2 times
  
  // Inner loop
  for (int j = 1; j <= 3; j++) {
    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
  }
} 
```

### Cicli For-Each

Esiste anche una variante del ciclo *for*, il *for-each* che viene utilizzato esclusivamente per ciclare attraverso gli elementi di un array. La sua sintassi è la seguente:
```java
for (type variableName : arrayName) {
  // code block to be executed
}
```
Un esempio pratico invece può essere:
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
```
In questo caso andremo a stampare in output tutti gli elementi contenuti all'interno dell'array *cars*

## Break e Continue

### Break

Nella sezione degli switch è stata utilizzata l'istruzione *break*, la quale serviva ad uscire dalla condizione in esecuzione dello switch, ma essa può essere utilizzata anche per uscire fuori da un ciclo.  
Nel prossimo esempio andremo ad interrompere un ciclo che conta da 0 a 9 non appena l'indice raggiungerà il valore 4:
```java
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
}
```

### Continue

L'istruzione *continue* interrompe un'iterazione all'interno del ciclo non appena si verifica una condizione, per poi continuare con l'iterazione successiva.  
Nel prossimo esempio, che riprende il codice dell'esempio precedente, andremo a saltare il valore 4.
```java
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}
```


# Array in Java

## Proprietà degli array in Java

### Creazione ed assegnamento degli elementi

Gli array sono utilizzare per salvare più valori di una certa variabile, piuttosto che dichiarare una variabile separata per ciascun valore.  
Per dichiarare un array è necessario definire il tipo di variabile con delle **parentesi quadre** davanti ad esso.
```java
String[] cars;
```
Nel codice d'esempio abbiamo dichiarato una variabile di tipo array di stringhe nominata *cars*, che conterrà delle stringhe.  
È possibile inserire valori al suo interno tramite una lista separata da virgole, racchiusa tra parentesi graffe:
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
```
Se volessimo invece creare un array di numeri interi, faremo:
```java
int[] myNum = {10, 20, 30, 40};
```

### Accesso agli elementi di un array

È possibile accedere agli elementi di un array utilizzando l'indice posizionale. Ad esempio:
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo
```
**ATTENZIONE**: gli indici degli array partono da 0, \[0] è il primo elemento, \[1] il secondo e così via.

### Cambiare gli elementi di un array

Per cambiare il valore di un elemento specifico si utilizza sempre l'indice posizionale, ad esempio:
```java
cars[0] = "Opel";
```
In questo caso stiamo cambiando l'elemento alla prima posizione dell'array da Volvo ad Opel.
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
System.out.println(cars[0]);
// Now outputs Opel instead of Volvo
```

### Lunghezza di un array

È possibile conoscere quanti elementi sono presenti all'interno di un array tramite la proprietà *length*.
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);
// Outputs 4
```

## Cicli e Array

### Ciclare gli elementi di un array (for)

È possibile ciclare attraverso gli elementi di un array utilizzando un ciclo *for* combinato con la proprietà *length* per specificare quante volte il ciclo debba essere eseguito. Riprendendo il codice di sopra:
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (int i = 0; i < cars.length; i++) {
  System.out.println(cars[i]);
}
```
Andremo a ciclare tutti gli elementi dell'array *cars*.

### Ciclare gli elementi di un array (for-each)

Come detto precedentemente esiste un costrutto *for-each* apposito per ciclare gli elementi di un array. Riprendendo il codice dell'esempio di sopra:
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
```
Questo codice si legge così: per ogni i-esimo elemento di tipo stringa in *cars,* stampa il valore di i.  
Confrontando il *for* e il *for-each* appare evidente che in questo genere di operazioni il secondo risulti più facile da scrivere e più leggibile, in quanto non necessita di un contatore (e della proprietà length per conoscere la dimensione dell'array).

## Array multidimensionali

Un array multidimensionale è un array di arrays. Risultano comodi quando si vogliono memorizzare dei dati in formato tabellare. La sintassi per la creazione di un array a due dimensioni è la seguente:
```java
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
```
Si dichiara il tipo con doppie parentesi quadre e nell'assegnazione degli elementi si racchiudono gli elementi di ciascuna dimensione tra parentesi graffe.

### Accesso agli elementi di un array multidimensionale

Per accedere agli elementi di un array multidimensionale è necessario specificare due indici: uno per l'array ed uno per l'elemento al suo interno.  
Riprendendo l'esempio di sopra, proviamo ad accedere al terzo elemento della seconda colonna:
```java
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
System.out.println(myNumbers[1][2]); // Outputs 7
```

### Cambiare valore degli elementi

Come negli array monodimensionali, è possibile cambiare il valore di un elemento specificando i relativi indici posizionali:
```java
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
myNumbers[1][2] = 9;
System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7
```

### Ciclare gli elementi di un array multidimensionale

È possibile utilizzare un ciclo for innestato per ottenere gli elementi di un array a due dimensioni, tuttavia bisogna utilizzare due indici/contatori:
```java
public class Main {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }    }
  }
}
```

# Metodi in Java

Un metodo è un blocco di codice che viene eseguito solo quando viene richiamato. È possibile passare dei dati (detti *parametri*) ad un metodo. I metodi vengono utilizzati per effettuare certe azioni, note anche come **funzioni**. L'utilità dell'utilizzare i metodi è quella di poter riutilizzare parti di codice già definito altrove.

## Creazione di un metodo

Un metodo deve essere dichiarato all'interno di una classe. Viene definito dal suo nome, seguito da delle parentesi tonde ( ). Java fornisce svariati metodi predefiniti, come ad esempio *System.out.println()*, ma è possibile crearne di nuovi. Un esempio di metodo all'interno della classe *Main* può essere il seguente:
```java
public class Main {
  static void myMethod() {
    // code to be executed
  }
}
```
Nell'esempio sopra:
- **myMethod** è il nome del metodo
- **static** indica che il metodo appartiene alla classe Main e non ad un oggetto della classe Main
- **void** indica che il metodo non ha un valore di ritorno

## Chiamata di un metodo

Per richiamare un metodo in Java è necessario scrivere il suo nome, seguito da parentesi tonde ( ) e il punto e virgola ( ; ). Nell'esempio seguente il metodo *myMethod()* viene utilizzato per stampare del testo quando viene richiamato:
```java
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}

// Outputs "I just got executed!"
```

È anche possibile richiamare più volte un metodo
```java
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
    myMethod();
    myMethod();
  }
}

// I just got executed!
// I just got executed!
// I just got executed!
```

## Parametri di un metodo

È possibile passare delle informazioni ad un metodo come parametri.  
I parametri si comportano come variabili all'interno del metodo.  
Sono specificati dopo il nome del metodo, all'interno delle parentesi ed è possibile aggiungerne molteplici, separandoli opportunamente con la virgola.

Nel seguente esempio abbiamo un metodo che prende una stringa chiamata *fname* come parametro. Quando il metodo viene chiamato, gli passiamo un nome, che viene poi utilizzato all'interno del metodo per stampare nome e cognome di una persona:
```java
public class Main {
  static void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
  }

  public static void main(String[] args) {
    myMethod("Liam");
    myMethod("Jenny");
    myMethod("Anja");
  }
}
// Liam Refsnes
// Jenny Refsnes
// Anja Refsnes
```
**ATTENZIONE**: quando un parametro viene passato ad un metodo, viene detto *argomento*. Nell'esempio sopra fname è un *parametro*, mentre Liam, Jenny e Anja sono *argomenti*.

### Parametri multipli

Come detto sopra, è possibile passare più parametri, se opportunamente separati da virgole:
```java
public class Main {
  static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myMethod("Liam", 5);
    myMethod("Jenny", 8);
    myMethod("Anja", 31);
  }
}

// Liam is 5
// Jenny is 8
// Anja is 31
```
**ATTENZIONE**: quando si lavora con più parametri, la chiamata del metodo deve avere lo stesso numero di argomenti rispetto ai parametri e gli argomenti devono inoltre essere passati nello stesso ordine.

## Valori di ritorno

La keyword *void* usata negli esempi sopra, indica che il metodo non restituisce dei valori. Se si vuole che li restituisca, si possono utilizzare i tipi di dato primitivi (es: *int, char,* ecc...) al posto di *void*, ed inserire la keyword *return* all'interno del metodo:
```java
public class Main {
  static int myMethod(int x) {
    return 5 + x;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(3));
  }
}
// Outputs 8 (5 + 3)
```

Questo esempio invece restituisce la somma tra due parametri del metodo
```java
public class Main {
  static int myMethod(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(5, 3));
  }
}
// Outputs 8 (5 + 3)
```

È anche possibile salvare il risultato all'interno di una variabile, cosa consigliata in quanto rende il codice più leggibile e facile da mantenere:
```java
public class Main {
  static int myMethod(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    int z = myMethod(5, 3);
    System.out.println(z);
  }
}
// Outputs 8 (5 + 3)
```

## Metodi con if...else

È pratica comune utilizzare i costrutti if...else all'interno dei metodi
```java
public class Main {

  // Create a checkAge() method with an integer variable called age
  static void checkAge(int age) {

    // If age is less than 18, print "access denied"
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");

    // If age is greater than, or equal to, 18, print "access granted"
    } else {
      System.out.println("Access granted - You are old enough!");
    }

  }

  public static void main(String[] args) {
    checkAge(20); // Call the checkAge method and pass along an age of 20
  }
}

// Outputs "Access granted - You are old enough!"
```

## "Sovraccarico" dei metodi (method overloading)

Tramite il method overloading, più metodi possono avere lo stesso nome ma con parametri diversi, ad esempio:
```java
int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)
```

Consideriamo ora un esempio pratico, nel quale utilizziamo due metodi per sommare numeri di tipo diverso (float e int):
```java
static int plusMethodInt(int x, int y) {
  return x + y;
}

static double plusMethodDouble(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethodInt(8, 5);
  double myNum2 = plusMethodDouble(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
```

Piuttosto che definire due metodi diversi, è conveniente fare l'overload di uno, per far si che funzioni con entrambi i tipi di dato:
```java
static int plusMethod(int x, int y) {
  return x + y;
}

static double plusMethod(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethod(8, 5);
  double myNum2 = plusMethod(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
```
**ATTENZIONE**: diversi metodi possono avere lo stesso nome fintanto che il numero e/o il tipo di parametri ricevuti sono diversi.

## Scope delle variabili in Java

In Java, le variabili sono accessibili solo all'interno della regione in cui sono create. Questo è detto **scope**.

### Scope nei metodi

Le variabili dichiarate direttamente all'interno di un metodo sono accessibili ovunque nel metodo, purché siano nelle porzioni di codice successive rispetto a quella dove sono state dichiarate:
```java
public class Main {
  public static void main(String[] args) {

    // Code here CANNOT use x

    int x = 100;

    // Code here can use x
    System.out.println(x);
  
```


## Scope del blocco

Con "blocco di codice" ci si riferisce a del codice racchiuso tra due parentesi graffe { }.  
Tutte le variabili dichiarate all'interno del blocco sono accessibili soltanto al codice contenuto all'interno delle parentesi, purché il codice sia sotto alla porzione dove le variabili sono state inizializzate:
```java
public class Main {
  public static void main(String[] args) {

    // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
      System.out.println(x);

    } // The block ends here

  // Code here CANNOT use x

  }
}
```
**ATTENZIONE**: un blocco di codice potrebbe esistere per conto suo o appartenere ad una condizione *if*, o a dei cicli *while* o *for*. Nel caso dei cicli *for*, le variabili dichiarate all'interno della condizione sono disponibili anche nel blocco di codice al suo interno.


# Ricorsione in Java

La ricorsione è una tecnica che consente ad una funzione di richiamare sé stessa. Questa tecnica offre la possibilità di semplificare dei problemi complicati, scomponendoli in sotto-problemi più piccoli e facili da risolvere.

Un esempio pratico di ricorsione può essere quello di dover sommare tra loro dei numeri compresi in un certo range. Il problema può essere spezzettato in problemi più piccoli, dove si effettua la somma tra numeri a coppie:
```java
public class Main{
	public static void main(String[] args) {
		int result = sum(10);
		System.out.println(result);
	}
	public static int sum(int k) {
	if (k > 0) {
		return k + sum(k - 1);
		} else {
			return 0;} 
	}
}
```
Nell'esempio sopra, quando chiamiamo la funzione *sum()*, essa somma un parametro k alla somma di tutti i numeri minori di *k* e restituisce il risultato. Non appena *k* diventa pari a 0, la funzione restituisce 0. I passi effettuati dal programma sono i seguenti:
*10 + sum(9)*  
*10 + ( 9 + sum(8) )*  
*10 + ( 9 + ( 8 + sum(7) ) )*  
*...*  
*10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)*  
*10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0*  
Poiché la funzione non richiama sé stessa quando *k* è pari a 0, il programma termina l'esecuzione e restituisce il risultato finale.

## Condizioni di stop

Così come nei cicli si possono avere casi dove si cicla all'infinito, nella ricorsione si ha lo stesso potenziale problema di ricorsione infinita, ossia la funzione potrebbe non smettere mai di richiamare sé stessa. Per questo motivo è buona pratica imporre una condizione di stop affinché la funzione smetta di richiamare sé stessa. (nell'esempio sopra il parametro di stop era il check k == 0)  
Un altro esempio potrebbe essere il seguente, dove vengono sommati dei numeri in un range compreso tra due variabili: *end* e *start* che vengono utilizzate per imporre la condizione di halt.
```java
public class Main {
  public static void main(String[] args) {
    int result = sum(5, 10);
    System.out.println(result);
}

public static int sum(int start, int end){
	if (end > start) {
		return end + sum(start, end -1);
		} 
	else {
		return end;
		}
	}
}
```
**ATTENZIONE**: bisogna prestare particolare attenzione quando si usa la ricorsione, è molto facile scrivere involontariamente una funzione che non termina mai o una che utilizza un quantitativo eccessivo di memoria e potere computazionale. Tuttavia, se scritta correttamente, una funzione ricorsiva può essere molto efficiente ed un modo matematicamente elegante di risolvere un problema.


# Classi in Java

## Programmazione ad Oggetti (OOP)

**OOP** sta per **Object-Oriented Programming** (programmazione orientata agli oggetti).  
Mentre nella programmazione procedurale si scrivono procedure o metodi che effettuano operazioni sui dati, nella programmazione orientata agli oggetti si creano appositi "oggetti" che contengono sia dati che metodi.  
La programmazione ad oggetti porta con sé alcuni vantaggi rispetto alla programmazione procedurale, ad esempio:
- è più veloce e facile da eseguire
- fornisce strutture chiare per il programma
- aiuta a rispettare il principio DRY (Don't Repeat Yourself), rendendo il codice più facile da mantenere, modificare o debuggare
- rende possibile creare intere applicazioni riutilizzabili, con meno codice e un tempo di sviluppo ridotto

Riguardo al principio **DRY**: la sua utilità è quella di ridurre le ripetizioni del codice, inserendolo in un singolo posto che ne consente il riutilizzo senza la ripetizione.

### Classi ed Oggetti

Classi ed Oggetti sono i due principali aspetti della programmazione ad oggetti. Un semplice esempio di ciascuno può essere:
- **Classe**
	1. Frutta
	2. Automobile
- Oggetto
	1. Mela, Banana, Mango
	2. Volvo, Audi, Toyota

In sostanza, una classe è un template per oggetti, mentre un oggetto è l'istanza di una classe. Quando un nuovo oggetto viene creato, eredita tutte le variabili e i metodi della classe.

### Creazione di una classe

Per creare una classe si utilizza la keyword *class*:
```java
public class Main {
  int x = 5;
}
```
Nell'esempio sopra abbiamo creato una classe di nome "Main" che contiene al suo interno la variabile x.  

**ATTENZIONE**: la sintassi di Java impone che il nome di una classe inizi sempre con la prima lettera maiuscola. Per nomi composti si segue la regola stilistica del camel-case. Il nome del file .java associato deve corrispondere a quello della classe.

### Creazione di un oggetto

In Java, un oggetto è creato a partire da una classe. Riprendendo l'esempio di sopra, possiamo creare un oggetto di Main, specificando il nome della classe seguito dal nome dell'oggetto, preceduto dalla keyword *new*:
```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```
In questo codice d'esempio viene creato un oggetto di nome "myObj" che stampa il valore di x.


### Creazione di più oggetti

È possibile creare più oggetti di una classe, ad esempio:
```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main();  // Object 1
    Main myObj2 = new Main();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}
```
In questo caso abbiamo creato due oggetti di *Main*.


### Usare più classi

È possibile creare l'oggetto di una classe ed accedervi da un'altra classe. Questa tecnica si usa spesso per organizzare meglio le classi, ad esempio suddividendole in una che contenga tutti gli attributi e metodi ed un'altra che contenga soltanto il metodo *main()*, con tutto il codice da eseguire.  
Ad esempio, supponiamo di creare due file nella nostra cartella di lavoro:
- Main.java
- Second.java
Il primo conterrà questo codice:
```java
public class Main {
  int x = 5;
}
```
Il secondo invece:
```java
class Second {
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```
Si va poi a compilare entrambi i file:  
`C:\Users\_Your Name_>javac Main.java`  
`C:\Users\_Your Name_>javac Second.java`  
E ad eseguire Second  
`C:\Users\_Your Name_>java Second`  
Il cui risultato in output sarà 5.  

## Attributi di classe

Negli esempi precedenti abbiamo usato il termine "variabile" quando ci riferivamo ad *x*, tuttavia nel caso delle classi, si tratta di un **attributo**. Più in generale, una variabile all'interno di una classe è detta **attributo** o **campo**.
Ad esempio:
```java
public class Main {
  int x = 5;
  int y = 3;
}
```
Nel codice d'esempio, x ed y sono attributi della classe *Main*.

### Accesso agli attributi

È possibile accedere agli attributi creando l'oggetto di una classe e poi utilizzando la sintassi col punto ( . ).

Nell'esempio seguente andremo a creare un oggetto della classe *Main* con nome *myObj*. Useremo l'attributo *x* dell'oggetto per stamparne il valore:
```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```

### Modifica degli attributi

È anche possibile modificare gli attributi:
```java
public class Main {
  int x;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}
```
In questo esempio abbiamo impostato il valore di x pari a 40

È anche possibile sovrascrivere valori già esistenti:
```java
public class Main {
  int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
  }
}
```
In questo caso il valore di x è stato cambiato da 10 a 25

Per impedire la sovrascrittura del valore di un attributo, è possibile renderlo immutabile tramite la keyword *final*:
```java
public class Main {
  final int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
```
La keyword *final* è detta "modificatore" e risulta particolarmente utile quando si vuole avere una variabile che conservi sempre lo stesso valore. (es: una costante matematica)


### Oggetti multipli e modifica degli attributi

Se si creano diversi oggetti di una stessa classe è possibile cambiare il valore dell'attributo di un determinato oggetto senza influenzare gli attributi contenuti negli altri.  
Ad esempio, dichiariamo due oggetti della classe *Main* di nome *myObj1* e *myObj2* e cambiamo il valore dell'attributo di x di *myObj2*:
```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main();  // Object 1
    Main myObj2 = new Main();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}
```
Il valore dell'attributo x di myObj2 è stato alterato, lasciando invariato quello del corrispettivo di myObj1. 


### Oggetti con attributi multipli

È possibile specificare quanti attributi si vuole all'interno di un oggetto:
```java
public class Main {
  String fname = "John";
  String lname = "Doe";
  int age = 24;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
}
```


## Metodi di classe

Come già visto in precedenza, i metodi vengono dichiarati all'interno di una classe e consentono di effettuare certe azioni, ad esempio:
```java
public class Main {
  static void myMethod() {
    System.out.println("Hello World!");
  }
}
```
In questo caso *myMethod()* consente di stampare del testo ogni volta che viene chiamato. La sintassi per richiamare un metodo è quella di dichiarare il nome del metodo seguito da parentesi tonde ( ) e punto e virgola ( ; )

### Static vs Public

Le keyword *static* e *public* sono dei modificatori che si usano in java, quando si dichiara un metodo di tipo *static* esso può essere acceduto anche senza creare un oggetto della classe che lo contiene, mentre nel caso di *public* è necessario in quanto può essere acceduto solo dall'oggetto.  
Nell'esempio seguente viene mostrata la differenza tra i due modificatori:
```java
public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method on the object
  }
}
```

### Accesso ai metodi tramite un oggetto

Un esempio pratico può essere il seguente, dove creiamo un oggetto di nome *myCar*. Chiameremo poi i metodi *fulThrottle()* e *speed()* sull'oggetto *myCar* ed eseguiremo il programma:
```java
// Create a Main class
public class Main {
 
  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Main myCar = new Main();   // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}

// The car is going as fast as it can!
// Max speed is: 200
```
In questo esempio quindi:
1. Creiamo una classe custom *Main* con la keyword *class*
2. Creiamo i metodi *fullThrottle()* e *speed()* all'interno della classe *Main*
3. I due metodi creati mandano in stampa del testo quando chiamati
4. Il metodo *speed()* accetta un parametro intero, chiamato *maxSpeed*
5. Affinché si possa usare la classe *Main* e i suoi rispettivi metodi è necessario creare un oggetto della classe
6. Si va poi nel metodo *main()*
7. Si istanzia un nuovo oggetto *myCar* tramite la keyword *new*
8. Infine si richiamano i metodi *fullThrottle()* e *speed()* nell'oggetto *myCar*. Si esegue il programma utilizzando il nome dell'oggetto, seguito da un punto e dal nome del metodo. Nel caso del metodo *speed()* gli si passa anche il parametro "200".

### Usare più classi

Come visto in precedenza, è buona pratica creare l'oggetto di una classe ed accedervi da un'altra classe. Riprendendo l'esempio di sopra, supponiamo di creare due file nella nostra cartella di lavoro:
- Main.java
- Second.java

Il primo file conterrà il seguente codice:
```java
public class Main {
  public void fullThrottle() {
    System.out.println("`The car is going as fast as it can!`");
  }

  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }
}
```
Mentre il secondo:
```java
class Second {
  public static void main(String[] args) {
    Main myCar = new Main();     // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}
```
Una volta compilati entrambi i file e mandato in esecuzione il secondo, l'output a video sarà:
`The car is going as fast as it can!
`Max speed is: 200


## Costruttori

In Java, un costruttore è un metodo speciale utilizzato per inizializzare gli oggetti; viene chiamato quando viene creato un oggetto da una classe e può essere utilizzato per inizializzare i valori degli attributi dell'oggetto.
```java
// Create a Main class
public class Main {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public Main() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5
```
**ATTENZIONE**: il nome di un costruttore deve corrispondere al nome della classe e non può avere un tipo di ritorno. Un costruttore viene richiamato non appena viene creato l'oggetto. Tutte le classi hanno dei costruttori predefiniti che vengono creati automaticamente da Java nel caso il programmatore non ne crei di espliciti, tuttavia in questo caso non sarà possibile impostare dei valori iniziali o predefiniti per gli attributi dell'oggetto.

### Parametri dei costruttori

I costruttori possono prendere dei parametri, tramite i quali vengono utilizzati per inizializzare gli attributi.
Nell'esempio seguente, viene aggiunto un parametro *int y* al costruttore, al cui interno viene dichiarato che l'argomento x prende il valore di y (x = y). Una volta che viene chiamato il costruttore, gli si passa il parametro 5, che verrà assegnato ad x:
```java
public class Main {
  int x;

  public Main(int y) {
    x = y;
  }

  public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println(myObj.x);
  }
}

// Outputs 5
```
Si possono passare anche più parametri, come nel prossimo esempio:
```java
public class Main {
  int modelYear;
  String modelName;

  public Main(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Main myCar = new Main(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

// Outputs 1969 Mustang
```

## Modificatori

I modificatori sono particolari keyword che cambiano le proprietà di class, attributi, metodi e costruttori. Si dividono in due gruppi:
- **Access Modifiers**
	- controllano il livello d'accesso
- **Non-Access Modifiers**
	- non controllano il livello d'accesso, ma forniscono altre funzionalità

### Access Modifiers

#### Classi

Per gli access modifiers delle classi si utilizzano i modificatori *public* o *default*

- **public**
	- la classe è accessibile da qualsiasi altra classe
- **default**
	- la classe è accessibile solo da altre classi nello stesso package; viene automaticamente utilizzato quando non è specificato un modificatore

#### Attributi, metodi e costruttori

Per attributi, metodi e costruttori, è possibile utilizzare i seguenti modificatori:
- **public**
	- il codice è accessibile a tutte le classi
- **private**
	- il codice è accessibile solo all'interno della classe dichiarata
- **default**
	- il codice è accessibile nello stesso package; viene automaticamente utilizzato quando non è specificato un modificatore
- **protected**
	- il codice è accessibile nello stesso package e sottoclassi


### Non-Access Modifiers

#### Classi

Per le classi è possibile utilizzare *final* o *abstract*:
- **final**
	- la classe non può essere ereditata da altre classi
- **abstract**
	- la classe non può essere usata per creare oggetti; affinché si possa accedere ad una classe astratta, è necessario ereditarla da un'altra classe

#### Attributi e metodi

Per gli attributi e i metodi è possibile utilizzare:
- **final**
	- attributi e metodi non possono essere sovrascritti o modificati
- **static**
	- attributi e metodi appartengono alla classe piuttosto che all'oggetto
- **abstract**
	- può essere utilizzato solo in una classe astratta, riferito ai suoi metodi; in questo caso il metodo non ha un corpo, che viene fornito invece dalla sottoclasse da cui eredita
- **transient**
	- attributi e metodi sono saltati quando viene serializzato l'oggetto che li contiene
- **synchronized**
	- i metodi possono essere acceduti da un thread alla volta
- **volatile**
	- il valore degli attributi non è messo in cache, ma viene sempre letto dalla memoria principale


### Esempi pratici

#### Final

Se si vuole impedire di sovrascrivere i valori degli attributi già esistenti, è possibile dichiararli come *final*
```java
public class Main {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 50; // will generate an error: cannot assign a value to a final variable
    myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
```


#### Static

Un metodo *static* consente che l'accesso senza la creazione di un oggetto della classe, al contrario di *public*. Un esempio di entrambi è il seguente:
```java
public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[ ] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would output an error

    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method
  }
}
```


#### Abstract

Un metodo *abstract* può appartenere solo ad una corrispettiva classe *abstract* e non ha un corpo, il quale viene fornito dalla sottoclasse:
```java
// Code from filename: Main.java
// abstract classabstract class Main {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
// End code from filename: Main.java

// Code from filename: Second.java
class Second {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Main)
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method  }
}
```


## Incapsulamento

Lo scopo dell'incapsulamento è quello di far si che dati potenzialmente "sensibili" siano nascosti all'utente finale. Per fare ciò è necessario:
- dichiarare variabili e attributi di classe come *private*
- fornire metodi pubblici **get** e **set** per l'accesso e l'aggiornamento delle variabili *private*

### Get e Set

Come visto in precedenza, le variabili di tipo *private* possono essere accedute solo dall'interno della classe in cui sono dichiarate, pertanto una classe esterna non può accedervi; tuttavia è possibile accedervi a patto di fornire i metodi pubblici *get* e *set*:
- **get** restituisce il valore della variabile
- **set** consente di impostare il valore della variabile

La sintassi per entrambi i casi prevede che si inizi con get* o *set*, seguiti dal nome della variabile con la prima lettera maiuscola. Ad esempio:
```java
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}
```
In questo caso il metodo *get* restituisce il valore della variabile *name*, mentre il metodo *set* prende un parametro (*newName*) e lo assegna alla variabile *name*. La keyword *this* viene utilizzata per riferirsi all'oggetto corrente. Tuttavia, essendo *name* dichiarato come *private* non è possibile accedervi al di fuori di questa classe.

Prendiamo ora un altro esempio:
```java
public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.name = "John";  // error
    System.out.println(myObj.name); // error 
  }
}
```
Nel caso la variabile fosse stata dichiarata come public, ci si aspetterebbe il seguente output:
`John`
Tuttavia, nel provare ad accedere ad una variabile *private* otteniamo degli errori:
`MyClass.java:4: error: name has private access in Person`
    `myObj.name = "John";`
             `^`
`MyClass.java:5: error: name has private access in Person`
    `System.out.println(myObj.name);`
			 `^`
`2 errors`

Se invece ci avvaliamo dei metodi *getName()* e *setName()* per accedere ed aggiornare la variabile:
```java
public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
}

// Outputs "John"
```
Avremo quindi in output "John", come volevamo.

Ci si potrebbe chiedere perché utilizzare l'incapsulamento, ci sono diverse ragioni:
- Migliore controllo di attributi e metodi di classe
- Gli attributi di classe possono essere resi di sola lettura (tramite la *get*) o di sola scrittura (tramite la *set*)
- Flessibilità, in quanto il programmatore può cambiare una parte del codice senza influenzare le altre
- Maggiore sicurezza dei dati

## Packages ed API

In Java, un package è utilizzato per raggruppare più classi correlate tra loro. I packages vengono utilizzati per evitare conflitti tra nomi e scrivere del codice più facilmente mantenibile; si dividono in due categorie:
- **Built-in Packages**
	- si tratta dei pacchetti predefiniti ed preesistenti nelle API di Java
- **User-defined Packages**
	- si tratta dei pacchetti creati appositamente dai programmatori

### Built-in Packages

L'API di Java è una libreria di classi pre-scritte e liberamente utilizzabili contenute all'interno del JDK. La libreria contiene svariati componenti utili a diversi compiti, tra cui gestione dell'input, interfacciamento con basi di dati e tanto altro. (per la lista completa delle funzionalità fare riferimento alla documentazione ufficiale di Oracle).  
La libreria è suddivisa in **packages** e **classes**, ciò consente di importare una singola classe (assieme ai relativi metodi ed attributi) o un intero package e tutte le classi che esso contiene. Il vantaggio di questa modularità è quello di poter alleggerire il programma andando ad importare solo determinate classi necessarie al suo funzionamento piuttosto che un intero package.  
Per poter utilizzare una classe o un package dalla libreria, è necessario importarlo utilizzando la keyword *import*:  
```java
import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package
```

#### Import di una classe

Supponiamo di voler utilizzare una classe specifica, in questo caso *Scanner*, per l'acquisizione dell'input dell'utente da tastiera, la sintassi sarebbe la seguente:
```java
import java.util.Scanner;
```
In questo caso *java.util* è il package, mentre *Scanner* è una classe appartenente al package. Per poter utilizzare la classe *Scanner* appena importata è necessario creare un oggetto della classe e poi usare uno dei metodi contenuti al suo interno. Nell'esempio seguente verrà usato *nextLine()* in modo da leggere un'intera riga:
```java
import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}
```

#### Import di un package

Per importare un intero pacchetto piuttosto che una classe specifica appartenente ad esso si termina la sua dichiarazione con il simbolo asterisco ( \* ). Nell'esempio seguente, verranno importate tutte le classi appartenenti al package *java.util*:
```java
import java.util.*;
```

### User-defined Packages

Per creare un proprio package è importante capire che Java utilizza una cartella del file system per il loro salvataggio; ad esempio:
└── root
  └── mypack
    └── MyPackageClass.java

Per creare un package si utilizza la keyword *package*:
```java
package mypack;
class MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}
```

Il file viene poi salvato come *MyPackageClass.java* che dovrà essere compilato tramite javac:
`C:\Users\_Your Name_>javac MyPackageClass.java`
E nuovamente compilato come package col flag -d
`C:\Users\_Your Name_>javac -d . MyPackageClass.java`

Questo forza il compilatore a creare il package "*mypack*"

**ATTENZIONE**: il flag di compilazione -d specifica la destinazione di salvataggio per il file .class. È possibile specificare un percorso per la cartella di salvataggio, tuttavia si è soliti utilizzare il simbolo di punto ( . ) per salvare all'interno della stessa cartella, come nell'esempio sopra.

Una volta compilato il package dell'esempio sopra, verrà creata una nuova cartella chiamata *"mypack"*. Per eseguire il file *MyPackageClass.java* sarà necessario scrivere:
`C:\Users\_Your Name_>java mypack.MyPackageClass`
Il cui output sarà:
`This is my package!`


## Ereditarietà

In Java è possibile far ereditare metodi ed attributi ad una classe a partire da un'altra. Il concetto di ereditarietà si divide in due categorie:
- **sottoclassi (figli)**
	- le classi che ereditano da un'altra classe
- **superclassi (genitori)**
	- le classi da cui si ereditano metodi ed attributi

Per ereditare da una classe si utilizza la keyword *extends*.
Facciamo un esempio pratico:
```java
class Vehicle {
  protected String brand = "Ford";        // Vehicle attribute
  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // Car attribute
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
```
In questo esempio, la classe *Car* (sottoclasse) eredita attributi e metodi dalla classe *Vehicle* (Superclasse).  
**ATTENZIONE**: in questo caso è stato impostato l'access modifier *protected* all'attributo *brand* della superclasse *Vehicle*. Questo perché se fosse stato *private*, la sottoclasse *Car* non sarebbe stata in grado di accedervi.

Perché utilizzare l'ereditarietà? Perché agevola la riusabilità del codice, in quanto consente di riutilizzare attributi e metodi di una classe esistente quando se ne crea una nuova.

### La keyword final

Se non si vuole che una classe sia ereditabile, si utilizza la keyword *final*:
```java
final class Vehicle {
  ...
}

class Car extends Vehicle {
  ...
}
```
In questo caso, se si provasse ad accedere alla classe creata col modificatore *final*, si avrebbe il seguente errore:
`Main.java:9: error: cannot inherit from final Vehicle`
`class Main extends Vehicle {`
		                  `^`
  `1 error)`


## Polimorfismo

Il polimorfismo è una caratteristica che consente di avere più classi correlate tra loro tramite l'ereditarietà. Ciò consente di effettuare una singola azione in modi differenti.  
Ad esempio, supponiamo di avere una superclasse *Animal* che possiede un metodo *animalSound()*. Alcuni esempi di sue sottoclassi potrebbero essere Maiale, Gatto, Cane, Uccello, ciascuno dei quali possiede una propria implementazione del suono che produce.
```java
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
```
Tramite la keyword *extends* facciamo ereditare i metodi della superclasse *Animal* a *Dog* e *Pig*.

Ora è possibile creare degli oggetti *Pig* e *Dog* e chiamare il metodo *animalSound()* su entrambi:
```java
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}
```

L'ereditarietà ed il polimorfismo risultano utili per riutilizzare parti di codice, in quanto consentono il riutilizzo di attributi e metodi di una classe esistente quando se ne crea una nuova.


## Classi innestate

In Java è possibile innestare le classi (una classe dentro un'altra classe); l'utilità dell'innestare le classi è quella di poterle raggruppare assieme, rendendo il codice più leggibile e mantenibile.  
Per accedere alla classe interna è necessario creare un oggetto della classe esterna e poi creare un oggetto della classe interna:
```java
class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}

// Outputs 15 (5 + 10)
```

### Classe interna privata

Al contrario di una classe normale, una classe interna può essere *private* o *protected*. Se si vuole impedire l'accesso alla classe interna da parte di oggetti esterni, è necessario dichiararla come *private*.
```java
class OuterClass {
  int x = 10;

  private class InnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}
```
Provare ad accedere alla classe interna restituirà l'errore:  
`error: OuterClass.InnerClass has private access in OuterClass`  

### Classe interna statica

Una classe interna può anche essere dichiarata come *static*, ciò significa che le si potrà accedere senza dover creare un oggetto della classe esterna:
```java
class OuterClass {
  int x = 10;

  static class InnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass.InnerClass myInner = new OuterClass.InnerClass();
    System.out.println(myInner.y);
  }
}

// Outputs 5
```
**ATTENZIONE**: così come gli attributi e i metodi dichiarati come *static*, una classe interna dichiarata allo stesso modo non ha accesso ai membri della classe esterna.

### Accesso alla classe esterna dalla classe interna

Un vantaggio della classe interna è che può accedere ad attributi e metodi della classe esterna:
```java
class OuterClass {
  int x = 10;

  class InnerClass {
    public int myInnerMethod() {
      return x;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.myInnerMethod());
  }
}

// Outputs 10
```


## Astrazione

L'**astrazione** dei dati è un processo che consiste nel nascondere certi dettagli e mostrare solo le informazioni necessarie all'utente. Si può arrivare all'astrazione tramite l'uso di **classi astratte** o **interfacce**.  
La keyword *abstract* è un non-access modifier, utilizzato per classi e metodi:
- **abstract class**
	- si tratta di una classe con restrizioni che non può essere usata per creare oggetti; per accedervi, deve essere ereditata da un'altra classe
- **abstract method**
	- si tratta di un metodo utilizzabile solo all'interno di una *abstract class*.

Una classe astratta può avere sia metodi normali che astratti:
```java
abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}
```
In questo esempio, non è possibile creare oggetti della classe *Animal*.  
Per poter accedere alla classe è necessario che essa venga ereditata da un'altra classe:
```java
// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```
L'utilità di classi e metodi astratti è quella di garantire la sicurezza, in quanto si nascondono dettagli importanti dell'oggetto in questione.

## Interfacce

Un'interfaccia (keyword: *interface*) è una classe "completamente astratta" che viene utilizzata per raggruppare metodi correlati tra loro e senza corpo:
```java
// interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void run(); // interface method (does not have a body)
}
```

Per accedere ai metodi dell'interfaccia, essa deve essere "implementata" (simile all'ereditarietà) da un'altra classe, tramite la keyword *implement*.  
Il corpo del metodo dell'interfaccia è fornito dalla classe che la implementa:
```java
// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

**NOTE SULLE INTERFACCE**:
- Così come le classi astratte, le interfacce non possono essere utilizzate per creare oggetti
- I metodi delle interfacce non hanno un corpo, il quale però viene fornito dalla classe che le implementa
- All'implementazione di un'interfaccia è necessario sovrascrivere tutti i suoi metodi
- I metodi delle interfacce sono di default *abstract* e *public*
- Gli attributi delle interfacce sono di default *public, static* e *final*.
- Un'interfaccia non può contenere un costruttore, poiché non può essere usata per creare oggetti

I motivi per cui si utilizzano le interfacce sono fondamentalmente due:
- Per ottenere sicurezza, nascondendo alcuni dettagli e mostrando solo informazioni rilevanti di un oggetto
- Per ottenere una forma di ereditarietà multipla, la quale non è supportata nativamente in Java (una classe può ereditare solo da una superclasse). Tramite l'implementazione di più interfacce è tuttavia possibile ottenere un surrogato dell'ereditarietà multipla.

### Interfacce multiple

Per implementare più interfacce, è necessario separarle con una virgola ( , ):
```java
interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

class Main {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}
```

## Enumerazioni (Enums)

Un'enumerazione (keyword *enum*) è un tipo speciale di classe che rappresenta un gruppo di costanti (variabili immutabili, come se dichiarate *final*).  
Per creare un'enumerazione si utilizza la keyword *enum* e si separano le costanti con una virgola. È importante che le costanti siano con i nomi in maiuscolo:
```java
enum Level {
  LOW,
  MEDIUM,
  HIGH
}
```

È possibile accedere alle costanti di un'enumerazione tramite l'operatore punto ( . ):  
`Level myVar = Level.MEDIUM`

### Enumerazioni all'interno di una classe

È possibile avere un'enumerazione all'interno di una classe:
```java
public class Main {
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) {
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar);
  }
}
```

L'output sarà:  
`MEDIUM`


### Enumerazioni in uno Switch

Solitamente si utilizzano le enumerazioni all'interno degli switch per verificare i valori corrispondenti:
```java
enum Level {
  LOW,
  MEDIUM,
  HIGH
}

public class Main {
  public static void main(String[] args) {
    Level myVar = Level.MEDIUM;

    switch(myVar) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
         System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
    }
  }
}
```

L'output sarà:  
`Medium level`


### Ciclare all'interno di un'enumerazione

L'enumerazione ha un metodo *values()* che restituisce un array contenente tutte le costanti all'interno dell'enumerazione. Questo metodo è particolarmente utile quando si vuole ciclare gli elementi contenuti nell'enumerazione:
```java
for (Level myVar : Level.values()) {
  System.out.println(myVar);
}
```

L'output sarà:  
`LOW`  
`MEDIUM`  
`HIGH`  

### Differenze tra enumerazioni e classi

Un'enumerazione può avere attributi e metodi come una classe, tuttavia le costanti di un'enumerazione sono *public, static* e *final*, non possono essere quindi sovrascritte.  
Una enumerazione non può essere usata per creare oggetti e non può estendere altre classi, tuttavia può implementare interfacce.  

Le enumerazioni si utilizzano quando si hanno valori che si sa a priori non dovranno cambiare.


## Input dell'utente (Scanner)

La classe *Scanner* è utilizzata per ricevere l'input dell'utente ed è inclusa nel package *java.util*.  
Per poter usare la classe *Scanner* è necessario prima creare un oggetto della classe, dopo di che si potrà usare qualsiasi metodo disponibile. Nell'esempio seguente verrà usato il metodo *nextLine()*, il quale può acquisire stringhe:
```java
import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}
```

### Tipi di input

Nell'esempio sopra è stato utilizzato il metodo *nextLine()* che consente l'acquisizione di stringhe. Per l'acquisizione di altri tipi di dato esistono:
- **nextBoolean()**
- **nextByte()**
- **nextDouble()**
- **nextFloat()**
- **nextInt()**
- **nextLine()**
- **nextLong()**
- **nextShort()**

Inserendo un tipo errato o inaspettato di input (es: una stringa quando si aspetta un intero) verrà lanciata un'eccezione a runtime.


## Data ed Ora

Java non possiede una classe apposita per la data, tuttavia è possibile importare il package *java.time* per poter lavorare con le API per data ed ora.  
Il package contiene diverse classi per rappresentare data ed ora, ad esempio:
- **LocalDate**
- **LocalTime**
- **LocalDateTime**
- **DateTimeFormatter**

### Mostrare la data corrente

Per mostrare la data corrente è necessario importare la classe *java.time.LocalDate* e utilizzare il metodo *now()*:
```java
import java.time.LocalDate; // import the LocalDate class

public class Main {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println(myObj); // Display the current date
  }
}
```

L'output sarà nella forma ANNO-MESE-GIORNO

### Mostrare l'orario corrente

Per mostrare l'orario corrente è necessario importare la classe *java.time.LocalTime* e utilizzare il metodo *now()*:
```java
import java.time.LocalTime; // import the LocalTime class

public class Main {
  public static void main(String[] args) {
    LocalTime myObj = LocalTime.now();
    System.out.println(myObj);
  }
}
```

L'output sarà nella forma: ORE:MINUTI:SECONDI.NANOSECONDI

### Mostrare data ed ora correnti

Per mostrare entrambi i dati è necessario importare la classe *java.time.LocalDateTime* e utilizzare il metodo *now()*:
```java
import java.time.LocalDateTime; // import the LocalDateTime class

public class Main {
  public static void main(String[] args) {
    LocalDateTime myObj = LocalDateTime.now();
    System.out.println(myObj);
  }
}
```

L'output sarà nella forma: ANNO-MESE-GIORNOTORE:MINUTI:SECONDI.NANOSECONDI

#### Formattazione di data ed ora

La "T" nell'output citato sopra è utilizzata per separare la data dall'ora. È possibile utilizzare la classe *DateTimeFormatter* con il metodo *ofPattern()* per poter formattare oggetti di tipo data-ora. Nell'esempio seguente andremo sia a rimuovere il separatore "T" che i nanosecondi dall'orario:
```java
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Main {
  public static void main(String[] args) {
    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}
```

L'output sarà:  
`Before Formatting: 2024-03-08T11:15:22.505435`  
`After Formatting: 08-03-2024 11:15:22`  

Il metodo *ofPattern()* accetta valori di qualsiasi tipo, consentendo di mostrare data ed ora in diversi formati.


## ArrayList

La classe *ArrayList* corrisponde ad un array ridimensionabile e si trova nel package *java.util*. La differenza tra un array normale ed un'arraylist sta nel fatto che la dimensione del primo non può essere modificata, mentre nel secondo si possono inserire e rimuovere elementi a piacimento in quanto la sua dimensione viene modificata dinamicamente. La loro sintassi ed i metodi applicabili sono inoltre differenti:

```java
import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
```
In questo esempio abbiamo appena creato un oggetto ArrayList di stringhe di nome cars.

### Aggiunta di elementi

La classe ArrayList possiede diversi metodi utili, ad esempio per l'aggiunta di nuovi elementi si utilizza il metodo *add()*.
Ad esempio:
```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```
Nell'esempio sopra abbiamo aggiunto all'ArrayList cars alcuni elementi.

### Accesso agli elementi

Per accedere agli elementi di una ArrayList si utilizza il metodo *get()* in combinazione con l'indice posizionale dell'elemento a cui vogliamo accedere:
```java
cars.get(0);
```
**ATTENZIONE**: è opportuno ricordare che gli elementi di un array iniziano dall'elemento 0, \[0] è pertanto il primo elemento, \[1] il secondo e così via.

### Modificare un elemento

Per modificare un elemento si utilizza il metodo *set()* in combinazione con l'indice posizionale dell'elemento che si vuole modificare:
```java
cars.set(0, "Opel");
```

### Rimozione di un elemento

Per la rimozione di un elemento si utilizza il metodo *remove()* in combinazione con l'indice posizionale dell'elemento che si vuole rimuovere:
```java
cars.remove(0);
```

È inoltre possibile rimuovere tutti gli elementi di un ArrayList tramite il metodo *clear()*:
```java
cars.clear();
```
 
### Dimensione di un'ArrayList

Per sapere quanti elementi sono all'interno di un'ArrayList è possibile utilizzare il metodo *size()*:
```java
cars.size();
```

### Ciclare gli elementi di un'ArrayList

È possibile ciclare attraverso gli elementi di un'ArrayList tramite un ciclo for in combinazione con il metodo size() in modo da specificare quante volte è necessario eseguire il ciclo:
```java
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
  }
}
```

In alternativa è possibile utilizzare un ciclo for-each:
```java
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
```

### Altri tipi

Gli elementi all'interno di un'ArrayList sono degli oggetti. Negli esempi trattati sopra sono stati creati elementi di tipo stringa, ma come detto più volte in Java il tipo stringa non è primitivo, ma è un oggetto.
Per utilizzare altri tipi, è necessario specificare l'equivalente "wrapper class", ad esempio *Integer* per i tipi interi, *Boolean* per i tipi booleani e così via.
Un esempio, col tipo int/Integer può essere il seguente:
```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}
```

### Ordinamento di un'ArrayList

Un altra classe parecchio utile inclusa nel package java.util è *Collections* la quale include il metodo *sort()* che consente di ordinare alfabeticamente o numericamente una lista.
Ad esempio, se volessimo ordinare un'ArrayList di stringhe:
```java
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Collections.sort(cars);  // Sort cars
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
```

O un'ArrayList di interi:
```java
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);

    Collections.sort(myNumbers);  // Sort myNumbers

    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}

```

## Liste concatenate (LinkedList)