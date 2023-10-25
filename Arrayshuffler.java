import java.util.Random;

public class Arrayshuffler {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(arr);
        
        System.out.print("Shuffled Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void shuffleArray(int[] arr) {
        int n = arr.length;
        Random rand = new Random();

        for (int i = n - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int j = rand.nextInt(i + 1);

            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}