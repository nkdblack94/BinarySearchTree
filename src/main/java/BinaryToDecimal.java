public class BinaryToDecimal {

    public static void main(String[] args) {
        System.out.println("110 --> " + binaryToDecimal(110));
        System.out.println("1111 --> " + binaryToDecimal(1111));
        System.out.println("100 --> " + binaryToDecimal(100));
        System.out.println("110111 --> " + binaryToDecimal(110111));
    }

    public static int binaryToDecimal(int binary){
        int decimal = 0;
        int p = 0;
        while (true){
            if (binary == 0){
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2,p);
                binary = binary / 10;
                p++;
            }
        }
        return decimal;
    }
}
