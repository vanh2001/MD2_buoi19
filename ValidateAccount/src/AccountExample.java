import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {

    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    private Pattern pattern;
//    Không chứa các ký tự đặc biệt
//    Phải dài hơn 6 ký tự
//    Không chứa các ký tự viết hoa
//    Cho phép dấu gạch dưới (_)
    public AccountExample(){
        pattern = Pattern.compile(ACCOUNT_REGEX);
    }
    public boolean validate(String regex){
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
