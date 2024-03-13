# Tutorial Java - Metodi

Il contenuto di questo file riprende i tutorial di [W3School](https://www.w3schools.com/java/default.asp) per il linguaggio Java, a cui sono state integrate nozioni dal libro di testo e dalle slides fornite a lezione.

## I metodi nel linguaggio Java
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

