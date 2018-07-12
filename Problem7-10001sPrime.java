public class problem7{
    public static void main(String[] args){
    	int order = 0;
    	int number = 0;
    	boolean divisible = false;
    	while(order < 10001){
            for (int i = 2; i < number; i++){
                if (number % i == 0){
                    divisible = true;
                }
            }
            if (!divisible){
                order++;
            }
            number++;
            divisible = false;
    	}
    	System.out.println(number - 1);
    }
}