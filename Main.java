/*Create a random 2000-digit number and store it in a file. Read the number from the file and find the smallest number within our larger number that contains at least every digit. 
For instance,149485420251367 contains every digit, but 94556780231 is a smaller number that contains every digit.*/

import java.math.BigInteger;
import java.util.Random;   
import java.io.FileNotFoundException;
import java.io.PrintWriter;



public class Main {

    public static void main(String[] args) {
   
   
    BigInteger hugeNum = getBigInt();
   String stringTheBig = hugeNum.toString();
   
        PrintWriter detail = null;
        try {
           detail = new PrintWriter(stringTheBig);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
     detail.close();
 System.out.println(stringTheBig);
    }
    
    public static BigInteger getBigInt() {
        Random rand = new Random();
        
        BigInteger result =  new BigInteger(7,rand);
     result =  result.pow(200);
        return result;
    }
    
}
    

