// https://codingbat.com/prob/p159227

public boolean posNeg(int a, int b, boolean negative) {
  if( negative && ( a < 0 && b < 0 ) ){
    return true;
  }else if( !negative && ((a < 0 && b > 0) || (a > 0 && b < 0))){
    return true;
  }else{
    return false;
  }
}

// 回答例
// こっちらの方が良いコード。
// 理由：シンプル。考え方として、先にpositiveかどうか判定し、その後さらに不等号の判定をしている。

public boolean posNeg(int a, int b, boolean negative) {
  if (negative) {
    return (a < 0 && b < 0);
  }
  else {
    return ((a < 0 && b > 0) || (a > 0 && b < 0));
  }
}