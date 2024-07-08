package datastructures;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Liste {

    public static void main(String[] args) {

        ArrayList<String> listaDeStudenti = new ArrayList<>();
        listaDeStudenti.add("Raluca");//index=0
        listaDeStudenti.add("David");//index=1
        listaDeStudenti.add("Mihail");//index=2

        System.out.println(listaDeStudenti.get(0));
        System.out.println(listaDeStudenti.get(2));
        listaDeStudenti.remove(0);
        System.out.println(listaDeStudenti.get(0));

        listaDeStudenti.set(1, "Cata");
        System.out.println(listaDeStudenti.contains("Mihail"));

        System.out.println(listaDeStudenti.indexOf("Cata"));

        //System.out.println(listaDeStudenti);
        //sau se poate si cu "FOR"
        for (String studenti : listaDeStudenti) {
            System.out.println(studenti + " a trecut examenul de Testare");
        }
        ArrayList<Integer> numere = new ArrayList<>();
        ArrayList<Boolean> valori = new ArrayList<>();

        ArrayList<String> cursuriIT = new ArrayList<>();
        cursuriIT.add("Testare Manuala");
        cursuriIT.add("Testare Automata");
        cursuriIT.add("Front-end");
        cursuriIT.add("Java");
        System.out.println(cursuriIT.get(1));//Testare Automata
        System.out.println(cursuriIT.size());//4
        cursuriIT.add("Deisgn");
        cursuriIT.set(4, "Web Disegn");
        afiseazaCursuri(cursuriIT);
        cursuriIT.remove(0);
        afiseazaCursuri(cursuriIT);
        afiseazaListaCuMesaj(cursuriIT);
    }
    public static void afiseazaCursuri(ArrayList<String> lista){
        for (String curs :lista){
            System.out.println(curs);
        }
    }
    public static void afiseazaListaCuMesaj(ArrayList<String> lista){
        for (String curs :lista){
            System.out.println(" Vreau sa urmez un curs" + curs);
        }
    }




}
