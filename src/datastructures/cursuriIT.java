package datastructures;

import java.util.ArrayList;

public class cursuriIT {

    // Metoda care afiseaza toate elementele
    public static void afiseazaCursuri( ArrayList<String> cursuri) {
        for (String curs : cursuri) {
            System.out.println(curs);
        }
    }

    // Metoda care afiseaza "vreau sa urmez un curs de numeCurs"
    public static void vreauSaUrmezCurs(ArrayList<String> cursuri) {
        for (String curs : cursuri) {
            System.out.println("Vreau sa urmez un curs de " + curs);
        }
    }

    public static void main(String[] args) {
        // Creare lista de cursuri
        ArrayList<String> cursuri = new ArrayList<String>();
        cursuri.add("Testare manuala");
        cursuri.add("Testare automata");
        cursuri.add("Front-end");
        cursuri.add("Java");

        // Afisare element de pe a doua pozitie
        System.out.println("Elementul de pe a doua pozitie: " + cursuri.get(1));

        // Afisare lungimea listei
        System.out.println("Lungimea listei: " + cursuri.size());

        // Adaugare element nou la final
        cursuri.add("Design");

        // Inlocuire ultimul element
        cursuri.set(cursuri.size() - 1, "Web Design");

        // Afisare toate elementele
        System.out.println("Lista de cursuri:");
        afiseazaCursuri(cursuri);

        // Stergere un curs din lista
        cursuri.remove("Testare manuala");

        // Afisare elemente dupa stergere
        System.out.println("Lista de cursuri dupa stergere:");
        afiseazaCursuri(cursuri);

        // Afisare mesaj pentru fiecare curs
        System.out.println("Mesaje pentru fiecare curs:");
        vreauSaUrmezCurs(cursuri);
    }
}


