
// 7. WAP to count the number of Vowels and Consonants of a String value.
public class que7 {
    public static void main(String[] args) {
        String s  = "Ineuron";
        s = s.toLowerCase();
        int vowlescount=0;
        int Consonentcount =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)== 'a' ||s.charAt(i)== 'e' ||s.charAt(i)== 'i' ||s.charAt(i)== 'o' ||s.charAt(i)== 'u'){
                vowlescount++;
            }
            else{
                Consonentcount++;
            }
        }
        System.out.println("The no of vowels is "+ vowlescount);
        System.out.println("The no of Consonent is "+ Consonentcount);

        
    }
}
