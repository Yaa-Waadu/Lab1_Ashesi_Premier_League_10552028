//Task 10:
import java.util.Scanner;

public class Lab1_Ashesi_Premier_League_10552028{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter player name: ");
        String name = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter jersey number: ");
        int jersey = input.nextInt();

        // Conversions
        final double POUND = 0.45359237;
        final int METER = 100;
        int heightCm = (int) (height * METER);
        int weightKg = (int) (weight * POUND);

        // Category
        String category;
        if (age < 20) category = "Rising Star";
        else if (age <= 30) category = "Prime Player";
        else category = "Veteran";

        // Position
        String position;
        switch (jersey) {
            case 1: position = "Goalkeeper"; break;
            case 2: case 5: position = "Defender"; break;
            case 6: case 8: position = "Midfielder"; break;
            case 7: case 11: position = "Winger"; break;
            case 9: position = "Striker"; break;
            case 10: position = "Playmaker"; break;
            default: position = "Unknown"; 
        }

        // Attacker numbers (7,9,10,11)
        boolean isAttacker = (jersey == 7 || jersey == 9 || jersey == 10 || jersey == 11);

        // Eligibility
        boolean eligible = (age >= 18 && age <= 35 && weightKg < 90);

        // Lineup (nested if)
        String lineupDecision;
        if (category.equals("Prime Player")) {
            if (weightKg < 80) lineupDecision = "Starting Lineup";
            else lineupDecision = "Bench";
        } else {
            lineupDecision = "Bench";
        }

        // Final decision (ternary)
        String finalDecision = eligible ? "Play" : "Rest";

        // Report
        System.out.println("\n=== Player Report ===");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age + " (" + category + ")");
        System.out.println("Height: " + heightCm + "cm");
        System.out.println("Weight: " + weightKg + "kg");
        System.out.println("Jersey: " + jersey);
        System.out.println("Position: " + position);
        System.out.println("Attacker jersey: " + (isAttacker ? "Yes" : "No"));
        System.out.println("Eligibility: " + (eligible ? "Eligible" : "Not Eligible"));
        System.out.println("Lineup Decision: " + lineupDecision);
        System.out.println("Final Decision: " + finalDecision);

        input.close();
    }
}