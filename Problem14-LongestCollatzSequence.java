public class Problem14 {
    public static void main(String[] args) {
        int largest = 0, sequence, number = 0;
        long aux;
        for (int i = 0; i < 1000000; i++){
            aux = i;
            sequence = 1;
            while (aux > 1){
                sequence++;
                if (aux % 2 == 0)
                    aux /= 2;
                else 
                    aux = (aux*3)+1;
            }
            if (sequence > largest){
                largest = sequence;
                number = i;
            }
        }
        System.out.println(number);
    }    
}
