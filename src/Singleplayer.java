import Civlizations.Abbasid;
import Threads.OnClick;

import java.util.Random;
import java.util.Scanner;

public class Singleplayer extends Thread {
    public void intro() throws InterruptedException {
        OnClick onClick = new OnClick();
        Main.clearScreen();
        System.out.print("Hey, Welcome to AGE OF EMPIRE RPG Version. I hope your will enjoy! \n");
        Thread.sleep(2000);
        Main.clearScreen();
        while (true) {
            System.out.print("\u001B[0m");
            System.out.print("""
                    Select your Civ. from the given options. (10 for Quit?)
                        
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

            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            if(userInput == 10) {
                onClick.run();
                clearScreen();
                break;
            }

            else if(userInput == 0) {
                onClick.run();
                Random random = new Random();
                int civ_input = random.nextInt(8 + 1);
                switch (civ_input) {
                    case 1: {
                        new Abbasid();
                    };
                        break;
                    case 2: ;
                        break;
                    case 3: ;
                        break;
                    case 4: ;
                        break;
                    case 5: ;
                        break;
                    case 6: ;
                        break;
                    case 7: ;
                        break;
                    case 8: ;
                        break;
                }
                break;
            }

            else if(userInput != 0) {
                switch (userInput) {

                    case 1: {
                        onClick.run();
                        Abbasid abbasid = new Abbasid();
                        abbasid.abbasidMainMenu();
                    };
                    break;

                    case 2:
                        onClick.run();

                    break;

                    case 3:
                        onClick.run();

                    break;

                    case 4:
                        onClick.run();

                    break;

                    case 5:
                        onClick.run();

                    break;

                    case 6:
                        onClick.run();
                        ;
                    break;

                    case 7:
                        onClick.run();

                    break;

                    case 8:
                        onClick.run();

                    break;

                    default:
                        onClick.run();
                        System.out.print("Wrong Input.... ");
                }
            }
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
