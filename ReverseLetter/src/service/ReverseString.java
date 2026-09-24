public class ReverseString {

    public String reverseLetters(String input) {
        if (input == null) {
            return null;
        }

        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            while (!Character.isLetter(chars[left]) || !Character.isLetter(chars[right])) { // цикл скипает "не буквы", если счётчики выходят за пределы - прерывается
                if (!Character.isLetter(chars[left])) {
                    left++;
                }
                if (!Character.isLetter(chars[right])) {
                    right--;
                }
                if (left > right) {
                    break;
                }
            }
            if (Character.isLetter(chars[left]) && Character.isLetter(chars[right])) { // условие нужно для случаев, когда в строке нет букв (без этого условия "не буквы" поменяются местами в месте встречи left и right)
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                right--;
                left++;
            }

        }

        return new String(chars);
    }
}
