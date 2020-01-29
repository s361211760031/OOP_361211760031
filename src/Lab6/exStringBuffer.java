package Lab6;

import Lab1.Hello;

import java.util.StringTokenizer;

public class exStringBuffer {

    public static void main(String[] args) {

        //StringBuffer เป็นคลาส ที่มีเมธอคต่างๆ
        //ที่สามารถปรับปรุงแก้ไขข้อมูลที่เป็น String ได้มากกว่าคลาส String ทั่วไป

        StringBuffer strBuf = new StringBuffer("Hello");
        System.out.println(strBuf);
        //a]]end() ใช้สำหรับต่อ String
        strBuf.append("Saiyai");
        System.out.println(strBuf);
        System.out.println(strBuf.reverse());
        strBuf.delete(0,6);
        System.out.println(strBuf);


        //StringTokenizer
        String s = "And why haven't you RSVP'd for the reception?\n" +
                "Okay, so you're calling lt Provenza to find out whether or not I RSVP to your wedding?\n" +
                "I'm gonna RSVP you and the missus as a yes, right?\n" +
                "I know you didn't come to deliver your RSVP in person.\n" +
                "Here's my rsvp.\n" +
                "I don't know. She just RSVP'd plus one.\n" +
                "Castle, Jenny tells me that you RSVP'd plus one.\n" +
                "When Powell RSVPed, the trojan was installed.\n" +
                "Hey, Raj, you didn't send your RSVP in.\n" +
                "He thinks you're not filling out the RSVP card because of the plus one.\n" +
                "I am sending you my RSVP card.\n" +
                "I'll check and see who rsvp +1, then we'll call people and maybe someone will know who he is.\n";

        StringTokenizer tokenizer = new StringTokenizer(s);
        int countWord = tokenizer.countTokens();
        System.out.println("Word count from message: "+countWord);

        //word cutting
        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }



    }//main

}//class
