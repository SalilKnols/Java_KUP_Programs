package KUPProgram10;

public class ElseIf {
    public static void main(String[] args) {
        boolean isCold = true;
        boolean isRainy = false;

        if (isCold && isRainy) {
            System.out.println("Bring a jacket and an umbrella");
        } else if (isCold) {
            System.out.println("Bring a jacket");
        } else if (isRainy) {
            System.out.println("Bring an umbrella");
        }
    }
}
