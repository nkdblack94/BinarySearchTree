import java.util.Stack;

public class DecimalToBinary {

    public static void main(String[] args) {
        int decimalNumber = 7;
        System.out.println("Hệ nhị phân của " + decimalNumber + " là:");
        convertBinary(decimalNumber);
    }

    public static void convertBinary(int num) {
        Stack<Integer> stack = new Stack<Integer>();
        while (num != 0) {
            int result = num % 2;
            stack.push(result);
            num /= 2;
        }

        while (!(stack.isEmpty())){
            System.out.printf("%d ", stack.pop());
        }
    }
}
