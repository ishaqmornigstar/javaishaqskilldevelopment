public class typecasting {
    public static void main(String[] args) {
            int a = 10;
            double b = 20.5;
            double c = a + b; // Implicit typecasting
            System.out.println("The value of c is: " + c);
            
            double d = 30.7;
            int e = (int) d; // Explicit typecasting
            System.out.println("The value of e is: " + e);
        }
    
}
