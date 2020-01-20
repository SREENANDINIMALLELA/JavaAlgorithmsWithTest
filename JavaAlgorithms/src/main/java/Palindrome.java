import java.util.ArrayList;

public class Palindrome {

    public boolean checkPalindrome(String input){
        if (input == null|| input.isEmpty()){
            return true ;

        }
        char[] inputArray = input.toCharArray();
        StringBuilder builderinput = new StringBuilder(input.length());
        for (int i = input.length()-1 ;i >=0 ;i--){
            builderinput.append(inputArray[i]);
        }
        String reverseString = builderinput.toString();
         return  input.equals(reverseString);
        }

}

