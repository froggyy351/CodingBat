// https://codingbat.com/prob/p183592

// まいあんさー
public String front22(String str) {
  String prefix = "";
  int length = str.length();
  
  if(length == 0){
  }else if(length == 1){
    prefix = str.substring(0, 1);
  }else{
    prefix = str.substring(0, 2);
  }
  
  return prefix + str + prefix;
}


// 回答例
public String front22(String str) {
  // First figure the number of chars to take
  int take = 2;
  if (take > str.length()) {
    take = str.length();
  }
  
  String front = str.substring(0, take);
  return front + str + front;
}

// 回答例の方がいい
// 回答例だと文字数に変更があっても、2の部分を、5とかに変えるだけでよくなる。（保守性◎）
// substringが何回も出てくるから、DRY的に×
// 問題文に出てくるから、prefixよりも、frontがいい
// 文字数的に、lengthよりもlen