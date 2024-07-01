import animale.Animal;
import animale.Cat;
import animale.dog;
import sporturi.Fotbalist;
import sporturi.Voleibalist;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ClassDemo obiect1 = new ClassDemo();
        obiect1.attribute2="ceva";
       // obiect1.getAttribute1()="altceva";
        Human cindy=new Human();
        Human nicu=new Human();
        cindy.email="cindy@test.com";
        nicu.email="nicu@test.com";
        System.out.println(cindy.email);
        System.out.println(nicu.email);

        //nume clasa
        Book book1 = new Book();

        book1.autor="Mihai Eminescu";
        book1.titlu="Poezii";
        System.out.println(book1.autor);
        System.out.println(book1.getPret());
        book1.afiseaza();

        book1.titlu = "Basme"; //suprascriem titlu pt book1
        book1.afiseaza();

        //exerctiu
        //creati un obiect nou book2
        //pret=35
        //titlu Amintirti din Copilarie
        //autor Ion Creanga
        //apelati cele doua metode cu obiectul nou creat


        Book book2 = new Book();
        book2.autor ="Ion Creanga";
        book2.titlu="Amintiri din Copilaire";
        book2.setPret(35.0);
        book2.afiseaza();

        //exemplu clasa car
        Car myCar =new Car();
        myCar.marca ="Opel";
        myCar.model ="Corsa";
        myCar.anFabricatie = 2013;
        myCar.putere=119;
        myCar.afiseaza();
        myCar.culoarea = "grisobolan";
        myCar.culoareMea();

        Car myOldCar = new Car();
        myOldCar.afiseaza();
        System.out.println(myOldCar.categorie);
        System.out.println(myCar.categorie);

        Car catasCar = new Car(" VW ", "Passat");
        catasCar.afiseaza();

        //exemplu clas person
        Person bula = new Person();
        System.out.println(bula.returnAge());

        Person alinuta = new Person('f',"Alinuta","Bulinuta");
        System.out.println(alinuta.fname+" "+alinuta.lname);

        Person jon = new Person('m',"john","doe");
        jon.afiseaza();
        Person jean = new Person('f',"jean","doe");
        System.out.println(jon);

        Animal dog = new Animal("Rex","black", false);
        Animal cat = new Animal("Kitty", "orange");

        dog.mananca();
        dog.doarme();
        System.out.println(dog.afiseazaCuloare());

        cat.mananca();
        cat.doarme();
        System.out.println(cat.afiseazaCuloare());


        Elev elev1 = new Elev(" Popescu Andrei ",9.68);
        Elev elev2 = new Elev(" Ionescu Alina ",9.82);
        elev2.medieGenerala=8.00;
        elev2.nume=" Pop Alina ";
        elev2.diriginte =" nou dirig ";

        elev1.afisareElev();
        elev2.afisareElev();

       // System.out.println(elev1.nume+" "+elev1.medieGenerala);
        //System.out.println(elev2.nume+" "+elev2.medieGenerala);

        EchipaFotbal Romania = new EchipaFotbal(" Romania ", 3);
        EchipaFotbal Slovacia = new EchipaFotbal("Slovacia ",3);
        Slovacia.punctaj=2;
        EchipaFotbal.campionat="UEFA";
        Slovacia.nume="Slovacia este Eliminata din UEFA";

        Romania.afisare();
        Slovacia.afisare();

        EchipaFotbal.metodaStatica();

        Fotbalist fotbalist1= new Fotbalist("Hagi");
        Voleibalist voleibalist1 = new Voleibalist();

        fotbalist1.seAntreneaza();
        fotbalist1.seRecupereaza();
        voleibalist1.seAntreneaza();
        voleibalist1.seRecupereaza();

        Cat cat1 = new Cat("Tom", "orange", false, "terestru");
        cat1.scoateSunete();
        dog dog1 = new dog("Aki","brown", false, "terestru");
        dog1.scoateSunete();
        }

    }
