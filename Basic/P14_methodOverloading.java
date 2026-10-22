public class P14_methodOverloading {

    static int add(int x , int y) {
        return x + y ;
    }

    static int add (int a, int b, int c){
        return a + b + c ;
    }

    public static void main(String arg[]){
        System.out.println(add(5,10));
        System.out.println(add(7,8,9));     // no of parameter decide which code will executed or take value
    }
}
