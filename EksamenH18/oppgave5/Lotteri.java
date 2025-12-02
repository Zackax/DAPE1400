package EksamenH18.oppgave5;

public class Lotteri {
        public static final int MAKS_ANTALL =	1000;
				public int antallSolgte =	0;	
				public Lodd[]	loddbok =	new Lodd[MAKS_ANTALL];
				
				public boolean kjøpLodd(Lodd	nyttLodd){
                if(MAKS_ANTALL >= loddbok.length){
                  return false;
                }else{
                  return true;
                }
				}
				public String	trekkVinner(){
								int vinner =  (int) (Math.random() * antallSolgte);
                return "Vinner er: " + vinner;
				}
}
