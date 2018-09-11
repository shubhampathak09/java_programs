public class question3 {

    public static void main(String args[]) {
        String in = "This is Stack route training program";
        for (int i = 0; i < in.length(); i++) {
            char ch = in.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                System.out.print("Vowel");
            else
                System.out.print("Consonent");
        }
    }
}
