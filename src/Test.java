import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String a="kot";
        String b =null;
        while ((!a.equals(b)) || (!b.equals("exit"))){
           System.out.println("Input your word, for exit write - exit -: ");
           Scanner in = new Scanner(System.in);
           b = in.next().toLowerCase();


           if (a.equals(b) == true) {
               System.out.println(true);
           } else {
               System.out.println(false);
           }

           System.out.println(a.equals(b));
           System.out.println(b.equals("exit"));
           System.out.println(!a.equals(b) || !b.equals("exit"));

       }
        // while ((!a.equals(b)));
       //while (!b.equals("exit"));
        System.out.println("The End");
    }
}
