package ru.study;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ru.study.service.ReverseString;

public class ReverseStringTest {
    private final ReverseString reverseString = new ReverseString();

    @Test
    public void reverseString_stringWithSymbols_reverseOnlyLetters() {
        String result = reverseString.reverseLetters("J@va the be$t!123");
        assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    public void reverseString_emptyString_emptyString() {
        String result = reverseString.reverseLetters("");
        assertEquals("", result);
    }

    @Test
    public void reverseString_oneLetterInString_letterStaysOnThePlace() {
        String result = reverseString.reverseLetters("a");
        assertEquals("a", result);
    }

    @Test
    public void reverseString_zeroLetters_stringStaysTheSame() {
        String result = reverseString.reverseLetters("123$0$!@");
        assertEquals("123$0$!@", result);
    }

    @Test
    public void reverseString_onlyLettersInString_fullReverseOfString() {
        String result = reverseString.reverseLetters("Hello");
        assertEquals("olleH", result);
    }

    @Test
    public void reverseString_nonLettersLeftRightCenter_onlyLettersSwap() {
        String result = reverseString.reverseLetters("12hi@$ok34");
        assertEquals("12ko@$ih34", result);
    }

    @Test
    public void reverseString_withCapitalLetters_lettersReverseAsCapital() {
        String result = reverseString.reverseLetters("HeSoYaM123");
        assertEquals("MaYoSeH123", result);
    }

    @Test
    public void reverseString_nullInput_returnsNull() {
        String result = reverseString.reverseLetters(null);
        assertNull(result);
    }

}
