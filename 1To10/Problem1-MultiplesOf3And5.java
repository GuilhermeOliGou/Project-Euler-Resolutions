public class Problem1{
    public static void main(String[] args){
        int result = 0;
        int N = 1000;
        for (int i=0; i <N;i++){
            if(i%3 == 0 && i%5 != 0){
                result += i;
            }
            if(i%5 == 0){
            result += i;
            }
        }
        System.out.println(result);
    }
}
