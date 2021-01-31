import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
    public static boolean IsEmailMatch(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z+_.-]+@[a-zA-Z.-]+$");
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
//        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Valid Email using regex:");
        System.out.println("---------------------------");

        String p1 = "abc@bridgelabz.co";
        System.out.println(p1 + " ==> " +IsEmailMatch(p1));

        String p2 = "abc@bridgelabz";
        System.out.println(p2 + " ==> " +IsEmailMatch(p1));

        String p3 = "abc@bridgelabz.co";
        System.out.println(p3 + " ==> " +IsEmailMatch(p1));

        String p4 = "abc.xyz@bridgelsbz.co.in";
        System.out.println(p4 + " ==> "+IsEmailMatch(p4));
    }
}

