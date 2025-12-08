package Eksamen24;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Oppgave3 {
  public void guessTheAnimal(ArrayList<String> animals){
    boolean found = false;
    String awnser = "";
    do{
      try{
        awnser = JOptionPane.showInputDialog(null,"Vil du gjette på et dyr, eller gi opp (tast x)?");
        //kunne ha brukt awnser.toLowerCase 
      System.out.println( "\033[0;1m"+awnser);
      if (awnser.contains("x")) {
        System.out.println("\033[0mOk, sjalabais!");
      }
      if (animals.contains(awnser)) {
        System.out.println("\033[0mDu gjettet riktig - hurra! " + awnser + " var et av dyrene!");
          found = true;
      }else{
         System.out.println("\033[0mHmm, " + awnser + " var ikke riktig...");
      }
      }catch(Exception e){
        awnser = "x";
      }
      
    }while(!found && !awnser.equals("x"));
  }
  public static void main(String[] args) {
    ArrayList <String> animals = new ArrayList<>(Arrays.asList("monkey","elephant","parot","cow","chicken","emu","owl","cat","dog"));
    Oppgave3 testOppgave3 = new Oppgave3();
    testOppgave3.guessTheAnimal(animals);
  }
}
