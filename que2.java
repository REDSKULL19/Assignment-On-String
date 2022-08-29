// WAP to reverse a sentence while preserving the position.
// Input : “Think Twice”
// Output : “kniht eciwt”s


class reversesentense {
    String s1 ="Think Twice";
    String s2 = " ";

    String []a = s1.split(s2);

    void print() {

        for (int i = 0; i < a.length; i++) {
            String str=a[i];
            for (int j = str.length()- 1; j >= 0; j--) {
           
                s2 = s2 + str.charAt(j);      
            }
            a[i]=s2;
            s2="";
        }
       
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }
    }

}


public class que2 {
    public static void main(String[] args) {
        reversesentense r = new reversesentense();
        r.print();
    }
}
