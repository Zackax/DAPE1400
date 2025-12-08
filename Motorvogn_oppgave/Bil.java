package Motorvogn_oppgave;

public class Bil implements Kjøretøy{
    public String bilType;
    public Dato forsteGangsRegDato;
    public String skiltNummer;
    public double lastekapasitet;

    

    public Bil(String bilType, Dato forsteGangsRegDato, String skiltNummer, double lastekapasitet) {
        this.bilType = bilType;
        this.forsteGangsRegDato = forsteGangsRegDato;
        this.skiltNummer = skiltNummer;
        this.lastekapasitet = lastekapasitet;
    }



    public String toString(){
        String ut = "Typebetegnelse : "+bilType+"\n"+
                    "Første gangs registreringsdato : "+forsteGangsRegDato+"\n"+
                    "Kjennetegn : "+skiltNummer+"\n"+
                    "Lastekapasitet : "+lastekapasitet+" kg";
        return ut;
    }



    
}
