public class printf {
    public static void main (String[]args){
        // printf() = is a method used to format output
        // %[flags][width][.precision][specifier-character]
        
        // + = output a plus
        // - = left-justify the output
        // 0 = zero-padding
        // , = comma grouping separator
        // (width) = minimum number of characters to be printed
        // .(precision) = number of digits after the decimal point for floating-point numbers
        // specifier-character = type of data to be formatted
        // space = output a space before positive numbers
        // ( = enclose negative numbers in parentheses))
        
        // Common format specifiers:
        // %d for integers
        // %f for floating-point numbers
        // %s for strings
        // %c for characters    

        String name = "Shruti";
        int age = 22;
        double height = 5.4;
        boolean isStudent = true;

        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Height: %.1f\n", height); // .1f for one decimal place
        System.out.printf("Is Student: %b\n", isStudent);

        System.out.printf("Hello, %s! You are %d years old and %.1f feet tall.\n", name, age, height);
    }
}
