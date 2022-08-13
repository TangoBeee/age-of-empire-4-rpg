package Civlizations;

import Threads.Food;

import java.util.Scanner;

public class Abbasid extends Thread {
    public void abbasidMainMenu() {
        clearScreen();
        Food food = new Food();
        food.start();
        System.out.println("Lets Do it And Win This Game!");
        while(true) {

            System.out.println("""
                    
                    1. Make Army\040\040
                    2. Attack\040\040\040\040
                    3. Defend\040\040\040
                    4. Check Resource
                    5. Quit\040
                    input :- 
                    """);
            Scanner input = new Scanner(System.in);

            int userInput = input.nextInt();

            if(userInput == 5) {
                clearScreen();
                food.exitThread();
                break;
            }

            switch (userInput) {
                case 1 -> System.out.print("Making army");
                case 2 -> System.out.print("Attacking...");
                case 3 -> System.out.print("Defending...");
                case 4 -> System.out.print(food);
            }
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
