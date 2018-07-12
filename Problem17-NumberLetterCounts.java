public class Problem17 {
    public static void main(String[] args) {
        int lettersAnd = 3,letters1 = 3, letters2 = 3, letters3 = 5, letters4 = 4, letters5 = 4, letters6 = 3, letters7 = 5, letters8 = 5, letters9 = 4, letters10 = 3, letters11 = 6, letters12 = 6, letters13 = 8, letters14 = 8, letters15 = 7, letters16 = 7, letters17 = 9, letters18 = 8, letters19 = 8, letters20 = 6, letters30 = 6, letters40 = 5, letters50 = 5, letters60 = 5, letters70 = 7, letters80 = 6, letters90 = 6, letters100 = 7, letters1000 = 8;
        int sum = 0;
        boolean and1 = false, and2 = false;
        for (int i = 1; i <= 1000; i++){
            switch(i/100){
                case 1 : sum += letters100 + letters1;
                and1 = true;
                break;
                case 2 : sum += letters100 + letters2;
                and1 = true;
                break;
                case 3 : sum += letters100 + letters3;
                and1 = true;
                break;
                case 4 : sum += letters100 + letters4;
                and1 = true;
                break;
                case 5 : sum += letters100 + letters5;
                and1 = true;
                break;
                case 6 : sum += letters100 + letters6;
                and1 = true;
                break;
                case 7 : sum += letters100 + letters7;
                and1 = true;
                break;
                case 8 : sum += letters100 + letters8;
                and1 = true;
                break;
                case 9 : sum += letters100 + letters9;
                and1 = true;
                break;
                case 10 : sum += letters1000 + letters1;
                and1 = true;
                break;
                default :
                break;
            }
            switch(i%100){
                case 1 : sum += letters1;
                and2 = true;
                break;
                case 2 : sum += letters2;
                and2 = true;
                break;
                case 3 : sum += letters3;
                and2 = true;
                break;
                case 4 : sum += letters4;
                and2 = true;
                break;
                case 5 : sum += letters5;
                and2 = true;
                break;
                case 6 : sum += letters6;
                and2 = true;
                break;
                case 7 : sum += letters7;
                and2 = true;
                break;
                case 8 : sum += letters8;
                and2 = true;
                break;
                case 9 : sum += letters9;
                and2 = true;
                break;
                case 10 : sum += letters10;
                and2 = true;
                break;
                case 11 : sum += letters11;
                and2 = true;
                break;
                case 12 : sum += letters12;
                and2 = true;
                break;
                case 13 : sum += letters13;
                and2 = true;
                break;
                case 14 : sum += letters14;
                and2 = true;
                break;
                case 15 : sum += letters15;
                and2 = true;
                break;
                case 16 : sum += letters16;
                and2 = true;
                break;
                case 17 : sum += letters17;
                and2 = true;
                break;
                case 18 : sum += letters18;
                and2 = true;
                break;
                case 19 : sum += letters19;
                and2 = true;
                break;
                default:
                switch((i/10)%10){
                    case 2 : sum += letters20;
                    and2 = true;
                    break;
                    case 3 : sum += letters30;
                    and2 = true;
                    break;
                    case 4 : sum += letters40;
                    and2 = true;
                    break;
                    case 5 : sum += letters50;
                    and2 = true;
                    break;
                    case 6 : sum += letters60;
                    and2 = true;
                    break;
                    case 7 : sum += letters70;
                    and2 = true;
                    break;
                    case 8 : sum += letters80;
                    and2 = true;
                    break;
                    case 9 : sum += letters90;
                    and2 = true;
                    break;
                    default :
                    break;
                }
                switch (i%10){
                    case 1 : sum += letters1;
                    and2 = true;
                    break;
                    case 2 : sum += letters2;
                    and2 = true;
                    break;
                    case 3 : sum += letters3;
                    and2 = true;
                    break;
                    case 4 : sum += letters4;
                    and2 = true;
                    break;
                    case 5 : sum += letters5;
                    and2 = true;
                    break;
                    case 6 : sum += letters6;
                    and2 = true;
                    break;
                    case 7 : sum += letters7;
                    and2 = true;
                    break;
                    case 8 : sum += letters8;
                    and2 = true;
                    break;
                    case 9 : sum += letters9;
                    and2 = true;
                    break;
                    default :
                    break;
                }
            }
            if (and1 && and2)
                sum += lettersAnd;
            and1 = false;
            and2 = false;
        }
        System.out.println(sum);
    }    
}