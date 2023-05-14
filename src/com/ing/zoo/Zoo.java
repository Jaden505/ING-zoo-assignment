package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";
        Giraffe gerry = new Giraffe();
        gerry.name = "Gerry";
        Crocodile chomper = new Crocodile();
        chomper.name = "Chomper";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        if(input.equals(commands[0]))
        {
            System.out.println("Which animal do you want to say hello to?");
            String animalName = scanner.nextLine();
            if(animalName.equals(henk.name))
            {
                henk.sayHello();
            }
            else if(animalName.equals(elsa.name))
            {
                elsa.sayHello();
            }
            else if(animalName.equals(dora.name))
            {
                dora.sayHello();
            }
            else if(animalName.equals(wally.name))
            {
                wally.sayHello();
            }
            else if(animalName.equals(marty.name))
            {
                marty.sayHello();
            }
            else if(animalName.equals(gerry.name))
            {
                gerry.sayHello();
            }
            else if(animalName.equals(chomper.name))
            {
                chomper.sayHello();
            }
            else
            {
                henk.sayHello();
                elsa.sayHello();
                dora.sayHello();
                wally.sayHello();
                marty.sayHello();
                gerry.sayHello();
                chomper.sayHello();
            }
        }
        else if(input.equals(commands[1]))
        {
            elsa.eatLeaves();
            marty.eatLeaves();
            dora.eatLeaves();
            gerry.eatLeaves();
        }
        else if(input.equals(commands[2]))
        {
            henk.eatMeat();
            wally.eatMeat();
            chomper.eatMeat();
        }
        else if(input.equals(commands[3]))
        {
            henk.doTrick();
            elsa.doTrick();
            wally.doTrick();
            gerry.doTrick();
            chomper.doTrick();
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}