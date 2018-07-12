public class Problem3{
    public static void main(String[] args)  {
    	int largest = 0;
    	Long N = 600851475143L;
    	for(int i = 2; i <= N; i++){
            if(N%i == 0){
        	while(N%i == 0){
          	    N /= i;
        	}
                boolean prime = true;
                for (int j = 2; j < i; j++){
                    if (i%j == 0){
                        prime = false;
                        break;
                    }
                }
                if (prime == true){
                largest = i;
                } 
            }
    	}
    	System.out.println(largest);
    }
}