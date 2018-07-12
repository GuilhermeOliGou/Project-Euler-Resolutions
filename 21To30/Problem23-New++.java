package javaapplication1;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
public class JavaApplication1 {    
    public static void main(String[] args) {
        int sum = 276, aux  = 0;
        List<Integer> abuNumbers = new LinkedList<>(Arrays.asList(6, 20, 28, 496, 8128));
        for (int  i = 24; i < 28123; i++){
            System.out.println(i);
            sum += isAbuSum(i, abuNumbers);    
        }
        System.out.println(sum);
    } 
    public static int isAbuSum(int i,List<Integer> L){
        if (i >= 56 && i%2 == 0)
            return 0;
        for (int  j = 0; j < L.size(); j++)
            for (int k = 0; k < (i-(i%L.get(j)))/L.get(j); k++)
                for (int  h = 0; h < L.size(); k ++)
                    if ((i-(L.get(j)*k))%L.get(h)==0)
                        return 0;
        return i;
    }
}