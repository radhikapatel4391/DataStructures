package ds.array;
import java.util.Objects;
import java.util.Scanner;

public class SparseArrays {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
        int numberOfStrings = scan.nextInt();
        
        //String sss= scan.nextLine();
       // System.out.println("I am no of strings "+numberOfStrings);
        String arr[] = new String[numberOfStrings];
        for (int i=0;i<numberOfStrings;i++)
            {
                arr[i]=scan.next();
                //System.out.println("I am Sting  "+ (i+1)+ ": "+arr[i]);
        }
        int numberOfQuires = scan.nextInt();
        //System.out.println("I am No of Quires  "+numberOfQuires);
        //String ss= scan.nextLine();
        for(int k=0; k<numberOfQuires;k++) 
            {
              int count=0;
              String s = scan.next();
              //System.out.println("I am Query "+k+ " : "+s);
              for (int j = 0; j<numberOfStrings;j++)
                {
            	  //System.out.println("I am in j loop for  "+s);	
            	 // System.out.println("Compaire "+ s+ " with " + arr[j]+ " :result is " + (Objects.equals(s, arr[j])));
            	  if(Objects.equals(s, arr[j]))
            	  	{
            		  
            	  			count++;
            	  	}
                }
                System.out.println(count);
        }
	
 scan.close();
}
}

