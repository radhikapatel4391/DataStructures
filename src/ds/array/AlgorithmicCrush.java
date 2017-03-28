package ds.array;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmicCrush {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long arr[] = new long[n];
        int m= s.nextInt();
        for(int i=0; i<m; i++)
            {
            int lowLimit = s.nextInt();
            int upLimit = s.nextInt();
            long value = s.nextInt();
           // int temp = upLimit - lowLimit + 1;
            //lowLimit--;
            for(int j = (lowLimit-1); j<upLimit; j++)
                {
                arr[j] += value;
                
            }
        }
        System.out.println(Arrays.stream(arr).max().getAsLong());
    }

}
