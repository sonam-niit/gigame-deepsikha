public class Sample {
    public static void main(String[] args) {
        System.out.println("Hello From Sample");
        byte n1=10; //1 byte
        short n2= 30; // 2 byte
        int num=20; //4 byte (whole number)
        long num3= 456789; //8 byte
        float result=67.89f; //4 byte
        double mydata=89000000.900; //8 byte
        boolean check= n1>n2; //true or false
        char character= 'A'; //single character

        String str1= "Hello World";
        String obj1= "Hello World";
        String str2= new String("Hello World");
        System.out.println(str1);
        System.out.println(mydata);
        System.out.println(check + " My Result");
    }
}
