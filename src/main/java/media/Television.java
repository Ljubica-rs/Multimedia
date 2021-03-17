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
    public void setTurnOn(int newTurnOn){
        this.currentProgram = newTurnOn;
    }
    
}