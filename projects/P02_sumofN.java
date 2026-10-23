import java.util.Scanner;
public class P02_sumofN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The inserted value is :" + n);
        int sum = 0;
        for(int i=0; i<=n; i++ ){
            sum = sum +i;
        }

        System.out.println("The sum of value upto n is : " + sum);
    }
    
}
