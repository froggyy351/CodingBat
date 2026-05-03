// https://codingbat.com/prob/p112564

// まいあんさー
public boolean or35(int n) {
  if((n % 3 == 0) || (n % 5 == 0)){
    return true;
  }else {
    return false;
  }
}

// 回答例
public boolean or35(int n) {
  return (n % 3 == 0) || (n % 5 == 0);
}

// 回答例の方が良いコード
// 戻り値が真偽値なのであればifなしでいける！という気づき