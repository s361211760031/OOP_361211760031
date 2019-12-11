package Lab2;

import java.util.Scanner;

public class basicJava2 {

    public static void main(String[] args) {
        //input  ชื่อ
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your name: ");
//        String name = sc.nextLine();
//
//        System.out.println("Your name is "+name);
//
//        //input อีเมล
//        System.out.print("Enter your Email: ");
//        String Email = sc.nextLine();
//
//        System.out.println("Your name is "+Email);

        //input อายุ
        System.out.print("Enter an number: ");
        int num = sc.nextInt();
        System.out.println("Your entered number: "+num);

        System.out.print("Enter a real number:");
        double d = sc.nextDouble();
        System.out.println(d);


    }

}//class
