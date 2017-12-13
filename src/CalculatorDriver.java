public class CalculatorDriver {
    public static void main(String [] args) {
        double [] num = new double[5];
        num[0] = 1.0;
        num[1] = 2.0;
        num[2] = 3.0;
        num[3] = 4.0;
        num[4] = 5.0;

        System.out.println("The average of the numbers is: "+ Calculator.getAverage(num));
        System.out.println("The sum of the numbers is: " +Calculator.getSum(10.0, 5.0));
        System.out.println("The product of the numbers is: " + Calculator.getProduct(10.0, 12.0));
    }
}
