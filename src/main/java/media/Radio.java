/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

/**
 *
 * @author Ljubica
 */
public class Radio {
    private double fmFrequency = 91.8;
    private int amFrequency = 600;
    private char band = 'F';
    
    public Radio(double fmFrequency, int amFrequency, char band){
        this.fmFrequency = fmFrequency;
        this.amFrequency = amFrequency;
        this.band = band;
    }
    
    public double getFmFrequency(){
        return this.fmFrequency;
    }
    
    public void setFmFrequency(double newFmFrequency){
        this.fmFrequency = newFmFrequency;
    }
   
    public int getAmFrequency(){
        return this.amFrequency;
    }
    
    public void setAmFrequency(int newAmFrequency){
        this.amFrequency = newAmFrequency;
    }
   
     public char getBand(){
        return this.band;
    }
    
    public void setBand(char newBand){
        this.band = newBand;
    }
    
    public void printInfo() {
        System.out.println("FM frekvencija: " + this.fmFrequency);
        System.out.println("AM frekvencja: " + this.amFrequency);
        System.out.println("Trenutni talas: " + this.band);
        System.out.println(" ");
    }
}
