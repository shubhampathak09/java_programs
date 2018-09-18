import java.util.Arrays;
import java.util.List;

public class vowelRemove {
	static String remVowel(String str)
    {
         Character vowels[] = {'a', 'e', 'i', 'o'};
          
         List<Character> al = Arrays.asList(vowels);
          
         StringBuffer sb = new StringBuffer(str);
          
         for (int i = 0; i < sb.length(); i++) {
             
             if(al.contains(sb.charAt(i))){
                sb.replace(i, i+1, "") ;
                i--;
             }
        }
          
         
        return sb.toString();
    }
    // Driver method to test the above function
    public static void main(String[] args) 
    {
        String str = "India United States Germany Egypt czechoslovakia";
         
        System.out.println(remVowel(str));
    }
}
	
	
    

