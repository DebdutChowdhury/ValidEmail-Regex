import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
    public static boolean IsEmailMatch(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
//        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Valid Email using regex:");
        System.out.println("---------------------------");

        String p1 = "abc@google.co";
        System.out.println(p1 + " ==> " +IsEmailMatch(p1));

        String p2 = "abc-100@yahoo.com";
        System.out.println(p2 + " ==> " +IsEmailMatch(p1));

        String p3 = "abc.100@yahoo.com";
        System.out.println(p3 + " ==> " +IsEmailMatch(p1));

        String p4 = "abc111@abc.com";
        System.out.println(p4 + " ==> "+IsEmailMatch(p4));

        String p5 = "abc-100@abc.net";
        System.out.println(p5 + " ==> "+IsEmailMatch(p5));

        String p6 = "abc100@abc.com.au";
        System.out.println(p6 + " ==> "+IsEmailMatch(p6));

        String p7 = "abc@1.com";
        System.out.println(p7 + " ==> "+IsEmailMatch(p7));

        String p8 = "abc100@abc.com.com";
        System.out.println(p8 + " ==> "+IsEmailMatch(p8));

        String p9 = "abc+100@gmail.com";
        System.out.println(p9 + " ==> "+IsEmailMatch(p9));
    }
}
