public class Demo11 {
    public static void main(String[] args) {

        try {
            int[] arr = {10, 20, 30};
            try {
                int result = arr[1] / 0; 
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception");
            }
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}


// First the inner try is executed and handles the "Arithemetic Exception"
// And then the "ArrayOutofBound"

