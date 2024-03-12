import java.util.ArrayList;

class Autonoleggio{
    private ArrayList<Auto> listaAuto = new ArrayList<Auto>();

    public void aggiungiAuto(Auto auto){
            if(auto.getDisponibilita() == true){
                    listaAuto.add(auto);
            }
    }

    public void stampaLista(){
        for(int i = 0; i < listaAuto.size(); i++){
            System.out.println(listaAuto.get(i).getModello());
            System.out.println(listaAuto.get(i).getMarca());
            System.out.println(listaAuto.get(i).getCostoAlGiorno());
            System.out.println("");
        }
    }


    public static void main(String[] args){
        Auto auto1, auto2, auto3, auto4;
        Autonoleggio autonoleggio = new Autonoleggio();

        auto1 = new Auto("Punto", "Fiat", 30.50, true);
        auto2 = new Auto("MX5", "Mazda", 50.69, true);
        auto3 = new Auto("Mito", "Alfa", 42.69, false);
        auto4 = new Auto("Panda", "Fiat", 15.30, true);

        autonoleggio.aggiungiAuto(auto1);
        autonoleggio.aggiungiAuto(auto2);
        autonoleggio.aggiungiAuto(auto3);
        autonoleggio.aggiungiAuto(auto4);
        autonoleggio.stampaLista();
    }
}