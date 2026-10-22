import java.util.Scanner;
public class P06_conditionalstatements {
    public static void main(String args[]){
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter age :"); 
        age = sc.nextInt();

        if(age >= 18 ){
            System.out.println("eligible for licence");
        } else {
            System.out.println("not eligible");
        }
    }   
}
