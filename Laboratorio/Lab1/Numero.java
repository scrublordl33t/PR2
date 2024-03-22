class Numero{

    int n;
    
    public Numero(int n){
        this.n = n;
    }


    int somma(Numero num){

        return this.n + num.n;
    } 

    int valore(){
        return this.n;
    }

    void aggiungi(Numero num){

        this.n += num.n;
    }

    public static void main(String[] args){

        Numero n1 = new Numero(5);
        Numero n2 = new Numero(4);

        n2 = n1;
        Numero n3 = new Numero(6);
        n1.aggiungi(n3);
        System.out.println(n2.valore());
    }

}