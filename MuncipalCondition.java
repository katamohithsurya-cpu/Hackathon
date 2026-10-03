import java.util.Scanner;

class MuncipalCondition {
    public static void main(String[]args) {
         
    
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the waste collected in kg: ");
        double wastecollectedkg = sc.nextDouble();

        if (wastecollectedkg >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required" );
        }

    }
}    