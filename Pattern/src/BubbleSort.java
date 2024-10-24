public class BubbleSort {
    
    public static void sort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array");
        for (int n:arr){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int[] arr= {3 ,6 , 1, 7, 2, 8 ,4};
        sort(arr);
    }
}
