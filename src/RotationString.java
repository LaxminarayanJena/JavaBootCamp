package webTest;

public class RotationString {
    public static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        String concatenated = s1 + s1;

        // Check if s2 is a substring of concatenated string
        if (concatenated.contains(s2))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "StrutsHibernateJavaJ2ee";

        if (areRotations(s1, s2))
            System.out.println("Strings are rotations of each other.");
        else
            System.out.println("Strings are not rotations of each other.");
    }
}
