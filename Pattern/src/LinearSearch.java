public class LinearSearch {
    public static int searchElement(int[] arr,int search){
        int foundIndex=-1;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==search){
                foundIndex=i;
                break;
            }
        }
        return foundIndex;
    }

    public static void main(String[] args) {
        int[] arr={8,2,4,5,7,3,0};
        int result=searchElement(arr,10);
        if(result>-1)
            System.out.println("Element found at index "+result);
        else
            System.out.println("Element not found");
    }
}
