package Lab7;

public class Mobile {
    //Attributes
    private int MobileID;
    private String Brandr;
    private String Generationr;
    private int Price;
    private String Operatingsystem;
    //constructor คือ เมธอดที่มีชื่อเดียวกับชื่อคลาส เมื่อมีการสร้างวัตถุ จะเป็นการเรียกใช้งาน constructor เสมอ
    //1. default constructor
    public Mobile(){}
    //2. constructor ที่สร้างขึ้นมาใหม่
    public Mobile(int MobileID,String Brandr,String Generationr,int Price,String Operatingsystem){
        this.MobileID = MobileID;
        this.Brandr = Brandr;
        this.Generationr = Generationr;
        this.Price = Price;
        this.Operatingsystem = Operatingsystem;

    }
    //Behavior คือ พฤติกรรมของวัตถุ
    public void call(){
        System.out.println("Mobile call");
    }
    public void message(){
        System.out.println("Mobile message");
    }
    public void internet(){
        System.out.println("Mobile internet");
    }

    // getter and setter methods ใช้สำหรับการอ่านและปรับปรุงข้อมูลใน attributes ของคลาส
    // getter ใช้อ่านข้อมูล
    // setter ใช้ปรับปรุงหรือเปลี่ยนแปลงข้อมูล
    public int getMobileID(){
        return this.MobileID;
    }
    public void setMobileID(int MobileID){
        this.MobileID = MobileID;
    }
    public String getBrandr(){
        return this.Brandr;
    }
    public void setBrandr(String Brandr){
        this.Brandr = Brandr;
    }
    public String getGenerationr(){
        return this.Generationr;
    }
    public void setGenerationr(String Generationr){
        this.Generationr = Generationr;
    }
    public int getPrice(){
        return this.Price;
    }
    public void setPrice(int Price){
        this.Price = Price;
    }
    public String getOperatingsystem(){
        return this.Operatingsystem;
    }
    public void setOperatingsystem(String Operatingsystem){
        this.Operatingsystem = Operatingsystem;
    }
}//class}