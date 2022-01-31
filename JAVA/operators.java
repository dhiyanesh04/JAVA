import java.util.Scanner;
public class operators {
    public static void main(String[] args) {
        //arithmetic operators +,-,*,%,/
        float a = 1.6F;
        float b = 3.7F;
        int c = (int)b + (int)a;
        System.out.println(c);
        //unary operators
        c++;
        System.out.println(c);
        --c;
        System.out.println(c);
        ++c;
        System.out.println(c);
        c--;
        System.out.println(c);
        //comparison operators ==,!=,<,>,<=,>=
        //logical operators && , || , !
        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();
        if(cash<10){
            System.out.println("cant buy any thing get cash");
        }
        else if(cash>10 && cash<10){
            System.out.println("can buty one thing");
        }
        
    }
}
