public class ArrayPractice {
    public boolean commonEnd(int[] a, int[] b) {
        int n = a.length;
        int i = b.length;

        if (n < 1 || i < 1) {
            return false;

        }
        return (a[0] == b[0] || a[n-1] == b[i-1]);
    }
}
