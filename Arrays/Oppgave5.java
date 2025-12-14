package Arrays;

public class Oppgave5 {
  public static void main(String[] args) {
    int[][] helTallsArray = {
      {4,6,2,5},
      {7,9,4,8},
      {6,9,3,7}
    };
    double sum = 0;
    int kolloner = 0;
    for (int i = 0; i < helTallsArray.length; i++) {
      sum=0;
      
      for (int j = 0; j < helTallsArray[i].length; j++) {
        sum += helTallsArray[i][j];
        
      }
      kolloner = helTallsArray[i].length;
      System.out.println("gjSnitt for første rad er: "+ (double)sum/(double)kolloner);
    }
    
  }
}
