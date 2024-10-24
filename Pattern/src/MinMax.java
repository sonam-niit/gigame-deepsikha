import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {4,3,6,7,8,1,2,9};
        Arrays.sort(arr);
        System.out.println("Min "+arr[0]);
        System.out.println("Max: "+arr[arr.length-1]);

        int[] myArray = {6,8,9,2,3,5,1,7};
        int min=Arrays.stream(arr).min().getAsInt();
        int max=Arrays.stream(arr).max().getAsInt();

        System.out.println("Min "+min);
        System.out.println("Max: "+max);
    }
}
