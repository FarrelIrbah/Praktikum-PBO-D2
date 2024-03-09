public class UserInputValidator {
    public static void validateUsername(String username) {
        if (!username.matches("[a-zA-Z][a-zA-Z0-9_]+") ||
                username.length() < 5 || username.length() > 20) {
            throw new IllegalArgumentException("Invalid username! Username must be 5-20 characters long, start with a letter, and can only contain letters, digits, and underscore.");
        }
    }

    public static void validateEmail(String email) {
        if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            throw new IllegalArgumentException("Invalid email address!");
        }
    }

    public static void validateAge(int age) {
        if (age < 17 || age > 99) {
            throw new IllegalArgumentException("Invalid age! Age must be between 17 and 99.");
        }
    }
}