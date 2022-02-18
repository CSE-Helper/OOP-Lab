public class RightTrianglePattern {
    public static void main(String args[]) {
        int i, j, row = 5;
        for (i = 0; i < row; i++) {
            for (j = 0; j <= 2 * i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}