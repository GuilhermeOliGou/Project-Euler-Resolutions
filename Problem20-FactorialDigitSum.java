public class Problem20 {
    public static void main(String[] args) {
        int aux = 0, sum = 0;
        String number = "1";
        char[] numberDigits;
        for (int  i = 2; i <= 100; i++){
            numberDigits = new char[number.length()];           
            numberDigits = number.toCharArray();
            number = "";
            for (int j = 0; j < numberDigits.length; j++){
                aux += Integer.parseInt(Character.toString(numberDigits[j]))*i;
                number += aux%10;
                aux /= 10;
            }
            number += new StringBuilder(Integer.toString(aux)).reverse().toString();
            aux  = 0;
            number = new StringBuilder(number).reverse().toString();
        }
        numberDigits = new char[number.length()];
        numberDigits = number.toCharArray();
        for (int i = 0; i < numberDigits.length; i++)
            sum += Integer.parseInt(Character.toString(numberDigits[i]));
        System.out.println(sum);
    }    
}
