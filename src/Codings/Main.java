package Codings;

import java.security.PublicKey;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String name = "Jik";
        String name2 = "Nurik";
        String name3 = "Bek";
        int ageJik = generateRandomAge();
        System.out.println("возраст Жики "+ageJik);
        System.out.println("-------------------------------");
        int ageNurik = generateRandomAge();
        System.out.println("возраст Нурика "+ageNurik);
        System.out.println("-------------------------------");
        int ageBek = generateRandomAge();
        System.out.println("возраст Беки "+ageBek);
        System.out.println("-------------------------------");

        int tempJIk = 15;
        int tempBek = 5;
        int tempNurik = -7;

        if (ageJik<45 && ageJik>20 && tempJIk < 30 && tempJIk > -20) {
            System.out.println(name +"e - " + "Можно идти гулять");

        }
       if (ageBek>0 && ageBek<20 &&  tempBek > 0 && tempBek < 28) {
            System.out.println(name3+"e - "+"Можно идти гулять");
        }
       if (ageNurik<45 && tempNurik >-10 && tempNurik < 25 ) {
           System.out.println(name2+"у - "+ "Можно идти гулять");
       }


    }
    public  static int generateRandomAge(){
        Random random = new Random();
        int ranNumber = random.nextInt(107);
        return ranNumber;
        }
}
