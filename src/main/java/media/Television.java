package media;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ljubica
 */
public class Television {
    private int volume = 0;
    private int currentProgram = 1;
    private boolean turnOn = false;
    
    public Television(int volume, int currentProgram, boolean turnOn){
        this.volume = volume;
        this.currentProgram = currentProgram;
        this.turnOn = turnOn;
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    public void setVolume(int newVolume){
        this.volume = newVolume;
    }
    
    public int getCurrentProgram(){
        return this.currentProgram;
    }
    
    public void setCurrentProgram(int newCurrentProgram){
        this.currentProgram = newCurrentProgram;
    }
    
    public boolean getTurnOn(){
        return this.turnOn;
    }
    
    public void setTurnOn(boolean newTurnOn){
        this.turnOn = newTurnOn;
    }
    
    public void printInfo() {
        System.out.println("Ukljucen: " + this.turnOn);
        System.out.println("Zvuk je na: " + this.volume);
        System.out.println("Trenutni program: " + this.currentProgram);
        System.out.println(" ");
    }
}