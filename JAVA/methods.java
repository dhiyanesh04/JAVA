import java.security.PublicKey;

public class methods {
    public static void printJava(){
    System.out.println("Hello JAVA");
    }
    public static void printName(String name){
        System.out.println(name);
    }
    public static int printSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
    //methods
    printJava();
    printName("Dhiyanesh");
    System.out.println(printSum(2,4)); 
    }
}
