
import java.util.Random;

public class RandomShuffle {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 ,7};
        System.out.println("Before");
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
        createShuffle(arr);
        System.out.println("After");
        for (int a : arr) {
            System.out.print(a+" ");
        }
    }

    public static void createShuffle(int arr[]) {
        Random r = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }
}
