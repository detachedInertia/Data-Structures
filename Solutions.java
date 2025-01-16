public class Solutions {
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;


        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }


        return product - sum;
    }

    public static void main(String[] args) {
        int number = 507;
        int result = subtractProductAndSum(number);
        System.out.println("The result is: " + result);
    }
}
