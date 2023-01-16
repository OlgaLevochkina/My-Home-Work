package m1.lecture2;

public class HeronsFormula {
    public static void main(String[] args) {
        double sideA = 0.3;
        double sideB = 0.4;
        double sideC = 0.5;
        System.out.println("The area of the triangle is " + calculateAreaUsingHeronsFormula(sideA, sideB, sideC));
    }
    private static double calculateAreaUsingHeronsFormula(double a, double b, double c) {
        double sumOfAllSides = a + b + c;
        double semiPerimeter = sumOfAllSides * 0.5;
        double result = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));

        return Math.round(result * 100) / 100.0;
    }
}