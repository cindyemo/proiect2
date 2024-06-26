public class Animal {

    String nume;
    String culoare;
    boolean isVegetarian;

    public Animal(String nume, String culoare, boolean isVegetarian) {
        this.nume = nume;
        this.culoare = culoare;
        this.isVegetarian = isVegetarian;
    }
    public Animal() {
        this.nume = "george";
        this.culoare = "Gri";
        this.isVegetarian = false;
    }

    // Metode getter pentru a obține valorile atributelor
    public String getNume() {
        return nume;
    }

    public String getCuloare() {
        return culoare;
    }
    public boolean isVegetarian() {
        return isVegetarian;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }



    public String toString() {
        return "Animal{" +
                "nume='" + nume + '\'' +
                ", culoare='" + culoare + '\'' +
                ", isVegetarian=" + isVegetarian + '}';
    }

    public static void main(String[] args) {

        Animal animal1 = new Animal("Elefant", "Gri", false);
        System.out.println(animal1);

        Animal animal2 = new Animal();
        System.out.println(animal2);

        animal2.setNume("antilopa");
        animal2.setCuloare("alb și maro");
        animal2.setVegetarian(true);
        System.out.println(animal2);
    }
}
