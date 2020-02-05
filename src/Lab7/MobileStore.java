package Lab7;

public class MobileStore {
    public static void main(String[] args) {
        Mobile Mobile1 = new Mobile();

        Mobile1.setMobileID(1001);
        Mobile1.setBrandr("Wiko");
        Mobile1.setGenerationr("Sunny 4 Plus");
        Mobile1.setPrice(2090);
        Mobile1.setOperatingsystem("Android 9 Go");

        System.out.println(Mobile1.getMobileID());
        System.out.println(Mobile1.getBrandr());
        System.out.println(Mobile1.getGenerationr());
        System.out.println(Mobile1.getPrice());
        System.out.println(Mobile1.getOperatingsystem());

        //2.ใช้ constructor ที่มีการรับพารามิเตอร์
        // เป็นการสร้างวัตถุ พร้อมกับกำหนดข้อมูลได้กับวัตถุ
        Mobile Mobile2 = new Mobile(2002,"Apple","iPhone 11 pro",
                35900,"ioS 13");

        System.out.println(Mobile2.getMobileID());
        System.out.println(Mobile2.getBrandr());
        System.out.println(Mobile2.getGenerationr());
        System.out.println(Mobile2.getPrice());
        System.out.println(Mobile2.getOperatingsystem());

        Mobile Mobile3 = new Mobile(3003,"Sumsung","Galaxy",
                11500,"Android 4.4");

        System.out.println(Mobile3.getMobileID());
        System.out.println(Mobile3.getBrandr());
        System.out.println(Mobile3.getGenerationr());
        System.out.println(Mobile3.getPrice());
        System.out.println(Mobile3.getOperatingsystem());

    }
}