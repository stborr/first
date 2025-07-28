import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side a:");
        double sideA = scanner.nextDouble();
        System.out.println("Enter side b:");
        double sideB = scanner.nextDouble();
        System.out.println("Enter side c:");
        double sideC = scanner.nextDouble();
        double perimeterTriangle = sideA + sideB + sideC;
        System.out.println("P = " + perimeterTriangle);
    }
}

