// https://codingbat.com/prob/p100905


// 私のコード
public String delDel(String str) {

  if( str.length() >= 4 && str.substring(1, 4).equals("del") ){
    return str.substring(0, 1) + str.substring(4);
  }
  
  return str;
}

// 回答例
public String delDel(String str) {
  if (str.length()>=4 && str.substring(1, 4).equals("del")) {
    // First char + rest of string starting at 4
    return str.substring(0, 1) + str.substring(4);
  }
  // Otherwise return the original string.
  return str;
}

// 回答が分からなかったため、Geminiに助けを求めた。
// そのため回答例と答えが一致している。