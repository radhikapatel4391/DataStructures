package ds.array;
//import java.io.*;
import java.util.*;

public class OddEvenString {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String evenArr[]=new String[T];
        String oddArr[]=new String[T];
                
        for(int i=0; i<T; i++)
            {
            String S =scan.next();
            System.out.println("I am string s " +S);
            int l= S.length();
            String odd="";
            String even="";
            for(int j=0; j<l;j++)
                {
                if(j%2==0)
                    even +=(S.charAt(j));
                else
                    odd +=(S.charAt(j));
            }
            evenArr[i] = even;
            oddArr[i]=odd;
           // System.out.println(even +" "+odd);
        }
        for(int k=0;k<T;k++)
            {
            System.out.println(evenArr[k] +" "+oddArr[k]);
        }
        scan.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
