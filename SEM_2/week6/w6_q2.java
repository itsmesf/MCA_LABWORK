package week6;

import java.util.Scanner;

interface Camera{
    void takePhoto();

}

interface MusicPlayer{
    void playMusic(String musicName);
}

interface Phone{
    void makeCall(String number);
}

class SmartPhone implements Camera, MusicPlayer, Phone{

    @Override
    public void takePhoto(){
        System.out.println ("Taking a Photo...");
    }

    @Override
    public void playMusic(String musicName){
        System.out.println ("Playing music " + musicName + "...");
    }

    @Override
    public void makeCall(String number){
        System.out.println ("Calling "+number+"...");
    }

    public void showFeatures(String musicName, String number){
        System.out.println ("\nSmartPhone Features: " );
        takePhoto ();
        playMusic(musicName);
        makeCall(number);
    }

}
public class w6_q2 {
    public static void main ( String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the song name to play: ");
        String musicName = input.nextLine ();

        System.out.print("Enter the phone number to call: ");
        String number = input.nextLine();

        SmartPhone smartPhone = new SmartPhone ();

        smartPhone.showFeatures (musicName, number );

    }
}
