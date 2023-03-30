import java.util.Arrays;
public class DoubleArrays {

    public static void main(String[] args) {
        int[] mainArray = {1,2,3,4,5};
        doubleArray(mainArray);
        System.out.println(Arrays.toString(mainArray));
    }

    public static void doubleArray(int[] loo) {
for(int i=0; i < loo.length; i++){
    loo[i] *= 2;
}
    }
}
