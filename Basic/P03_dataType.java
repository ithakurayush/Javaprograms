public class P03_dataType {
    public static void main(String args[]){
        
    // DATA TYPE ---- int , short , byte , long

    byte num1 = 127;    //(-128 to 127)

    System.out.println(num1);
    System.out.println((char)(num1-29));

    short num2 = 3267;     // 2 bytes (-32768 to 32767)
    System.out.println(num2);

    int num3 =78900;    // 4 bytes (-2,147,483,648 to 2,147,483,647)
    System.out.println(num3);
    
    long num4 = 45678906l; // 8 bytes (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
    System.out.println(num4);

    float num5 = 10.14f;   // 4 bytes (1.4e-45 to 3.4028235e38)
    System.out.println(num5);

    double num6 = 3.234565433; // 8 bytes (2.2250738585072014e-308 to 1.7976931348623157e308)
    System.out.println(num6);

    char ch = 'a';  // 2 bytes (0 to 65535)
    System.out.println(ch);
    System.out.println((char)(ch+2));

    boolean flag = true;
    System.out.println(flag);

    }
}
