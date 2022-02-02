import java.util.Scanner;

public class conditionalStatementsSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
           case 1 :
             System.out.println("monday");
             break;
           case 2:
            System.out.println("tuesday");
            break;
           case 3:
             System.out.println("wednesday");
             break;
            default :
             System.out.println("thursday to sunday");
        }
    }
}
