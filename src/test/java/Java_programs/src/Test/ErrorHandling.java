package Test;

public class ErrorHandling {
    public void Division(int a, int b) {
        try {
            int result = a / b;

            System.out.println("Div of a/b is -" + result);
        } /*catch (ArithmeticException e) {
            System.out.println("Division by zero is not supported mathematically");
        }*/ catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        //keep general exception at last otherwise for specific exception will be unreachable
        catch (Exception e) {
            System.out.println("Something went wrong with division of 2 numbers ");
        } finally {
            System.out.println("From finally block");
        }
    }

    public void Division1(int a, int b) throws ArithmeticException {

        int result = a / b;

        System.out.println("Div of a/b is -" + result);
    }

    public void Division2(int a, int b) throws ArithmeticException {

        int result = a / b;

        System.out.println("Div of a/b is -" + result);
    }

    public void Division3(int a, int b) throws ArithmeticException {
        try {
            int result = a / b;

            System.out.println("Div of a/b is -" + result);
        } catch (Exception e) {
            throw new RuntimeException("Manish- Divide by zero is invalid operation");
        }
    }

        public static void main(String[] args) {
        ErrorHandling qbj = new ErrorHandling();
        //qbj.Division(10,0);
        try {
            qbj.Division3(50, 0);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Done with Division ");
    }
}
