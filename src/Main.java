import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Bulls and Cows game!");
//
//        System.out.println();
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a number: ");
//        String word= in.next();
//        System.out.println(" Your words is  : %s  \n", word);
//        System.out.println("The End :)");


        readFile();


    }


    private static void readFile(){
        BufferedReader br;
        String line=null;
        try {
            br = new BufferedReader(new FileReader("words.txt"));

            while ((line=br.readLine())!= null) {

                System.out.println(line);
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
