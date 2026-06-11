package MusicPlayer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class musicPlayer {
    public static void main(String[] args) {
        String filepath="MusicPlayer\\SpotiDown.App - Starboy - The Weeknd.wav";
        File file=new File(filepath);
        try(Scanner sc=new Scanner(System.in);
            AudioInputStream audioStream=AudioSystem.getAudioInputStream(file)){
                Clip clip=AudioSystem.getClip();
                clip.open(audioStream);
                String response="";
                while((!response.equals("Q"))){
                    System.out.println("P=play");
                    System.out.println("S=stop");
                    System.out.println("R-reset");
                    System.out.println("Q-quit");

                    System.out.print("Enter your choice:");
                    response=sc.nextLine().toUpperCase();

                    switch(response){
                        case "P" ->clip.start();
                        case "S" ->clip.stop();
                        case "R" ->clip.setMicrosecondPosition(0);
                        case "Q" ->clip.close();
                        default ->System.out.println("Enter valid option");
                    }

                }
            }
            catch(FileNotFoundException e){
                System.out.println("file not found");
            }
            catch(UnsupportedAudioFileException e){
                System.out.println("Audio file not supported");
            }
            catch(LineUnavailableException e){
                System.out.println("Unavailable to access audio resource");
            }
            catch(IOException e){
                System.out.println("Something went wrong");
            }
            finally{
                System.out.println("Music played!!");
            }

    }
    
}
