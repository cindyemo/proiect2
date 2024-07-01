package animale;

public class Mamifer extends Animal {
    String tipMamifer;

    public Mamifer(String nume, String colour, boolean isVegetarian, String tipMamifer){
        super(nume,colour, isVegetarian);
        this.tipMamifer = tipMamifer;
    }
    public void scoateSunete(){
        System.out.println(nume+ " scoate sunete ");
    }
}
