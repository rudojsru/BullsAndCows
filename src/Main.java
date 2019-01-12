import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         System.out.println("Welcome to Bulls and Cows game!");


        System.out.println(readFile());
        int howMuchWords = readFile().size();
        System.out.println(howMuchWords);
        int numberofWordfromList = (int) (Math.random()*howMuchWords);
        System.out.println(numberofWordfromList);
        String secretWord = (String) readFile().get(numberofWordfromList);

         System.out.println(secretWord);


        System.out.println();
        Scanner in = new Scanner(System.in);
        String word=null;
        do{
            System.out.println("Input your word (for open secret word write - exit): ");
            word= in.next().toLowerCase();

            int counterWord=word.split("").length;
            int counterSecretWord=secretWord.split("").length;
            if(counterWord <=counterSecretWord ) {
                checkingForBullsAndCows( secretWord, word);
            }else{
                System.out.println(" Too much letters in this word. \n ----------");
            }

            
        }
         while (((word.equals(secretWord)) || (word.equals("exit"))) == false);  // - doesnt work why????


        System.out.println("------------------");
        System.out.println("Sycret word was:  "+secretWord+ ". Congratulations!!! \n  You are Won!!!");
        System.out.println("     The End :)");



    }

    private static void checkingForBullsAndCows( String secretWord, String word) {
        char [] givenNumberArray=word.toCharArray();
        char [] secretWordArray=secretWord.toCharArray();
        char [] secretWordArrayDublicat =secretWord.toCharArray();

        int bulls=0;
        int cows=0;
        int minWords=givenNumberArray.length;



        for (int i=0; i<minWords; i++){
            if(givenNumberArray[i] == secretWordArray[i]) {
               bulls++;
               secretWordArrayDublicat[i]=0;
            } else {

                for (int j=0; j<minWords; j++) {

                    if ( givenNumberArray[i] == secretWordArrayDublicat[j] && givenNumberArray[j]!=secretWordArray[j]){

                        cows++;
                        secretWordArrayDublicat[j]=0;
                         break;
                    }
                }
            }
        }
        System.out.println( "Bulls = "+bulls+",  Cows = "+cows);
    }


    private static List readFile(){
        BufferedReader br;
        String line=null;
        List list=new ArrayList();
        try {
            br = new BufferedReader(new FileReader("words.txt"));

            while ((line=br.readLine())!= null) {

        //        System.out.println(line);
                list.add(line);

            }
            br.close();
            System.out.println("---------------");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
