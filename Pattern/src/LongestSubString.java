import java.util.HashSet;

public class LongestSubString {
    public static void subString(String s){
        HashSet<Character> set= new HashSet<>();
        for (int i = 0; i <s.length(); i++) {
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }
        System.out.println("Longest SubString "+ set);
        System.out.println("Length: "+set.size());
    }

    public static void main(String[] args) {
        subString("abcabcdbbe");
    }
}
