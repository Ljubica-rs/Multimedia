package main;

import media.Television;
import media.Radio;

public class Main {
    public static void main(String[] args) {
        
        Television LG = new Television(23, 11, true);
        LG.printInfo();
        
        LG.setVolume(20);
        LG.setCurrentProgram(15);
        LG.setTurnOn(true);
        LG.printInfo();
        
        Radio RockRadio = new Radio(96.20, 200, 'F');
        RockRadio.printInfo();
        
        RockRadio.setFmFrequency(92.5);
        RockRadio.setAmFrequency(350);
        RockRadio.setBand('A');
        RockRadio.printInfo();  
    }
    
}
