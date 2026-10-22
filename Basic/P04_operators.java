public class P04_operators {
    public static void main(String args[]){
        int a =23;
        int b = 10;

        // Arithmetic

        System.out.println("addition of a + b :" + (a+b));
        System.out.println("difference of a - b :" + (a-b));

        System.out.println("division of a + b :" + (a/b));
        System.out.println("multiplication of a - b :" + (a*b));

        System.out.println("average :" + (a+b)/2);
        System.out.println("modulas :" + (a%b));

        System.out.println();
        
        // Relational

        System.out.println("a equal to b :" + (a==b));
        System.out.println("a is not equal to b :" + (a!=b));

        System.out.println("a is greater than b:" + (a>b));
        System.out.println("a is less than b:" + (a<b));

        System.out.println("a is greater than equal to b:" + (a>=b));
        System.out.println("a is less than equal to b:" + (a<=b));

        System.out.println();

        // Logical 

        boolean c = true;
        boolean d = false;

        System.out.println(c&&d);
        System.out.println(c||d);

        System.out.println(!c);
        System.out.println(!d);

        System.out.println();

        // Assignment 

        System.out.println(a+=b);  // a = a + b;
        System.out.println(a-=b);  // a = a - b;
        System.out.println(a/=b);  // a = a / b;
        System.out.println(a*=b);  // a = a * b;
        System.out.println(a%=b);  // a = a % b;

        System.out.println();

        // UNARY 

        int m = 5;
        int n = 8;

        System.out.println(m);   
        System.out.println(n);

        System.out.println(++m);   // preincrement
        System.out.println(--n);   // predecrement

        System.out.println(m++);   // post increment
        System.out.println(n--);   // post decrement

        System.out.println(m);
        System.out.println(n);

        System.out.println();
    }
    
}
