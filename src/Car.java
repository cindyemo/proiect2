public class Car {
    String marca;

    String model;

    String categorie;
    String culoarea;

    int anFabricatie;
    int putere;

    public Car(){
        System.out.println(" Seapeleaza constructorul din Clasa Car ");
        categorie=" autoturism ";
    }
    public Car(String marcaNoua,String modelNou){
        System.out.println(" Se apeleaza costructorul nr2 ");
        marca= marcaNoua;
        model= modelNou;
    }

    public void afiseaza(){
        System.out.println("Masina mea este " + marca + model+ " are " + putere + "CP" + " si este din anul "+anFabricatie );
    }
    public void culoareMea(){
        System.out.println("Masina mea are culoarea "+culoarea);
    }

}
