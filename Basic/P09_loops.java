import java.util.Scanner;
public class P09_loops {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
         
        System.out.println(a*2);
        for(int i = 1; i<10; i++){
            System.out.print(a*i);
            System.out.println();
        }
    }
}

