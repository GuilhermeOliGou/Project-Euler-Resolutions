public class Problem19 {
    public static void main(String[] args) {
        int day = 2, sundays = 0; 
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < 100; i++){
            for (int j = 0; j < 12; j++){
                if (day == 7)
                    sundays++;
                day += monthDays[j]%7;
                if (i > 0 && i%4 == 0 && j == 2)
                    day++;
                if (day > 7)
                    day -= 7;
            }
        }
        System.out.println(sundays);
    }    
}
