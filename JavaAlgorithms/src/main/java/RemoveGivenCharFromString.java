public class RemoveGivenCharFromString {


    public String  checkRemoveChar(String givenString , char charInput) {
        if (givenString.indexOf(charInput) == -1){
            return givenString;
        }
        StringBuilder sb = new StringBuilder();
      char[] arrayString = givenString.toCharArray();
        for (int i=0 ; i < givenString.length() ;i++){
            if (arrayString[i] != charInput){
                sb.append(arrayString[i]);
            }
        }
        return sb.toString();
    }
    public String removeRecursive(String word, char ch){
        int index = word.indexOf(ch);
        if(index == -1){
            return word;
        }
        return removeRecursive(word.substring(0, index) + word.substring(index +1, word.length()), ch);
    }

}
