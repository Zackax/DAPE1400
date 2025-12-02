package EksamenH18.oppgave4;

public class Ansatt {

				private String navn;
        private Dato fodt;
        private Dato tiltradt;

        public Ansatt(String navn, Dato fodt, Dato tiltradt){
          this.navn = navn;
          this.fodt = fodt;
          this.tiltradt = tiltradt;
        }

      public String toString(){
        return "Navn: " + this.navn + " Født: " + this.fodt + " ansatt: " + this.tiltradt;
      }
}
