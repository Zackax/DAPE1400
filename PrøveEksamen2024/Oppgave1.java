package PrøveEksamen2024;

import java.util.Arrays;

public class Oppgave1 {
  public void investigateStringArray(String[] strings){
    int nullTeller = 0;
    for(String s: strings){
      if (s != null) {
        if (s.contains("a")) {
          int teller = 0;
          for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
              teller++;
            }
          }
          System.out.println(s + "og har " + teller + "a'er");
        }
      }else{
        nullTeller++;
      }
    }
    System.out.println(nullTeller + "null'ere i arrayet");
  }
  public static void main(String[] args) {
    Oppgave1 testOppgave1 = new Oppgave1();
    String [] stringArray = {"bbsdg","hgdfjkg","abola","obama","yappy","nei","ja","talla",null,null,null};
    testOppgave1.investigateStringArray(stringArray);
  }
}
