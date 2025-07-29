import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side a:");
        int sideA = scanner.nextInt();
        System.out.println("Enter side b:");
        int sideB = scanner.nextInt();
        System.out.println("Enter side c:");
        int sideC = scanner.nextInt();
        int perimeterTriangle = sideA + sideB + sideC;
        System.out.println("P = " + perimeterTriangle);
    }
}

