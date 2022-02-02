public class exceptionHandling {
    public static void main(String[] args) {
        int[] marks = {97 , 98 , 95};
        try {
            System.out.println(marks[5]);
        }catch(Exception exception){
            //do someting after catching
        }
        System.out.println("hello World");
    }
}
