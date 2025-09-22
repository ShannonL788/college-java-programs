import java.util.Random;
import java.util.Arrays;

public class Random2DArray{
   public static void main(String [] args){
       Random random = new Random();
       double [][] randData = new double[3][3];
       
       for(int i = 0; i < randData.length; i++){
           for(int j = 0; j < randData[i].length; j++){
               randData[i][j] = random.nextDouble(0,101);
           }
       }
       
       for(int row = 0; row < randData.length; row++){
           System.out.println(Arrays.toString(randData[row]));
       }
   }
}
