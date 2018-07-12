public class Problem16 {
    public static void main(String[] args) {
        String number = "1";
        char[] numberSequence;
        int aux = 0;
        int sum = 0;
        for (int i = 0; i < 1000; i++){
            numberSequence = new char[number.length()];
            numberSequence = number.toCharArray();
            number = "";
            for (int j = 0; j < numberSequence.length; j++){
                aux += 2*Integer.parseInt(Character.toString(numberSequence[numberSequence.length-1-j]));
                number += aux%10;
                aux /= 10;
            }
            if (aux > 0)
                number += aux;
            number  = new StringBuilder(number).reverse().toString();
            aux = 0;
        }
        numberSequence = number.toCharArray();
        for (int i = 0; i < numberSequence.length; i++){
            sum += Integer.parseInt(Character.toString(numberSequence[i]));
        }
        System.out.println(sum);
    }    
}
