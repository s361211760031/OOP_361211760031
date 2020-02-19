package Lab8;

public class PersonApp {

    public static void main(String[] args) {
        //create object
        Student std1 = new Student("111111111111",
                "Supanrr Jaktin",
                "STD001",
                "Infrmation Tecnolohy");
        Person p1 = new Person("22222222222","Piyapong Senanus");

        System.out.println(std1.getName());
        System.out.println(p1.getName());


        System.out.println(std1.toString());
        System.out.println(p1.toString());




    }//main
}//class
