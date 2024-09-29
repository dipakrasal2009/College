package Series;

public class cube {
    public void printCubes(int n) {
        System.out.print("Cubes of numbers: ");
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i * i) + " ");
        }
        System.out.println();
    }
}

