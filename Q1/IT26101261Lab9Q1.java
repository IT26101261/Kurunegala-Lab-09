import java.util.Scanner;

public class IT26101261Lab9Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     
        System.out.print("Enter value a: ");
        double a = input.nextDouble();

        System.out.print("Enter value b: ");
        double b = input.nextDouble();

        System.out.print("Enter value c: ");
        double c = input.nextDouble();

        
        double bSquared = Math.pow(b, 2);
        double fourAC = 4 * a * c;
        
        
        double insideRoot = bSquared - fourAC; 
        double squareRootValue = Math.sqrt(insideRoot);

        
        double root1 = (-b + squareRootValue) / (2 * a);
        double root2 = (-b - squareRootValue) / (2 * a);

        
        System.out.println();
        System.out.println("Roots are real and different :");
        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);

        input.close();
    }
}
