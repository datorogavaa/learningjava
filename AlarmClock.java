import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

public class AlarmClock implements Runnable {
    private final LocalTime alarmTime;
    AlarmClock(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
    }
    @Override
    public void run(){
        while(LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(LocalTime.now());
        }
        File path = new File("/home/dato/IdeaProjects/corejava/alarmaudio.wav");
        try(AudioInputStream audio = AudioSystem.getAudioInputStream(path)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            Thread.sleep(5000);
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException | LineUnavailableException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
