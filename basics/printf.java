public class printf {
    public static void main (String[]args){
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
