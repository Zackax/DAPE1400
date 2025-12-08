package Motorvogn_oppgave;

public class MotorSykkel implements Kjøretøy{
    public String bilType;
    public Dato forsteGangsRegDato;
    public String skiltNummer;

    
    public MotorSykkel(String bilType, Dato forsteGangsRegDato, String skiltNummer) {
      this.bilType = bilType;
      this.forsteGangsRegDato = forsteGangsRegDato;
      this.skiltNummer = skiltNummer;
    }


    public String toString(){
        String ut = "Typebetegnelse : "+bilType+"\n"+
                    "Første gangs registreringsdato : "+forsteGangsRegDato+"\n"+
                    "Kjennetegn : "+skiltNummer;
        return ut;
    }

  
}
