package Lab9;

public class Mobile {
    private int MobileID;
    private String brand;
    private String generation;
    private double Operating;

    //constructor

    public Mobile(int mobileID, String brand, String generation, double operating) {
        MobileID = mobileID;
        this.brand = brand;
        this.generation = generation;
        Operating = operating;
    }

    //getter and setter

    public int getMobileID() {
        return MobileID;
    }

    public void setMobileID(int mobileID) {
        MobileID = mobileID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public double getOperating() {
        return Operating;
    }

    public void setOperating(double operating) {
        Operating = operating;
    }

    //toString


    @Override
    public String toString() {
        return "Mobile{" +
                "MobileID=" + MobileID +
                ", brand='" + brand + '\'' +
                ", generation='" + generation + '\'' +
                ", Operating=" + Operating +
                '}';
    }
}
