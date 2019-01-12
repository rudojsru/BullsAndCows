import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        String a="kot";
//        String b ="";
//        do {
//           System.out.println("Input your word, for exit write - exit -: ");
//           Scanner in = new Scanner(System.in);
//           b = in.next().toLowerCase();
//
//
//
//
//           System.out.println(a.equals(b));
//           System.out.println(b.equals("exit"));
//            System.out.println((a.equals(b)) || (b.equals("exit")));
//           System.out.println((a.equals(b) ==true) || (b.equals("exit")==true));
//
//       }while ((a.equals(b)  || b.equals("exit"))==false);
//        // while ((!a.equals(b)));
//       //while (!b.equals("exit"));
//        System.out.println("The End");
        int a=5;
        int b=0;
        do{
            Scanner in = new Scanner(System.in);{
                  b= in.nextInt();

            }
            System.out.println(a<b);
        } while (a<b);
        System.out.println("konec");
    }
}
