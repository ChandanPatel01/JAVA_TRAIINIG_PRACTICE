class Sort_ArrayChecker{
    public static void main(String[]args){
	   int[] numbers ={7,8,9,10,11,13};
	   boolean isSort=true;
	  for(int i=0;i<numbers.length-1;i++){
	     if(numbers[i]>numbers[i+1]){
		    isSort=false;
			break;
		 }
	        
		  }
		  System.out.println("Array Sorted  :"+isSort);
	   
	}
}