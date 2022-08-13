import Threads.OnClick;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Settings  {
    static Clip clip = null;
    public Settings() {
        run();
    }
    public void run(){


        File file = new File("song.wav");
        AudioInputStream audioStream = null;
        try {
            audioStream = AudioSystem.getAudioInputStream(file);
        } catch (UnsupportedAudioFileException | IOException ignored) {

        }

        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException ignored) {

        }
        try {
            clip.open(audioStream);
        } catch (LineUnavailableException | IOException ignored) {

        }
    }

//    -----------------------------------------------------------------------

    public void userInput() {

        OnClick onClick = new OnClick();

        Scanner scanner = new Scanner(System.in);

        String response = "";
        while(!response.equals("Q")) {
            System.out.println("P = play, S = Pause, R = Reset, Q = Main Menu");
            System.out.print("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase();


            switch (response) {
                case ("P") -> {
                    onClick.run();
                    clip.start();
                }
                case ("S") -> {
                    onClick.run();
                    clip.stop();
                }
                case ("R") -> {
                    onClick.run();
                    clip.setMicrosecondPosition(0);
                }
                case ("Q") -> onClick.run();
                default -> System.out.println("Not a valid response");
            }
        }
        clearScreen();
        System.out.println("\n\u001B[35mSettings are saved!\n");
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}