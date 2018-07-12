package javaapplication1;
import java.util.LinkedList;
import java.util.List;
public class JavaApplication1 {    
    public static void main(String[] args) {
        int sum = 276, aux = 1;
        List<Integer> abuNumbers = new LinkedList<>();
        for (int  i = 24; i < 28123; i++){
            sum += isAbuSum(i, abuNumbers);
            if (i%6 != 0 && i%20 != 0 && i%28 != 0 && i%70 != 0){
                for (int j = 2; j <= i/2; j++)
                    if (i%j == 0)
                        aux += j;   
                if(aux > i)
                    abuNumbers.add(i);
            aux = 1;
            }
        }
        System.out.println(sum);
    } 
    public static int isAbuSum(int i,List<Integer> L){
        if (i >= 56 && i%2 == 0)
            return 0;
        else if (i >= 24 && i%6 == 0)
            return 0;
        else if (i%20 == 0)
            return 0;
        else if (i >= 112 && i%28 == 0)
            return 0;
        else if (i%70 == 0)
            return 0;
        return i;
    }
}