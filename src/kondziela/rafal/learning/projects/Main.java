package kondziela.rafal.learning.projects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    boolean isOver = false;

    while (isOver == false){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Morse Code decoding program type 'help' to get list of available commands");


         String key = scanner.next();



        switch (key){



            case "exit":
                isOver = true;
                break;

            case "help":
                System.out.println("Available commands : ");
                System.out.println("exit - exit application");
                System.out.println("config - show the Morse Code key");

            default:
                System.out.println("Wrong command type 'help' or wright command to continiue");
                break;
        }

    }



    }
}
