public class ArrayPrint {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Simple For Loop");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("ForEach Loop");
        for(int i:numbers){
            System.out.println(i);
        }
        System.out.println("Reverse Order");
        for (int i = numbers.length-1; i >=0 ; i--) {
            System.out.println(numbers[i]);
        }
        int min=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("Minimum is "+min);
        int max=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("Minimum is "+max);
    }
}
