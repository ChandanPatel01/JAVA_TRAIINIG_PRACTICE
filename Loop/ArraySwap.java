class ArraySwap {
    public static void main(String[] args) {
        int[] numbers = {1, 8, 9, 7, 6, 3};
       int start=0;
	   int end=numbers.length-1;
	   System.out.print(" Original Array:");
	   for(int num:numbers){
			
			System.out.print(" "+ num);
			
		}
		System.out.println(" ");
	   
	   // kyuki apporch kah rhi  ki 0se code calega aur last ki index 1 km calega 
	    
		// LogicalHandler
		
		while(start<end){
			//temp             a
			int temp =numbers[start];
			//a             b
			numbers[start]=numbers[end];
			//b             temp
			numbers[end]=temp;
			
			start++;
			end--;
			
		}
		System.out.print(" Reverse Array:");
		
		for(int num:numbers){
			
			System.out.print(" "+ num);
		}
		
	   
        
    }
}
