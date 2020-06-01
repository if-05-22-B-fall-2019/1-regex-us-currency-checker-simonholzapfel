import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsCurrencyChecker {
    public static Matcher getMatcher(String usCurrencyString) {
        String regex = "";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(usCurrencyString);
    }
}
