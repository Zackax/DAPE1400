package Eksamen24;

public class Oppgave1 {
  public void investigateIntArray(int[] ints, int number){
    int lessThanZero =0;
    int sum = 0;
    int maksVerdi = ints[0];
    for (int i = 0; i < ints.length; i++) {
      sum += ints[i];
      if (ints[i] < 0) {
        lessThanZero++;
      }
      if (ints[i] > maksVerdi) {
        maksVerdi = ints[i];
      }
      if (ints[i]%number ==0) {
        System.out.println(ints[i] + " er delelig med " + number);
      }
      
    }
    System.out.println("antall tall som er mindre enn 0: "+lessThanZero);
    System.out.println("summ: "+sum);
    System.out.println("sørtste tall: "+maksVerdi);
  }
  public static void main(String[] args) {
    Oppgave1 oppgave1Test = new Oppgave1();
    int [] tallArray = {-2,-1,7,10,5,-50};
    oppgave1Test.investigateIntArray(tallArray, 5);
  }
}
