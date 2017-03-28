package ds.array;
import java.util.Scanner;

public class DynamicArray {
	public static void main(String arg[])
	{
		int lastAns = 0;
		
		Scanner s= new Scanner(System.in);
        int n = s.nextInt();	
        
        int [][] seqList = new int[n][];
        for(int i=0; i< n; i++){
        	seqList[i] = new int[0];
        }
        int queries = s.nextInt(); 
        //System.out.println("I am Quieries  " + queries );
        for(int i = 0; i< queries; i++)
        {   System.out.println("I am query  "+ (i+1));
        	int type = s.nextInt();
        	System.out.println("I am type  " + type );
        	int x = s.nextInt();
        	System.out.println("I am x  " + x );
    		int temp = ((x^lastAns) % n);
    		System.out.println("I am temp " + temp);
    		int arrLenght = seqList[temp].length;
    		System.out.println("I am lenght " + arrLenght);
        	if(type == 1)
        	{
        			        		
        		int tempArray[] = new int[arrLenght + 1];
        		System.arraycopy(seqList[temp], 0, tempArray, 0, arrLenght);
        		tempArray[arrLenght] = s.nextInt();
        		System.out.println("I am appended value  "+ tempArray[arrLenght]);
        		seqList[temp] = tempArray;
        	}
        	else
        	{
        		int y = (s.nextInt() % arrLenght);
        		lastAns = seqList[temp][y];
        		System.out.println("I am last Ans " + lastAns);
        	}
        }
        s.close();	
	}

}
