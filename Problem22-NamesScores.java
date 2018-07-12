import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
public class Problem22 {    
    public static void main(String[] args) {
        String FILENAME = "Names.txt", rawNames = "";
        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr,1000);
            rawNames = br.readLine();
	}catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        rawNames = rawNames.replaceAll("\"", "");
        String[] names = rawNames.split(",");
        Arrays.sort(names);
        long sum = 0l;
        int aux;
        char[] chars;
        for (int  i = 0; i < names.length; i++){
            aux  = 0;
            chars = new char[names[i].length()];
            chars = names[i].toCharArray();
            for (Character c : chars){
                switch (c){
                    case 'A' : aux += 1;
                    break;
                    case 'B' : aux += 2;
                    break;
                    case 'C' : aux += 3;
                    break;
                    case 'D' : aux += 4;
                    break;
                    case 'E' : aux += 5;
                    break;
                    case 'F' : aux += 6;
                    break;
                    case 'G' : aux += 7;
                    break;
                    case 'H' : aux += 8;
                    break;
                    case 'I' : aux += 9;
                    break;
                    case 'J' : aux += 10;
                    break;
                    case 'K' : aux += 11;
                    break;
                    case 'L' : aux += 12;
                    break;
                    case 'M' : aux += 13;
                    break;
                    case 'N' : aux += 14;
                    break;
                    case 'O' : aux += 15;
                    break;
                    case 'P' : aux += 16;
                    break;
                    case 'Q' : aux += 17;
                    break;
                    case 'R' : aux += 18;
                    break;
                    case 'S' : aux += 19;
                    break;
                    case 'T' : aux += 20;
                    break;
                    case 'U' : aux += 21;
                    break;
                    case 'V' : aux += 22;
                    break;
                    case 'W' : aux += 23;
                    break;
                    case 'X' : aux += 24;
                    break;
                    case 'Y' : aux += 25;
                    break;
                    case 'Z' : aux += 26;
                    break;
                }
            }
            sum += aux*(i+1);
        }
        System.out.println(sum);
    } 
}