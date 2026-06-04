import java.util.Random;

public class random {
    public static void main (String[] args) 
{
    Random random = new Random();

    int number = random.nextInt(100);

    System.out.println("Random number between 0 and 99: " + number);
}
}