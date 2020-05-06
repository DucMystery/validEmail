import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeRegex {

    private static Pattern pattern;
    private static Matcher matcher;

    private static final String EMAIL_REGEX = "^\\w+\\w*@\\w+(\\.\\w+)$";

    public PracticeRegex(){
        pattern =Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
