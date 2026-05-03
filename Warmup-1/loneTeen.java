// https://codingbat.com/prob/p165701

// 自分のコード
public boolean loneTeen(int a, int b) {
  if(((13 <= a) && (a <= 19)) && !((13 <= b) && (b <= 19))){
    return true;
  }else if(!((13 <= a) && (a <= 19)) && ((13 <= b) && (b <= 19))){
    return true;
  }else{
    return false;
  }
}

// 回答例
public boolean loneTeen(int a, int b) {
  // Store teen-ness in boolean local vars first. Boolean local
  // vars like this are a little rare, but here they work great.
  boolean aTeen = (a >= 13 && a <= 19);
  boolean bTeen = (b >= 13 && b <= 19);
  
  return (aTeen && !bTeen) || (!aTeen && bTeen);
  // Translation: one or the other, but not both.
  // Alternately could use the Java xor operator, but it's obscure.
}

// 書き直してみた
// マジックナンバーを変数化した
public boolean loneTeen(int a, int b) {
  
  int top = 19;
  int bottom = 13;
  
  boolean aTeen = (bottom <= a && a <= top);
  boolean bTeen = (bottom <= b && b <= top);
  
  return ((aTeen && !bTeen) || (!aTeen && bTeen));
}
