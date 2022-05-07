import java.lang.Thread;
import java.util.Scanner;
import java.util.Random;

public class Singleplayer {
    int civ_input;
    public void intro() throws InterruptedException {
        Main.clearScreen();
        System.out.print("Hey, Welcome to AGE OF EMPIRE RPG Version. I hope your will enjoy!");
        Thread.sleep(2000);
        Main.clearScreen();
        while (true) {
            System.out.print("\u001B[0m");
            System.out.print("""
                    Select your Civ. from the given options
                        
                        0. Random
                        1. Abbasid Dynasty
                        2. Chinese
                        3. Delhi Sultanate
                        4. English
                        5. French
                        6. Holy Roman Empire
                        7. Rus
                        8. Mongols
                        
                        Input :-\t""");
            Scanner input = new Scanner(System.in);
            int sample_civ_input = input.nextInt();

            if (sample_civ_input == 0) {
                Random random = new Random();
                civ_input = random.nextInt(8 + 1);
                switch (civ_input) {
                    case 1: abbasid_Dynasty();
                        break;
                    case 2: chinese();
                        break;
                    case 3: delhi_Sultanate();
                        break;
                    case 4: english();
                        break;
                    case 5: french();
                        break;
                    case 6: holy_Roman_Empire();
                        break;
                    case 7: rus();
                        break;
                    case 8: mongols();
                        break;
                }
                break;
            }

            else if(sample_civ_input == 1) {
                abbasid_Dynasty();
                break;
            }

            else if(sample_civ_input == 2) {
                chinese();
                break;
            }

            else if(sample_civ_input == 3) {
                delhi_Sultanate();
                break;
            }

            else if(sample_civ_input == 4) {
                english();
                break;
            }

            else if(sample_civ_input == 5) {
                french();
                break;
            }

            else if(sample_civ_input == 6) {
                holy_Roman_Empire();
                break;
            }

            else if(sample_civ_input == 7) {
                rus();
                break;
            }

            else if(sample_civ_input == 8) {
                mongols();
                break;
            }

            else {
                System.out.println("\u001B[31mWrong input! Try Again.\n");
            }
        }
    }

    public void abbasid_Dynasty() throws InterruptedException {
//        System.out.println("ad");
        System.out.println("Enjoy The Game! :)");
        while (true) {
            System.out.println("""
                    1. Earn Resource  
                    2. Make Army  
                    3. Attack    
                    4. Defend   
                    5. Quit 
                    """);
            Scanner input = new Scanner(System.in);
            int j = input.nextInt();
            if(j == 1) {
                for (int i = 1; i == 1; i++) {
                    int food = 0;
                    int wood = 0;
                    int gold = 0;
                    int stone = 0;

                    Thread.sleep(7000);
                    System.out.println("Please wait few seconds");
                    food = +100;
                    wood = +100;
                    gold = +100;
                    stone = +50;
                    System.out.print("Generating resources");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    System.out.println();
                    System.out.println("You have now " + food + " food, " + wood + " wood, " + gold + " gold, " + " and " + stone + " Stone");
                }
            }

            else if(j == 2) {
                System.out.println("Making army...");
            }

            else if(j == 3) {
                System.out.println("Attacking...");
            }

            else if(j == 4) {
                System.out.println("Defending...");
            }

            else if(j == 5) {
                System.out.println("Are you sure? This match will count as surrender y/n :- ");
                Scanner input1 = new Scanner(System.in);
                char k = input1.next().charAt(0);
                if(k == 'y') {
                    break;
                }
                else if(k == 'n') {
                    continue;
                }
                else {
                    System.out.println("Wrong input!");
                    continue;
                }
            }

            else {
                System.out.println("Wrong input!");
                continue;
            }

        }

    }

    public void chinese() throws InterruptedException {
//        System.out.println("c");
        System.out.println("""
                Enjoy The Game! :)
                
                1. Earn Resource
                2. Make Army
                3. Attack
                4. Defend
                5. Quit
                """);
        for(int i=1; i > 0; i++) {
            int food = 0;
            int wood = 0;
            int gold = 0;
            int stone = 0;

            Thread.sleep(10000);
            food=+100;
            wood=+100;
            gold=+100;
            stone=+50;
        }
    }

    public void delhi_Sultanate() throws InterruptedException {
//        System.out.println("ds");
        System.out.println("""
                Enjoy The Game! :)
                
                1. Earn Resource
                2. Make Army
                3. Attack
                4. Defend
                5. Quit
                """);
        for(int i=1; i > 0; i++) {
            int food = 0;
            int wood = 0;
            int gold = 0;
            int stone = 0;

            Thread.sleep(10000);
            food=+100;
            wood=+100;
            gold=+100;
            stone=+50;
        }
    }

    public void english() throws InterruptedException {
//        System.out.println("e");
        System.out.println("""
                Enjoy The Game! :)
                
                1. Earn Resource
                2. Make Army
                3. Attack
                4. Defend
                5. Quit
                """);
        for(int i=1; i > 0; i++) {
            int food = 0;
            int wood = 0;
            int gold = 0;
            int stone = 0;

            Thread.sleep(10000);
            food=+100;
            wood=+100;
            gold=+100;
            stone=+50;
        }
    }

    public void french() throws InterruptedException {
//        System.out.println("f");
        System.out.println("""
                Enjoy The Game! :)
                
                1. Earn Resource
                2. Make Army
                3. Attack
                4. Defend
                5. Quit
                """);
        for(int i=1; i > 0; i++) {
            int food = 0;
            int wood = 0;
            int gold = 0;
            int stone = 0;

            Thread.sleep(10000);
            food=+100;
            wood=+100;
            gold=+100;
            stone=+50;
        }
    }

    public void holy_Roman_Empire() throws InterruptedException {
//        System.out.println("hre");
        System.out.println("""
                Enjoy The Game! :)
                
                1. Earn Resource
                2. Make Army
                3. Attack
                4. Defend
                5. Quit
                """);
        for(int i=1; i > 0; i++) {
            int food = 0;
            int wood = 0;
            int gold = 0;
            int stone = 0;

            Thread.sleep(10000);
            food=+100;
            wood=+100;
            gold=+100;
            stone=+50;
        }
    }

    public void rus() throws InterruptedException {
//        System.out.println("r");
        System.out.println("""
                Enjoy The Game! :)
                
                1. Earn Resource
                2. Make Army
                3. Attack
                4. Defend
                5. Quit
                """);
        for(int i=1; i > 0; i++) {
            int food = 0;
            int wood = 0;
            int gold = 0;
            int stone = 0;

            Thread.sleep(10000);
            food=+100;
            wood=+100;
            gold=+100;
            stone=+50;
        }
    }

    public void mongols() throws InterruptedException {
//        System.out.println("m");
        System.out.println("""
                Enjoy The Game! :)
                
                1. Earn Resource
                2. Make Army
                3. Attack
                4. Defend
                5. Quit
                """);
        for(int i=1; i > 0; i++) {
            int food = 0;
            int wood = 0;
            int gold = 0;
            int stone = 0;

            Thread.sleep(10000);
            food=+100;
            wood=+100;
            gold=+100;
            stone=+50;
        }
    }
}
