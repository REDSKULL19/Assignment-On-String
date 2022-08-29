// 6. WAP to sort a String Alphabetically.
public class que6 {
    public static void main(String[] args) {
        String s = "hello";

        char[] str = s.toCharArray();

        for (int i = 0; i < str.length-1; i++) {
            for (int j = i+1; j < str.length; j++) {
                if (str[j] < str[i]) {
                    char temp = 0;
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("The Sorted list is");
        for (int k = 0; k < str.length; k++) {
            System.out.print(str[k]);
        }
    }
}
