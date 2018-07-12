public class problem4
{
  public static void main(String[] args)
  {
    int value = 0;
    int largest = 0;
    for(int i = 100; i < 999; i++){
      for(int j = 100; j < 999; j++){
      	value = i*j;
        if(isPalindrome(value) && value > largest){
       		largest = value;
        	System.out.println("numeros");
          	System.out.println(i + " " + j);
        }
      }
    }
    System.out.println(largest);
  }
  public static boolean isPalindrome(int p){
    int verse = p;
  	int reverse = 0;
    while(p>0){
      reverse = reverse*10 + p%10;
      p = (p - p%10)/10;
    }
    return (verse == reverse);
  }
}