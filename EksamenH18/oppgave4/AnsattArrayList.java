package EksamenH18.oppgave4;
import java.util.ArrayList;
import java.util.List;

public class AnsattArrayList {
  public static void main(String[]	args)	{
    //	opprett	en	ArrayListe	og	legg	to	ansatte	inn	i	denne
    List<Ansatt> AnsattListe = new ArrayList<>();
    Dato ansatt1Fodt = new Dato(1, 2, 1990);
    Dato ansatt1Tiltradt = new Dato(15, 3, 2015);
    Ansatt ansatt1 = new Ansatt("Yngve",ansatt1Fodt,ansatt1Tiltradt);
    AnsattListe.add(ansatt1);
    Dato ansatt2Fodt = new Dato(2, 12, 1995);
    Dato ansatt2Tiltradt = new Dato(20, 8, 2020);
    Ansatt ansatt2 = new Ansatt("Erlend",ansatt2Fodt,ansatt2Tiltradt);
    AnsattListe.add(ansatt2);
    //	skriv	så	alt	innholdet	i	arrraylisten	ut	på	system.out.
    for(Ansatt ansatt : AnsattListe){
      System.out.println(ansatt);
    }
  }
}
