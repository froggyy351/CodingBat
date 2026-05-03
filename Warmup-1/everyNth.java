// https://codingbat.com/prob/p196441

public String everyNth(String str, int n) {
  
  String ans = "";
  
  for(int i = 0; i < str.length() ; i = i+n ){
    ans = ans + str.charAt(i);
  }
  
  return ans;
}

