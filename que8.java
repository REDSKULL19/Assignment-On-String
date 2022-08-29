
// 8. WAP to count number of special characters.
public class que8 {
    public static void main(String[] args) {
        String s = "hellosirhow is your day/@";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))
                    && !Character.isWhitespace(s.charAt(i))) {
                
                count++;
            }
        }
        if(count ==0){
            System.out.println("There is no Special character");
        }
        else{
            System.out.println("The Special charaters count is "+ count);
        }
    }
}
