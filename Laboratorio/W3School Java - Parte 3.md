# Tutorial Java - Classi

Il contenuto di questo file riprende i tutorial di [W3School](https://www.w3schools.com/java/default.asp) per il linguaggio Java, a cui sono state integrate nozioni dal libro di testo e dalle slides fornite a lezione.

## Programmazione ad Oggetti (OOP)

**OOP** sta per **Object-Oriented Programming** (programmazione orientata agli oggetti).  
Mentre nella programmazione procedurale si scrivono procedure o metodi che effettuano operazioni sui dati, nella programmazione orientata agli oggetti si creano appositi "oggetti" che contengono sia dati che metodi.  
La programmazione ad oggetti porta con sé alcuni vantaggi rispetto alla programmazione procedurale, ad esempio:
- è più veloce e facile da eseguire
- fornisce strutture chiare per il programma
- aiuta a rispettare il principio DRY (Don't Repeat Yourself), rendendo il codice più facile da mantenere, modificare o debuggare
- rende possibile creare intere applicazioni riutilizzabili, con meno codice e un tempo di sviluppo ridotto

Riguardo al principio **DRY**: la sua utilità è quella di ridurre le ripetizioni del codice, inserendolo in un singolo posto che ne consente il riutilizzo senza la ripetizione.

## Classi ed Oggetti

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