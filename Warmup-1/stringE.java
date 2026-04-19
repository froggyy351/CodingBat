// https://codingbat.com/prob/p173784

// 3つ以下のeがあったらtrue
public boolean stringE(String str) {
  int count = 0;
  
  
  // ちなみにchar型なら''のシングルシングルクォーテーションで囲むらしい
  // charAt()で取り出す方法もある
  for(int i = 0; i < str.length(); i++){
    if(str.substring(i, i+1).equals("e")){
      count++;
    }
  }
  
  if(1 <= count && count <= 3){
    return true;
  }else{
    return false;
  }
}
