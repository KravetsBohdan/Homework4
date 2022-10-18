public class EvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {4, 10, 3, 8, 5};

        for (int number : numbers) {
            if(number%2==0) {
                System.out.println(number);
            }
        }
    }
}
