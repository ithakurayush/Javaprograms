import java.util.Scanner;
public class P13_parameterisedMethod {
    static void sum(float x , int y){
        System.out.println(x+y);
    }
    // wheneve you are taking float value write 5.5f ......at the end of digit you have to write f

    public static void calculator(int a , int b){
        Scanner sc = new Scanner(System.in);

        int sum = a + b;
        System.out.println("Sum :" + sum);
        int mul = a * b;
        System.out.println("Multiply :" + mul);
        int div = a / b;
        System.out.println("Divide :" + div);
    }

    public static void main(String[] args) {
        System.out.println("parameterised method :");
        sum(5.3f,6);
        // return ;


        Scanner sc = new Scanner(System.in);
        System.out.print("enter the a :");
        int a = sc.nextInt();
        System.out.print("enter the b :");
        int b = sc.nextInt();

        calculator(a,b);
    }
}
 