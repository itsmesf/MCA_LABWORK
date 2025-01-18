public class w1_q7 {
    public static void main(String[] args) {
        // Constants
        System.out.println("Math.PI: " + Math.PI);
        System.out.println("Math.E: " + Math.E);

        // Arithmetic Methods
        System.out.println("Math.abs(-10): " + Math.abs(-10));
        System.out.println("Math.addExact(10, 5): " + Math.addExact(10, 5));
        System.out.println("Math.subtractExact(10, 5): " + Math.subtractExact(10, 5));
        System.out.println("Math.multiplyExact(10, 5): " + Math.multiplyExact(10, 5));
        System.out.println("Math.negateExact(10): " + Math.negateExact(10));
        System.out.println("Math.incrementExact(5): " + Math.incrementExact(5));
        System.out.println("Math.decrementExact(5): " + Math.decrementExact(5));
        System.out.println("Math.floorDiv(7, 3): " + Math.floorDiv(7, 3));
        System.out.println("Math.floorMod(7, 3): " + Math.floorMod(7, 3));

        // Exponential and Logarithmic Methods
        System.out.println("Math.exp(1): " + Math.exp(1));
        System.out.println("Math.expm1(1): " + Math.expm1(1));
        System.out.println("Math.log(Math.E): " + Math.log(Math.E));
        System.out.println("Math.log10(100): " + Math.log10(100));
        System.out.println("Math.log1p(1): " + Math.log1p(1));

        // Power Methods
        System.out.println("Math.pow(2, 3): " + Math.pow(2, 3));
        System.out.println("Math.sqrt(16): " + Math.sqrt(16));
        System.out.println("Math.cbrt(27): " + Math.cbrt(27));
        System.out.println("Math.hypot(3, 4): " + Math.hypot(3, 4));

        // Trigonometric Methods
        System.out.println("Math.sin(Math.PI / 2): " + Math.sin(Math.PI / 2));
        System.out.println("Math.cos(0): " + Math.cos(0));
        System.out.println("Math.tan(Math.PI / 4): " + Math.tan(Math.PI / 4));
        System.out.println("Math.asin(1): " + Math.asin(1));
        System.out.println("Math.acos(1): " + Math.acos(1));
        System.out.println("Math.atan(1): " + Math.atan(1));
        System.out.println("Math.atan2(1, 1): " + Math.atan2(1, 1));

        // Rounding Methods
        System.out.println("Math.ceil(4.3): " + Math.ceil(4.3));
        System.out.println("Math.floor(4.7): " + Math.floor(4.7));
        System.out.println("Math.round(4.5): " + Math.round(4.5));
        System.out.println("Math.rint(4.5): " + Math.rint(4.5));

        // Min, Max, and Clamping Methods
        System.out.println("Math.min(10, 20): " + Math.min(10, 20));
        System.out.println("Math.max(10, 20): " + Math.max(10, 20));

        // Random Number Generation
        System.out.println("Math.random(): " + Math.random());

        // Special Methods
        System.out.println("Math.copySign(10, -1): " + Math.copySign(10, -1));
        System.out.println("Math.IEEEremainder(10, 3): " + Math.IEEEremainder(10, 3));
        System.out.println("Math.nextAfter(1.0, 2.0): " + Math.nextAfter(1.0, 2.0));
        System.out.println("Math.nextUp(1.0): " + Math.nextUp(1.0));
        System.out.println("Math.nextDown(1.0): " + Math.nextDown(1.0));
        System.out.println("Math.scalb(1.5, 3): " + Math.scalb(1.5, 3));
    }
}
