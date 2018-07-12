package javaapplication1;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class JavaApplication1 {    
    public static void main(String[] args) {
        int sum = 276, aux = 1;
        List<Integer> abuNumbers = new LinkedList<>(Arrays.asList(12));
        for (int  i = 24; i < 28123; i++){
            System.out.println(i);
            sum += isAbuSum(i, abuNumbers);
            for (int j = 2; j <= i/2; j++)
                if (i%j == 0)
                    aux += j;
            if(aux > i)
                abuNumbers.add(i);
            aux = 1;
        }
        System.out.println(sum);
    } 
    public static int isAbuSum(int i, List<Integer> L){
        for (int j = 0; j < L.size(); j++)
            for (int k = 0; k < L.size(); k++)
                if (L.get(j)+L.get(k) == i)
                    return 0;
        return i;
    }
}