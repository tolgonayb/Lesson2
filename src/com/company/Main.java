package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Random ();
        System.out.println(weather(25,29));
        System.out.println(weather (15, 22));
        System.out.println(weather (38,18));
        System.out.println(weather (18, 36));
        System.out.println (weather (42, 15));

    }

    public static String weather (int age, int temperature) {
        if (age >=20 && age <45 || temperature >=-20  && temperature <30) {
            System.out.println("Можно идти гулять");
        }


        else if (age <20 || temperature >=0 && temperature <28){
            System.out.println("Можно идти гулять");
        }


        else if (age >45 || temperature >=-10 && temperature <20){
            System.out.println("Можно идти гулять");
        }
        else {
            System.out.println ("Оставайтесь дома");
        }
        return "лет" + age + "Температура" + temperature;

    }




    }
    
