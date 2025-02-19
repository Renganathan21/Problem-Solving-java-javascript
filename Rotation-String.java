import java.util.Arrays;

public class StringRotationCheck {
    public static void main(String[] args) {
        String s1 = "This is strieg";
        String s2 = "is string This";

        boolean result = isRotation(s1, s2);
        System.out.println("Are the strings rotations of each other? " + result);
    }

    public static boolean isRotation(String s1, String s2) {
        // Split strings by spaces
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        // If word count is not the same, they cannot be rotations
        if (words1.length != words2.length) {
            return false;
        }

        // Try every possible rotation of words2 and check if it matches words1
        for (int i = 0; i < words2.length; i++) {
            if (isArrayRotation(words1, words2, i)) {
                return true;
            }
        }

        return false;
    }

    // Function to check if words2 is a rotation of words1 starting at index shift
    public static boolean isArrayRotation(String[] words1, String[] words2, int shift) {
        int len = words1.length;

        for (int i = 0; i < len; i++) {
            if (!words1[i].equals(words2[(i + shift) % len])) {
                return false;
            }
        }

        return true;
    }
}
