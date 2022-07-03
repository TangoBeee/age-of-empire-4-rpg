import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

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
        } catch (UnsupportedAudioFileException e) {

        } catch (IOException e) {

        }

        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {

        }
        try {
            clip.open(audioStream);
        } catch (LineUnavailableException e) {

        } catch (IOException e) {

        }
    }

//    -----------------------------------------------------------------------

    public void userInput() {

        Scanner scanner = new Scanner(System.in);

        String response = "";
        while(!response.equals("Q")) {
            System.out.println("P = play, S = Pause, R = Reset, Q = Main Menu");
            System.out.print("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase();


            switch (response) {
                case ("P") -> clip.start();
                case ("S") -> clip.stop();
                case ("R") -> clip.setMicrosecondPosition(0);
                case ("Q") -> {
                    break;
                }
                default -> System.out.println("Not a valid response");
            }
        }
        System.out.println("Settings are saved!");
    }
}
