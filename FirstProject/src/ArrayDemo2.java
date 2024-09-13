import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] nums= new String[5];
        for (int i = 0; i <nums.length ; i++) {
            System.out.println("Enter Student Name");
            nums[i]= scanner.next();
        }
        System.out.println("Print");
        for(String name:nums)
            System.out.println(name);
    }
}
