package Chapter9.Soru06;

public class TestKronometre {
    public static void main(String[] args) {
        Kronometre k1 = new Kronometre();
        int[] arr = new int[100_000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10_000);
        }
        k1.start();
        selectionSort(arr);
        k1.stop();

        System.out.println("Algoritmanin calisma suresi " + k1.getElapsedTime() + " miliSaniyedir");
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }
}
