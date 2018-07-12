import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
public class Problem10 {
    public static void main(String[] args)
    {
        List<Integer> primes = new LinkedList<>(Arrays.asList(2));
        Long sum = 2L;
        boolean prime = false;
        for (int i = 2; i < 2000000; i++){
            for (int j = 0; j < primes.size(); j++){
                if (i % primes.get(j) == 0){
                    prime = false;
                    break;        
                }else if ( i % primes.get(j) != 0 && primes.get(j) >= Math.sqrt(i)){
                    prime = true;
                    break;
                }else {
                    prime = true;
                }
            }
            if (prime == true){
                System.out.println(i);
                primes.add(i);
                sum += i;
            }
            prime = true;
        }
        System.out.println(sum);
    }
}
