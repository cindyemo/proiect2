package animale;

public class Animal {

    String nume;
    String culoare;
    boolean isVegetarian;

    public Animal(){
        isVegetarian = true;
        nume ="unknow";
        culoare ="unknow";
    }
    public Animal(String nume){
        this.nume= nume;
    }
    public Animal(String nume, String culoare) {
        this.nume = nume ;
        this.culoare = culoare;
    }
    public Animal(String nume,String culoare, boolean isVegetarian){
        this.nume = nume;
        this.culoare = culoare;
        this.isVegetarian = isVegetarian;
    }
    public void mananca(){
        System.out.println(this.nume+ " mananca ");
    }
    public void doarme(){
        System.out.println(this.nume + " doarme ");
    }
    public String afiseazaCuloare(){
        return this.nume+ " are culoarea " + culoare;
    }

}
