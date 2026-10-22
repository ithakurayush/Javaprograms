import java.util.Scanner;
public class P07_switchCase {
    public static void main(String[] args) {
        int choice;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice");
        choice = sc.nextInt();

    

        switch(choice){
            case 1 : System.out.println("Samosa");
            break;

            case 2 : System.out.println("chay");
            break;

            case 3 : System.out.println("patties");
            break;

            case 4 : System.out.println("biryani");
            break;

            case 5 : System.out.println("badapav");
            break;
            
            default: System.out.println("nikal pehli fursat me");
        }
    }
    
}
