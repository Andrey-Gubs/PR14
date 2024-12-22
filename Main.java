import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String S1 = "abcdefghijklmnopqrstuv18340";
        String invalidS1 = "abcdefghijklmnoasdfasdpqrstuv18340";
        String invalidS2 = "abcdefghijklmnopqrstuv18340extra";

        String regex = "^abcdefghijklmnopqrstuv18340$";

        System.out.println("Тест true: " + S1);
        System.out.println("Результат: " + isMatch(S1, regex));
        System.out.println("Тест false: " + invalidS1);
        System.out.println("Результат: " + isMatch(invalidS1, regex)); 
        System.out.println("Тест false: " + invalidS2);
        System.out.println("Результат: " + isMatch(invalidS2, regex));
    }

    public static boolean isMatch(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(input).matches();
    }
}