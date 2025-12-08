package Eksamen24;

import javax.swing.JOptionPane;

public class Oppgave2 {
  private static double divisjon(String teller, String nevner){
    int tellerTall;
    int nevnerTall;
    double resultat;
    try{
      tellerTall = Integer.parseInt(teller);
      nevnerTall = Integer.parseInt(nevner);
      if (tellerTall < 0 || nevnerTall <= 0) {
        return -1.0;
      }

      resultat = (double)tellerTall/nevnerTall;

      return resultat;
    }catch(Exception e){
      return -1.0;
    }
    
  }
  public static void main(String[] args) {
    System.out.println(divisjon("3","-2"));;
  }
}
