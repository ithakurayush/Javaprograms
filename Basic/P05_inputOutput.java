import java.math.BigInteger;
import java.util.Scanner;
public class P05_inputOutput {
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first num :");
        int firstNum = sc.nextInt();

        System.out.println("Enter your first num :");
        int secondNum = sc.nextInt();

        System.out.println( "The sum is :" + (firstNum + secondNum));

        System.out.println("Enter your big integer:");
        BigInteger bg = sc.nextBigInteger();
        System.out.println(bg);

        System.out.println("Enter your boolean:");
        boolean flag = sc.nextBoolean();
        System.out.println(flag);

        System.out.println("Enter your floating value :");
        float d = sc.nextFloat();
        System.out.println(d);

        System.out.println("enter you name");
        char ch = sc.next().charAt(0);

                System.out.println(ch);

        System.out.println("enter you name :");
        String name = sc.next();

        System.out.println(name);

        sc.close();

        // GARBAGE COLLECTOR

        

    }
}
