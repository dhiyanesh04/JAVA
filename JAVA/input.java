import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //taking input from user
        //scanner is class sc is object
        Scanner sc =new Scanner(System.in);
        System.out.println("Input your age");
        //.nextDatatype(); is a function in scanner class
        int age = sc.nextInt();
        System.out.println(age);
        System.out.println("Input float");
        Float a = sc.nextFloat();
        System.out.println(a);
        //.next(); is a funtion used to scan string
        System.out.println("Input string");
        String b = sc.next();
        System.out.println(b);
        //.nextLine(); is a funtion used to scan whole tokens string
        System.out.println("Input Line");
        String c = sc.nextLine();
        System.out.println(c);
    }
}
