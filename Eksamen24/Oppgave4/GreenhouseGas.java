package Eksamen24.Oppgave4;

import java.util.ArrayList;
import java.util.Arrays;

public class GreenhouseGas {
  private String gasName;
  private double globalWarmingPotential;
  double emissionInKilotonne;

  public GreenhouseGas(String gasName, double globalWarmingPotential, double emissionInKilotonne) {
    
    this.gasName = gasName;
    this.globalWarmingPotential = globalWarmingPotential;
    this.emissionInKilotonne = emissionInKilotonne;
  }
  
  public double calculateEquivalent(){
    return globalWarmingPotential*emissionInKilotonne;
  }
  
  @Override
  public String toString() {
    return emissionInKilotonne + " kilotonne " + gasName + " tilsvaerer " + calculateEquivalent() + " kilotonn C02e";
  }

  public static void main(String[] args) {
    
    GreenhouseGas co2 = new GreenhouseGas("karbondioksid",1,38_869);
    GreenhouseGas ch4 = new GreenhouseGas("metan",25,171.27);
    GreenhouseGas n2o = new GreenhouseGas("dinitrogenoksid",298,8.44);
    System.out.println(co2);
    ArrayList <GreenhouseGas> gasser = new ArrayList<>(Arrays.asList(co2,ch4,n2o));
    //GreenhouseGas [] arrayListe = {co2,ch4,n2o};
    double sum = 0;
    for (GreenhouseGas greenhouseGas : gasser) {
      sum += greenhouseGas.calculateEquivalent();
      System.out.println(greenhouseGas);
    }
    System.out.println("Totalt blir dette " + sum + " kilotonn CO2e");
  }
  
}
