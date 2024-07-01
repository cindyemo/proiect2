public class EchipaFotbal {

    String nume;
    int punctaj;
    static String campionat =" campionat ";

    public EchipaFotbal(String nume, int punctaj) {
        this.nume = nume;
        this.punctaj = punctaj;
    }
    public void afisare(){
        System.out.println(nume + " are numar de puncte " + punctaj + " joaca la " + campionat);
    }

    public static void metodaStatica(){
        System.out.println("Metoda Statica");

    }
}
