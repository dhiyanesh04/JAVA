import java.util.Scanner;
public class miniProject {
    public static void main(String[] args) {
        //Mini project
        Scanner sc =new Scanner(System.in);
        int myNumber = (int)(Math.random()*10);
        int userNumber;
        do{
            System.out.println("Guess my number between 1 - 10");
            userNumber = sc.nextInt();
            if(userNumber == myNumber){
                System.out.println("Correct Number");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("Your number is large");
            }
            else{
                System.out.println("Your number is small");
            }
        }
        while(userNumber>=100);
        System.out.println("My number was");
        System.out.println(myNumber);
    }
}
