package Lab8;

public class   Person {
    //คลาส Student สืบทอดจากคลาส Person
    private String id;
    private String name;

    //constructor
    //public Person (){
    // }


    public Person(String id, String name){
        this.id = id;
        this.name = name;
    }
    //getter and setter

    public String getId(){
        return id;
    }
    protected String getName (){
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString()\
    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}//class
