// https://codingbat.com/prob/p123384

public String frontBack(String str) {
  if(str.length() <= 1){ 
    return str; 
  }
  
  String mid = str.substring(1, str.length()-1 );
  return str.substring(str.length()-1, str.length()) + mid + str.charAt(0);
}
