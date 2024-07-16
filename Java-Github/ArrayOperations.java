public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array elements:");
        for(int num : numbers) {
            System.out.println(num);
        }

        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
