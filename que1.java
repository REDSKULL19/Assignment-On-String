// WAP to reverse a String.
// Input: “iNeuron”
// Output: “norueNi”


class reversestring {
    String s1 = "iNeuron";
    String s2 = "";

    void print() {

        for (int i = s1.length()-1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        System.out.println(s2);
    }

}

class que1 {
    public static void main(String[] args) {
        reversestring r = new reversestring();
        r.print();
       
    }
}