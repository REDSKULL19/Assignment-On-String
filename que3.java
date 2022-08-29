import java.util.Arrays;
import java.util.Scanner;

// 3. WAP to check if the String is Anagram or not.
class Anagram {
    String s1 ;
    String s2 ;

    void print() {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() == s2.length()) {
            char[] charArray1 = s1.toCharArray();
            char[] charArray2 = s2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean res = Arrays.equals(charArray1, charArray2);

            if (res == true) {
                System.out.println("The given String is Anagram ");
            } else {
                System.out.println(" The string is not anagram");
            }
        } else {
            System.out.println(" The given String is not Anagram");

        }
    }

}

public class que3 {
    public static void main(String[] args) {

        Anagram a = new Anagram();
        Scanner sc = new Scanner(System.in);
        System.out.println(" The First string is");
        a.s1= sc.nextLine();
        System.out.println(" The Second string is");
        a.s2= sc.nextLine();
        a.print();

    }
}
