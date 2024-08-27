class Gre{
    public static void main(String[]args){
	   int[] numbers ={1,8,9,7,6,3};
	   int max=numbers[0];
	  for(int num:numbers){
	       if(num>max){
		   max=num;
		  }
		  }
	System.out.println("Max Number is  :"+max);
}
}