package Threads;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class OnClick {
    static Clip clip = null;
    public OnClick(){ run(); }

    public void run(){
        File file = new File("50303.wav");
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
        clip.start();
    }
}
