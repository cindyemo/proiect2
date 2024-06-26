public class Person {

    int birthYear; //better to store birth year
    char sex;
    String fname;
    String lname;

    Person(){
        birthYear = 2006;
    }
    //cod-generate-constructor"selectez care il doresti sa ti le dea "

    Person(char sex,String fname,String lname){
        this.sex = sex; //this se refera
        this.fname = fname;
        this.lname = lname;
    }


    public int returnAge(){
        return 2024-birthYear;
    }

    public void afiseaza(){
        System.out.println(fname+ "are"+ returnAge()+ "ani");
    }


}
