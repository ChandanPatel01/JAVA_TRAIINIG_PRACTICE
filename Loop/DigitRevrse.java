class DigitRevrse{
   public static void main(String[]args){
     int number=12345;
	 int reverse=0;
	 while(number!=0){
	     int digit=number%10;   // yha pr hm last value ko extact kr rhe 
		 
		 reverse=reverse*10+digit; // yha pr hm value ko update kr rhe hai 
		 
		 number=number/10; // yha pr hm value ko remove kr rhe hai
	 }
	 System.out.println("Revrse Digit is :"+reverse);
   }
}