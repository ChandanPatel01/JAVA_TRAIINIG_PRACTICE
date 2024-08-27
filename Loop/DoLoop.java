class DoLoop{
    public static void main(String[]args){
	   int[] numbers ={1,8,9,7,6,3};
	   int i=0;
	   do{
	      System.out.print(Integer.toString(numbers[i]) + " ");
		  i++;
	   
	   }while(i<numbers.length);
	   
	}
}