import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsCurrencyChecker {
    public static Matcher getMatcher(String usCurrencyString) {
        String regex = "\\$\\s*\\d*(.\\d\\d?)?";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(usCurrencyString);
    }
}
