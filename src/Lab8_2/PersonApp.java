package Lab8_2;

public class PersonApp {

    public static void main(String[] args) {
        //create objects
        Person P1 = new Person ("Supanee Jaktin","1997");
        Person P2 = new Sheriff ("Tor Nattapong","1994","Thungsong");
        Person P3 = new Police ("Som Supanee","1997","Nakhorn");

        P1.introduce();
        P2.introduce();
        P3.introduce();

    }



}
