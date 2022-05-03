import java.util.Scanner;
import java.lang.Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
            clearScreen();
            System.out.print("\u001B[33m");
            System.out.print("""
                              _____ ______         ____  ______      ______ __  __ _____ _____ _____  ______   _  _  \s
                        /\\   / ____|  ____|       / __ \\|  ____|    |  ____|  \\/  |  __ \\_   _|  __ \\|  ____| | || | \s
                       /  \\ | |  __| |__         | |  | | |__       | |__  | \\  / | |__) || | | |__) | |__    | || |_\s
                      / /\\ \\| | |_ |  __|        | |  | |  __|      |  __| | |\\/| |  ___/ | | |  _  /|  __|   |__   _|
                     / ____ \\ |__| | |____       | |__| | |         | |____| |  | | |    _| |_| | \\ \\| |____     | | \s
                    /_/    \\_\\_____|______|       \\____/|_|         |______|_|  |_|_|   |_____|_|  \\_\\______|    |_| \s
                                                                                                                     \s
                                                                                                                     \s""");
            System.out.print("\n\u001B[33mEnter Your name :- ");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();

            System.out.println("\u001B[0m\nHey " + name + ", Welcome to \u001B[33mAge of Empire RPG\u001B[0m version!");
            System.out.println("Here you can choose your own civ and play with other civs");
            System.out.println("Every civ have there own speciality\n");

            System.out.println("Hope you will enjoy!");

            Thread.sleep(1000);

            clearScreen();

            System.out.println("""
                              _____ ______         ____  ______      ______ __  __ _____ _____ _____  ______   _  _  \s
                        /\\   / ____|  ____|       / __ \\|  ____|    |  ____|  \\/  |  __ \\_   _|  __ \\|  ____| | || | \s
                       /  \\ | |  __| |__         | |  | | |__       | |__  | \\  / | |__) || | | |__) | |__    | || |_\s
                      / /\\ \\| | |_ |  __|        | |  | |  __|      |  __| | |\\/| |  ___/ | | |  _  /|  __|   |__   _|
                     / ____ \\ |__| | |____       | |__| | |         | |____| |  | | |    _| |_| | \\ \\| |____     | | \s
                    /_/    \\_\\_____|______|       \\____/|_|         |______|_|  |_|_|   |_____|_|  \\_\\______|    |_| \s
                                                                                                                     \s
                                                                                                                     \s""");
            while (true) {
                System.out.print("\u001B[0m");
            System.out.println("""
                    1. Play Single-Player
                    2. Multiplayer
                    3. Help
                    4. Settings ("Coming Soon...")
                    5. Quit (Just Quit the game)\n""");
            System.out.print("Input :- ");
            int num = input.nextInt();
            if (num == 5) {
                clearScreen();
                System.out.println("\n\u001B[37mThanks for playing!");
                Thread.sleep(1500);
                break;
            }

            else if(num == 1) {
                Singleplayer play = new Singleplayer();
                play.intro();
                System.out.println("\n\u001B[35mWanna play again?\n");
            }
//          <------- Working Here ------->
            else {
                System.out.println("\u001B[31mWrong input! Try Again.\n");
            }

        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

