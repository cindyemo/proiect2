package datastructures;

import java.util.HashMap;

public class Dictionar {
    public static void main(String[] args) {
        HashMap<Integer, String> dictionar = new HashMap<>();
        dictionar.put(1, "First");
        dictionar.put(2, "second");
        dictionar.put(3, "third");
        dictionar.put(4, "Fourth");
        dictionar.put(7, "Seventh");
        dictionar.remove(3);//sterge perechea cu cheia=3
        System.out.println(dictionar.get(2));
        System.out.println(dictionar.get(3));
        System.out.println(dictionar.keySet());//1,2,4,7
        System.out.println(dictionar.values());//First,Second,Fourth
        System.out.println(dictionar.entrySet());
        System.out.println(dictionar);
        dictionar.replace(4, "Fourth-updated");
        System.out.println(dictionar.entrySet());

        dictionar.putIfAbsent(7, "Seventh-update");
        System.out.println(dictionar.entrySet());

        for (int key : dictionar.keySet()) {
            System.out.println(key);
        }
        for (String value : dictionar.values()) {
            System.out.println(value);
        }

        //Exercitiu clasa;
        //Creati un dictionar nou cu perechi cheie-valoare;
        //Cheie:echipaFotbal(Sting)
        //Valoare;seCalificaInSferturi(Boolean)

        //adaugati elementele:Franta-da,Romania-nu,Italia-nu,Olanda-da,Portugalia-da\

        //afisati toate perechile cheie-valoare

        HashMap<String, Boolean> calificare = new HashMap<>();
        calificare.put("Franta", true);
        calificare.put("Romania", false);
        calificare.put("Italia", false);
        calificare.put("Olanda", true);
        calificare.put("Portugalia", true);

        System.out.println(calificare.entrySet());

        for (String echipa : calificare.keySet()) {
            if (calificare.get(echipa)) { //afiseaza doar echipele a caror valoare =true
                System.out.println(echipa);
            }
        }

        //for (boolean v: calificare.values()){
        //   System.out.println(v);
        // }
    }
}

