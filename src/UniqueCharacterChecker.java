/**
 * The UniqueCharacterChecker class provides a method to check if all characters
 * in a given word are unique.
 */
import java.util.HashSet;
import java.util.Set;

public class UniqueCharacterChecker {

    /**
     * Checks if a given word has all unique characters.
     *
     * @param word the string to be checked for unique characters
     * @return true if all characters in the word are unique; false otherwise
     */
    public static boolean hasUniqueCharacters(String word) {
        Set<Character> seen = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (seen.contains(ch)) {
                return false;
            }

            seen.add(ch);
        }

        return true;
    }


    public static void main(String[] args) {
        String word1 = "hello";
        String word2 = "world";
        String word3 = "abcdefg";

        System.out.println(word1 + " has unique characters: " + hasUniqueCharacters(word1));
        System.out.println(word2 + " has unique characters: " + hasUniqueCharacters(word2));
        System.out.println(word3 + " has unique characters: " + hasUniqueCharacters(word3));
    }
}
