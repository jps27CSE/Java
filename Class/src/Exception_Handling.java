public class Exception_Handling {
    public static void main(String[] args) {
        try {
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Rest of the code");
        }
    }
}
