package array;

public class IntersectionUnion {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {2, 3, 4};
        int[] Intersection = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    Intersection[i] = a[i];

                }
            }
        }
        for (int i = 0; i < Intersection.length; i++) {
            System.out.print(Intersection[i]);
        }
        System.out.println();

        int[] union = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            Intersection[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            Intersection[a.length + i] = b[i];
        }
        for (int i = 0; i < Intersection.length; i++) {
            for (int j = i + 1; j < Intersection.length; j++) {
                if (Intersection[i] == Intersection[j]) {
                    Intersection[j] = 0;
                }
            }
        }
        for (int i = 0; i < Intersection.length; i++) {
            System.out.print(Intersection[i]);
        }
    }
}
