public class EvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {3, 8, 5, 4, 9, 10};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

    }
}
