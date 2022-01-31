import java.util.Arrays;
public class arrays {

    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0]=100;
        marks[1]=96;
        marks[2]=94;
        int[] marks1 = {23,43,56};
        int[][] finalmarks={{27,23,24},{23,34,34}};
        System.out.println(marks[0]);
        System.out.println(finalmarks[1][2]);
        //length
        System.out.println(marks.length);
        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

    }
}
