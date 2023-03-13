public class WrapperExperiment {
    public static void main(String[] args) {

        //Store the `POSITIVE_INFINITY` static field from the `Double` class into a `Double` wrapper object
        Double doubleWrapper = Double.POSITIVE_INFINITY;

        //Unbox the infinitely large `Double` into an `int`
        int intDouble = doubleWrapper.intValue();

        //Modify the if condition to test if the integer value is equal to the `MAX_VALUE` static field from the `Integer` class

        if(intDouble==Integer.MAX_VALUE) {
            System.out.print("True");
        }

    }
}
