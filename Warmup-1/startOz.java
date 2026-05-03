// https://codingbat.com/prob/p199720

public String startOz(String str) {
  
  String prefix = "";
  String firstChar = "o";
  String secndChar = "z";
  

// 自分のコード
  if(str.length() > 0 && str.substring(0, 1).equals(firstChar)){
    prefix = prefix + firstChar;
  }
  
  if(str.length() > 1 && str.substring(1, 2).equals(secndChar)){
    prefix = prefix + secndChar;
  }
  
  return prefix;
  
}


//  回答例
public String startOz(String str) {
  String result = "";
  
  if (str.length() >= 1 && str.charAt(0)=='o') {
    result = result + str.charAt(0);
  }
  
  if (str.length() >= 2 && str.charAt(1)=='z') {
    result = result + str.charAt(1);
  }
  
  return result;
}