public class StringUtil {

 public boolean isStringPalindrome (String word){
    char[] arrayWord = word.toCharArray();
    int start = 0;
    int end = (arrayWord.length -1);
    while(start < end){
      if(arrayWord[start] != arrayWord[end]){
        return false;
      } 
      start++;
      end--;
    }
    return true;
  }
  
}
