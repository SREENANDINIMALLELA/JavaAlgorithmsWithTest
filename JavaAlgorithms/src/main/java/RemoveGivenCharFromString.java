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
}
