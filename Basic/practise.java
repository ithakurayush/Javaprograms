import java.util.Scanner;
public class practise {
    public static void main(String arg[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a:");
        int a = sc.nextInt();

        System.out.println("enter a:");
        int b = sc.nextInt();

        if(a%5==0){
            System.out.println( a + " is divisible by" + 5 );
        } else {
            System.out.println("nahi hai");
        }
    }
}
