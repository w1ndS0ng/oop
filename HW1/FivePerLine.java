public class FivePerLine {
    public static void main(String[] args) {
        int START = 1000;
        int END = 2000;
        int count = 0;
        for (int i = START; i <= END; i++) {
            System.out.print(i + " ");
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }
}
