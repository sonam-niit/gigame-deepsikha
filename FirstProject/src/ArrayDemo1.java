public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] numbers= {1,2,4,5,8,19,90,23};
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        //basic Iteration Enhanced For loop
        //For Each Loop
        for(int n : numbers){
            System.out.println(n);
        }
    }
}
