// copy pass kar rahe ho 
public class P15_callByValue {
    static void solve(int num) {
        System.out.println("inside solve :" + num);
        num = num * 10 ;
        System.out.println("inside solve :" + num );
    }
    public static void main(String arg[]){
        int num = 5; 
        System.out.println("inside main :" + num);
        solve(num);
        System.out.println("inside main :" + num);
    }
}
