import java.util.Scanner;
public class P08_ternaryOperator {
    public static void main(String[] args) {
        int age;

        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        System.out.println("enter age :");

        String status = (age >= 18) ? "eligible": "not eligible";
        System.err.println(status);
    }
    
}
