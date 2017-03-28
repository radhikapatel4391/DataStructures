package ds.array;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo {
	 public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        Map<String, String> myMap;
	        myMap = new HashMap<String, String>();  
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            String phone = in.next();
	            // Write code here
	            myMap.put(name, phone);	
	        }
	        while(in.hasNext()){
	            String s = in.next();
	            String value = myMap.get(s);
	            if(value != null)
	                System.out.println(s+"="+value);                
	            else
	                System.out.println("Not found");
	            // Write code here
	        }
	        in.close();
	    }

}
