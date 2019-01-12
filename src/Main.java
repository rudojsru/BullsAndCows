import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        String answer="y";   // if you want play a new game
        while (answer.equals("y")){  // for new gamme
            game();
            System.out.println(" Do You want play a new game Y/N? ");
            answer=in.next().toLowerCase();

            if (answer.equals("n")) break;


        }


    }

    private static void game() {
        System.out.println("Welcome to Bulls and Cows game!");


       /// System.out.println(readFile());
        int howMuchWords = readFile().size();
        int numberofWordfromList = (int) (Math.random()*howMuchWords);
        String secretWord = (String) readFile().get(numberofWordfromList);

       // System.out.println(secretWord);


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
         while (((word.equals(secretWord)) || (word.equals("exit"))) == false);  //


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
        String words= trackToFiles()+"words.txt";

        BufferedReader br;
        String line=null;
        List list=new ArrayList();
        try {
            br = new BufferedReader(new FileReader(words));

            while ((line=br.readLine())!= null) {

        //        System.out.println(line);
                list.add(line);

            }
            br.close();
        //    System.out.println("---------------");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static String trackToFiles() {
        String track=new File(".").getAbsolutePath();
        // System.out.println(track);

        String [] splitTrack =track.split("");
        //   System.out.println(splitTrack.length);
        track="";


        for (int i=0; i<splitTrack.length-1; i++){
            track+=splitTrack[i];

        }


       // System.out.println(track);
        return track;

    }

}
