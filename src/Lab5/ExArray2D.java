package Lab5;

import java.util.Scanner;

public class ExArray2D {

    // Array 2 มิติ คือ ตัวแปรที่เก็บข้อมูลในลักษณะของตาราง แถวแนวนอน (row)และแนวตั้ง (column)
    // โดยใช้เลข index 2ตัว ในการเข้าถึงข้อมูลใน Array เช่น x[0] [0]
    public static void main(String[] args) {
       int x[][] = new int[2][3];

       x[0][0] = 10;

       // input data to array 2D
        x = inputDataArray(x);

        // display data in array
        ShowDataArray(x);

    }//main

    public static void ShowDataArray(int[][] x) {
        System.out.print("Data in array:");
        int total = 0;

        for (int i = 0; i < x.length; i++){ //วนลูปแถวแนวนอน
            for (int j = 0; j < x[i].length; j++) { //วนลูปแถวแนวตั้ง
                System.out.print(x[i][j] + "");
                total += x[i][j]; // นำข้อมูลทุกบล็อกมาบวกรวมกันแล้วเก็บไว้ใน total
            }//j
            System.out.println();
        }//i
        System.out.println("Total value : "+total);
        System.out.println("Average value : "+total/6);

    }

    public static int[][] inputDataArray(int[][] x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter integer to array below:");

        for (int i = 0; i < x.length; i++){ //วนลูปแถวแนวนอน
            for (int j = 0; j < x[i].length; j++){ //วนลูปแถวแนวตั้ง
                System.out.print("Input:");
                x[i][j] = sc.nextInt();

            }//j
        }//i
        return x;
    }


}//class
