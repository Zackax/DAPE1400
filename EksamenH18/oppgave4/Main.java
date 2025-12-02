package EksamenH18.oppgave4;

public class Main {

  public static void main(String[] args) {
    Dato ansatt1Fodt = new Dato(1, 2, 1990);
    Dato ansatt1Tiltradt = new Dato(15, 3, 2015);
    Ansatt ansatt1 = new Ansatt("yngve",ansatt1Fodt,ansatt1Tiltradt);
    System.out.println(ansatt1);
  }
}