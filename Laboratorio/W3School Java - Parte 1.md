# Tutorial Java - Introduzione a Java

## Primi passi - Hello World

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


# Tipi di dato

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


# Casting del tipo

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

### Variabili di tipo stringa

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

### Concatenazione di stringhe

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

### Numeri e Stringhe in Java

Come visto sopra, è possibile utilizzate l'operatore aritmetico di addizione (+) sia per l'operazione di addizione che per l'operazione di concatenazione. Nel caso di due variabili numeriche verrà restituita la somma dei loro valori, nel caso di due stringhe verrà restituita la loro concatenazione.  
Nel caso invece di un numero e una stringa, verrà comunque eseguita una concatenazione, come nell'esempio seguente:
```java
String x = "10";
int y = 20;
String z = x + y;  // z will be 1020 (a String)
```


### Stringhe - caratteri speciali

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

# Java Math

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

### if...else

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

### Operatore ternario

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

### Switch

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

# Cicli While

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

### Cicli Do/While

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

# Cicli For

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

# Break e Continue

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
