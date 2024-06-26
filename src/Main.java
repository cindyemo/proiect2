

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
    }


    }
