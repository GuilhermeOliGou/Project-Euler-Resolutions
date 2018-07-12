public class problem9{
    public static void main(String[] args){
    	for (int i = 3; i < 1000; i++){
            for (int j = 4; j < 1000; j++){
                for (int k = 5; k < 1000; k++){
                    if ((i*i + j*j == k*k) && (i < j) && (j < k) && (i+j+k == 1000)){
                        System.out.println(i*j*k);
                    }
                }
            }
    	}
    }
}