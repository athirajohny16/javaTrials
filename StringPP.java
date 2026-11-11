
public class StringPP {

    public static void main(String[] args) {

        String str = "Java Programming";

        System.out.println(str.length()); //16
        System.out.println(str.charAt(0)); //J
        System.out.println(str.toUpperCase()); //JAVA PROGRAMMING
        System.out.println(str.contains("Java")); //true

        String a = new String("Java");
        String b = new String("Java");

        System.out.println(a == b);      // false
        System.out.println(a.equals(b)); // true

    }
}
