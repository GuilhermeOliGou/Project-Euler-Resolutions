public class Problem12{
    public static void main (String[] args){
        int divisors = 1;
        Long number = 0L;
        int highest = 0;
        int currentNumber = 1;
        while(divisors < 500){
            number += currentNumber;
            currentNumber++;
            divisors = 1;
            if (number % 2 == 0){
                for (int i = 1; i <= number/2; i++){
                    if (number % i == 0){
                        divisors++;
                    }    
                }
            }else if (number % 3 == 0){
                for (int i = 1; i <= number/3; i++){
                    if (number % i == 0)
                        divisors++;
                }
            }else if (number % 5 == 0){
                for (int i = 1; i <= number/5; i++){
                    if (number % i == 0)
                        divisors++;
                }
            }else if (number % 7 == 0){
                for (int i = 1; i <= number/7; i++){
                    if (number % i == 0)
                        divisors++;
                }
            }else {
                for (int i = 1; i < number; i++){
                    if (number % i == 0)
                        divisors++;
                }
            }
            //System.out.println(number + " / " + divisors);
            if (divisors > highest){
                highest = divisors;
            }
        }
        System.out.println(number);
    }
}
