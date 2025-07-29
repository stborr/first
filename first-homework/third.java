public class third {
    public static void main(String[] args) {
        double sideA = 5;
        double sideB = 7;
        double sideC = 9;
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        double areaTriangle = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
        System.out.println("A = " + areaTriangle);
    }
}