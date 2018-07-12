public class problem6{
    public static void main(String[] args){
        int number1 = 0;
        int number2 = 0;
        for (int i = 1; i <= 100; i++){
            number1 += (i*i);
        }
        for (int i = 1; i <= 100; i++){
            number2 += i;
        }
        System.out.println((number2*number2)-number1);
    }  
}