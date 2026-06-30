public class nestedif {
    public static void main(String[] args) {

        // Customer information
        boolean isStudent = true;
        boolean isSenior = true;

        // Original price of the item
        double price = 9.99;

        // First, check if the customer is a student
        if (isStudent) {

            // If the customer is also a senior citizen
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");

                // Apply a total 30% discount (customer pays 70% of the price)
                price *= 0.7;
            }

            // Customer is a student but NOT a senior
            else {
                System.out.println("You get a student discount of 10%");

                // Apply a 10% discount (customer pays 90% of the price)
                price *= 0.9;
            }

        }

        // Customer is NOT a student
        else {

            // Check if the customer is a senior citizen
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");

                // Apply a 20% discount (customer pays 80% of the price)
                price *= 0.8;
            }

            // Customer is neither a student nor a senior
            else {

                // No discount is applied
                price *= 1;
            }
        }

        // Display the final price with 2 decimal places
        System.out.printf("Final price: $%.2f", price);
    }
}