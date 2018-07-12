public class problem5{
    public static void main(String[] args){
        int value = 0;
        int number = 2520;
        boolean divisible = true;
        while(value == 0){
            for (int i = 1; i <= 20; i++){
                if (number%i != 0){
        	    divisible = false;
                }
            }
            if (divisible == true){
      	        value = number;
            }
            divisible = true;
            number++;
        }
        System.out.println(value);
    }  
}