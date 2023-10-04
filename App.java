import java.util.Scanner;

public class App {

    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("CALCULATOR");
        System.out.println("--------------");
        String userprompt = "Enter your name";
        String response = getString(userprompt);
    
            
            while (rerun.equals("Y")){
            System.out.println("hello " + response + ", please enter a number!");
            double num1 = scan.nextDouble();
            System.out.println("The number you entered is: " + num1 + ", please enter 1 more number.");
            double num2 = scan.nextDouble();
            System.out.println("The numbers you submitted are: " + num1 + " and " + num2 + ".");
            Calculator calc = new Calculator();
            double result = calc.add(num1, num2);
            double result2 = calc.subtract(num1, num2);
            double result3 = calc.multiply(num1, num2);
            double result4 = calc.divide(num1, num2);
            System.out.println("If you add those numbers you get: " + result + ". If you subtract those numbers you get: " + result2 + ". If you mulitply those numbers you get: " + result3 + ". If you divide those numbers you get: " + result4 + ".");
            System.out.println("Would you like to keep using the calculator?(Y/N)");
            String rerun = scan.nextLine();
            System.out.println("Goodbye!");
            

        
        }

        

    
        
    }

    private static String getString(String prompt) {
        System.out.println(prompt);
        return scan.nextLine();
    }

    private static double getDouble(String prompt) {
        double num1 = scan.nextDouble();
        System.out.println(prompt);
        return getDouble(prompt);
    }

}
