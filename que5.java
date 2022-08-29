
class duplicates {
    // String s1 = " asdvdfknsdlik";
    // String s2 = " ";

    // void print() {
    // for (int i = 0; i < s1.length() - 1; i++) {
    // for (int j = i + 1; j < s1.length(); j++) {
    // if (s1.charAt(i) == s1.charAt(j)) {
    // s2 = s2 + s1.charAt(j);
    // break;
    // }

    // }
    // }
    // System.out.println(s2);
    // }
    String s1 = " Great responsibility";

    void print() {
        s1 = s1.toLowerCase();
        char[] str = s1.toCharArray();
        int count;
        System.out.println(" Duplicates Element in string is");
        for (int i = 0; i < str.length; i++) {
            count = 1;

            for (int j = i + 1; j < str.length; j++) {
                if (str[i] == str[j] && str[i] != ' ') {
                    count++;
                    // Set string[j] to 0 to avoid printing visited character
                    str[j] = '0';
                }
            }
            // A character is considered as duplicate if count is greater than 1
            if (count > 1 && str[i] != '0')
                System.out.print(str[i]);
        }
    }

    public class que5 {
        public static void main(String[] args) {
            duplicates d1 = new duplicates();
            d1.print();
        }
    }
}
