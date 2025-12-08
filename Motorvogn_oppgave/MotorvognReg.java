package Motorvogn_oppgave;

import java.util.ArrayList;
import java.util.List;
public class MotorvognReg {
      public static void main(String[] args) {

        Kjøretøy [] register = new Kjøretøy [10];

        
        Bil volvo = new Bil("Vovlo T5",new Dato(1,3,2015),"DP23456",450);
        
        
        MotorSykkel ducati = new MotorSykkel("Ducati",new Dato(4,10,2016),"DR4567");
        register[0]=volvo;
        register[1]=ducati;

        
        for (Kjøretøy bil : register) {
          if (bil != null) {
            System.out.println(bil);
          }
        }
        
    }
}
