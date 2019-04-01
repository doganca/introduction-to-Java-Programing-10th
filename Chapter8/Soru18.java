package Chapter8;

public class Soru18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        diziyiKaristir(m);

        diziyiYazdir(m);


    }

    private static void diziyiKaristir(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int random = (int) (Math.random() * 4);
            for (int j = 0; j < m[i].length; j++) {
                int temp1 = m[i][j];
                m[i][j] = m[random][j];
                m[random][j] = temp1;
            }
        }
    }

    private static void diziyiYazdir(int[][] m) {
        for (int[] i : m) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
