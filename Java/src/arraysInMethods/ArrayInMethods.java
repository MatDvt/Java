package arraysInMethods;

public class ArrayInMethods {
	
	public static void main (String args []){
		
		int array[] = {1,2,3,4,5,6};
		change(array);
		//generic structure for enhanced loop for arrays;
		for(int y:array)
			System.out.println(y);
			
	}
	// a method with generic values for adding values in the array;
	public static void change(int x[]){
		for(int counter=0; counter<x.length;counter ++)
		x[counter]+=1;
	}
	
	

}
