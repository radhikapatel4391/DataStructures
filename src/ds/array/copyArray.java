package ds.array;

public class copyArray {
	public static void main(String arg[]){
		//int numberOfArrays = 3;
		System.out.println(7%1);
		 int[] oldArray = {1,2,3,4,5};
		 System.out.println("I am old");
		 for(int i=0;i < oldArray.length;i++){
			 System.out.print("  "+oldArray[i]);
		 }
		 System.out.println();
	     //new value
	     int newValue = 10;

	     //define the new array
	     int[] newArray = new int[oldArray.length + 1];
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		newArray[oldArray.length]= newValue;
		System.out.println("I am new");
		for(int i=0;i < newArray.length;i++){
			 System.out.print("  "+newArray[i]);
		 }
		System.out.println();
		oldArray = newArray;
		System.out.println("I am old");
		for(int i=0;i < oldArray.length;i++){
			 System.out.print("  "+oldArray[i]);
		 }
		}
}
