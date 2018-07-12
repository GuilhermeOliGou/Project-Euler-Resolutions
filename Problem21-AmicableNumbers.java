public class Problem21 {
    public static void main(String[] args) {
        int sum = 0, current;
        for (int i = 1; i <= 10000; i++){
            current = ProperDivisorSum(i);
            if (i == ProperDivisorSum(current) && i != current)
                sum += i;
        }
        System.out.println(sum);
    }   
    public static int ProperDivisorSum (int x){
        int partialSum = 0;
        for (int j = 1; j <= x; j++){
            if (x % j == 0){
                partialSum += j;
            }
        }
        partialSum-= x;
        return partialSum;
    }
}
