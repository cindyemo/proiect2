package sporturi;

public class Fotbalist extends Sportiv {
    String nume;
    public Fotbalist(String nume){
        this.nume = nume;
    }

    @Override
    public void seAntreneaza() {
        System.out.println(" Fotbalistul trage la poarta ");

    }

    @Override
    public void seRecupereaza() {
        System.out.println("Fotbalis se recupereaza");
    }
}
