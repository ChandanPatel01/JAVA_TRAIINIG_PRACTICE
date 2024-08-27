import java.util.Arrays;
class SortArray{
    public static void main(String[]args){
	   int[] numbers ={1,8,9,7,6,3};
	   System.out.println("Without Sort Array is :");
	   
	   for(int num:numbers){
	        System.out.print(num+ " ");
		  }
		  
	     Arrays.sort(numbers);
		 System.out.println("\nSort Array is :");
	  for(int num:numbers){
	        System.out.print(num+ " ");
		  }

	   
	}
}