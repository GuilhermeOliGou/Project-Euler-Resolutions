public class Problem2{
    public static void main(String[] args)  {
    	int num1 = 1;
    	int num2 = 1;
    	int result = 0;
    	while(num2 <= 4000000){
      	    int aux = num2;
      	    num2 += num1;
            num1 = aux;
      	    if(num2%2 == 0){
        	result += num2;
      	    }
    	}
    	System.out.println(result);
    }
}