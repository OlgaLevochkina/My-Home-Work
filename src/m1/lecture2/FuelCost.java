package m1.lecture2;

public class FuelCost {
    public static final double COST_PER_LITRE = 1.2;
    public static final double FUEL_PER_KILOMETER = 0.08;

    public static void main(String[] args) {
        int inputDistance = 120;
        System.out.println(calculateCost(inputDistance) + "$");
    }
    private static double calculateCost(int distance) {
        return distance * FUEL_PER_KILOMETER * COST_PER_LITRE;
    }
}
