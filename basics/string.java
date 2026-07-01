public class string {
    public static void main(String[] args) {

        // Creating String variables
        String name = "Shruti Shinde";
        String name1 = "Shinde Shruti";
        String name2 = "Shruti Shinde";
        String name3 = "Me and You";

        // Returns the total number of characters in the string
        int length = name.length();

        // Returns the character at the specified index (0 = first character)
        char letter = name.charAt(0);

        // Returns the index of the first occurrence of the character 'o'
        // If not found, it returns -1
        int index = name.indexOf("o");

        // Returns the index of the last occurrence of the character 'i'
        int lastIndex = name.lastIndexOf("i");

        // Converts all characters to uppercase
        name = name.toUpperCase();

        // Converts all characters to lowercase
        name1 = name1.toLowerCase();

        // Removes leading and trailing spaces (if any)
        name2 = name2.trim();

        // Replaces the word "Me" with "You"
        name3 = name3.replace("Me", "You");

        // Prints the length of the string
        System.out.println(length);

        // Prints the first character
        System.out.println(letter);

        // Prints the index of the first 'o'
        System.out.println(index);

        // Prints the index of the last 'i'
        System.out.println(lastIndex);

        // Prints the uppercase version of name
        System.out.println(name);

        // Prints the lowercase version of name1
        System.out.println(name1);

        // Prints the trimmed version of name2
        System.out.println(name2);

        // Prints the modified string after replacement
        System.out.println(name3);

        // Checks if the string is empty (returns true or false)
        System.out.println(name.isEmpty());

        // Checks if name and name2 are exactly equal (case-sensitive)
        System.out.println(name.equals(name2));

        // Checks if name and name2 are equal, ignoring uppercase/lowercase differences
        System.out.println(name.equalsIgnoreCase(name2));
    }
}