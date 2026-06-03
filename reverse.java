public class reverse {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int k = arr.length;
        int[] newArr = new int[k];

        int count = 0;

        for (int i = k - 1; i >= 0; i--) {
            newArr[count] = arr[i];
            count++;
        }

        System.out.print("Reversed Array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}