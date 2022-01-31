public class stringFunctions {
    public static void main(String[] args) {
        String first_name = "Dhiyanesh";
        String last_name = " S";
        String name = first_name+ last_name;
        System.out.println(name);
        //charAt
        System.out.println(name.charAt(2));
        //length
        System.out.println(name.length());
        //replace
        String name1 = name.replace('D','T');
        System.out.println(name1);
        //substring
        System.out.print(name.substring(0,6));
        System.out.println("u");
    }
}
