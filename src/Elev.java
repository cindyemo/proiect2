public class Elev {
    String nume;
    double medieGenerala;

    static String diriginte =" dirigu ";

    public Elev(String nume, double medieGenerala) {
        this.nume = nume;
        this.medieGenerala = medieGenerala;
    }

    public void afisareElev(){
        System.out.println(nume + " are media " + medieGenerala + " are diriginte pe " + diriginte);
    }
}
