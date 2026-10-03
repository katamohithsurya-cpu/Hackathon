import java.util.Scanner;

public class MuncipalMethods {
    
    public static double calculateTotalWaste(double p1Waste, double p2Waste) {
        return p1Waste + p2Waste;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Waste collected at Point 1 (kg): ");
        double point1 = sc.nextDouble();

        System.out.print("Enter Waste collected at Point 2 (kg): ");
        double point2 = sc.nextDouble();

        double total = calculateTotalWaste(point1, point2);

        System.out.println("Total Waste Collected: " + total + " kg");

        sc.close();
    }
}
