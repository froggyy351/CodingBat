// https://codingbat.com/prob/p191914
// 自分の回答
public String notString(String str) {
  if(str.length() < 3){
    return "not " + str;
  }if(str.substring(0,3).equals("not")){
    return str;
  }else{
    return "not " + str;
  }
}

// テストは通るが、DRY (Don't Repeat Yourself)ができてない。return "not " + str;が２回出てくる
// ifの2段階を１つにまとめる

// 回答例
public String notString(String str) {
  if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
    return str;
  }
  
  return "not " + str;
}


// 文字列先頭が一致するか？　startsWith(String prefix)
// 文字列に含まれているか？　contains(CharSequence s)