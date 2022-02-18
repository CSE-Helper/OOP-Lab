class GFG {
    static void alphabetPattern(int N) {
        int index, side_index;
        int Top = 1, Bottom = 1, Diagonal = N - 1;
        for (index = 0; index < N; index++)
            System.out.print(Top++ + " ");
        System.out.println();
        for (index = 1; index < N - 1; index++) {
            for (side_index = 0; side_index < 2 * (N - index - 1); side_index++)
                System.out.print(" ");
            System.out.print(Diagonal--);
            System.out.println();
        }
        for (index = 0; index < N; index++)
            System.out.print(Bottom++ + " ");
    }

    public static void main(String args[]) {
        int N = 5;
        alphabetPattern(N);
    }
}
