public class Triangle {
    public static void main(String[] args) {
        for (int index = 1; index <= 3; index++) {
            for (int j = 1; j <= 3 - index; j++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 2 * index - 1; i++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
