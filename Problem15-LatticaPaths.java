public class Problem15 {
    public static void main(String[] args) {
        long number = 1L;
        int squareSide = 20;
        for (int i = squareSide+1; i < squareSide*2+1; i++){
            number *= (i);
            number /= (i-squareSide);
        }
        System.out.println(number);
    }    
}
