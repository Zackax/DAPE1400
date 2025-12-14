package Arrays;

import javax.swing.JOptionPane;

public class Oppgave6 {
  public static void main(String[] args) {
    String rader;
    String kolloner;
    String verdi;
    int[][] helTallsArray;
    try{
      rader = JOptionPane.showInputDialog(null,"hvor mange rader vil du ha?");
      kolloner = JOptionPane.showInputDialog(null,"hvor mange kolloner vil du ha?");
      int tallRader = Integer.parseInt(rader);
      int tallKolloner = Integer.parseInt(kolloner);
      helTallsArray = new int[tallRader][tallKolloner];
    
      //tar inn verdier for matrisen
      for (int i = 0; i < helTallsArray.length; i++) {
        for (int j = 0; j < helTallsArray[i].length; j++) {
          verdi = JOptionPane.showInputDialog(null,"skriv inn et hel tall på rad: " + i + " og kollone: " + j + " : ");
          helTallsArray[i][j] = Integer.parseInt(verdi);
        }
      }
      //regner gjSnitt
      double sum = 0;
      int antallKolloner;
      for (int i = 0; i < helTallsArray.length; i++) {
        sum=0;
        for (int j = 0; j < helTallsArray[i].length; j++) {
          sum += helTallsArray[i][j];
          
        }
        antallKolloner = helTallsArray[i].length;
        System.out.println("gjSnitt for første rad er: "+ (double)sum/(double)antallKolloner);
      }
    
    
    }catch(Exception e){
      System.out.println("Rader eller kolloner ble ikke skivd inn riktig skriv inn et tall!");
    }
    
    
    
  }
}
