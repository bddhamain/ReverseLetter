import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.study.service.ReverseString;

public class ReverseStringTest {
    private final ReverseString reverseString = new ReverseString();

    @Test
    public void reverse_string_reverseSymbols_inString() {
        String result = reverseString.reverseLetters("J@va the be$t!123");
        Assertions.assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    public void reverse_string_emptyString() {
        String result = reverseString.reverseLetters("");
        Assertions.assertEquals("", result);
    }

    @Test
    public void reverse_string_oneLetter_staysSame() {
        String result = reverseString.reverseLetters("a");
        Assertions.assertEquals("a", result);
    }

    @Test
    public void reverse_string_zeroLetters_staysSame() {
        String result = reverseString.reverseLetters("123$0$!@");
        Assertions.assertEquals("123$0$!@", result);
    }

    @Test
    public void reverse_string_onlyLetters_fullReverse() {
        String result = reverseString.reverseLetters("Hello");
        Assertions.assertEquals("olleH", result);
    }

    @Test
    public void reverse_string_nonSyllables_stayOnOnePlace() {
        String result = reverseString.reverseLetters("12hi@$ok34");
        Assertions.assertEquals("12ko@$ih34", result);
    }

    @Test
    public void reverse_string_withCapitalLetters() {
        String result = reverseString.reverseLetters("HeSoYaM123");
        Assertions.assertEquals("MaYoSeH123", result);
    }

    @Test
    public void reverse_string_nullInput() {
        String result = reverseString.reverseLetters("null");
        Assertions.assertEquals("llun", result);
    }


}
