package tekrarSoruCozumleri.okul_denemeleri;

public class ArrayTersCevirme {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length -1 ; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1] - i;
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println();

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
