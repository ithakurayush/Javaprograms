import java.util.Scanner;
public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();       // both data type will be same otherwise lossy
        int sum = a + b ;
        System.out.println("Output is :" + sum);

        char ch = 'B';
        int value = ch;
        System.out.println("output is :" + value);


    }
}