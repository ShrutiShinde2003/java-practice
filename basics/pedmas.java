public class pedmas {
    public static void main(String[] args) {
       
        //ORDER OF OPERATIONS [P-E-D-M-A-S]
        //parentheses, exponents, division, multiplication, addition, subtraction

         double result = 3 + 4 * 2 / (1 - 5) * 2 + 3;
        //3 + 4 * 2 / -4 * 2 + 3
        //3 + 4 * -0.5 * 2 + 3
        //3 - 4 + 3
        //2
        System.out.println(result);

    }
}
