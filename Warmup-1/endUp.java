// https://codingbat.com/prob/p125268

// 自分
public String endUp(String str) {
  
  int num = 3;
  
  if(str.length() < num){
    str = str.toUpperCase();
  }else{
    int start = str.length() - num;
    str = str.substring(0, start) + str.substring(start).toUpperCase();
  }
  
  return str;
}

// 回答例
public String endUp(String str) {
  if (str.length() <= 3) return str.toUpperCase();
  int cut = str.length() - 3;
  String front = str.substring(0, cut);
  String back  = str.substring(cut);  // this takes from cut to the end
  
  return front + back.toUpperCase();
}

// ■endUpのフィードバック

// ・自分のコードの「審美眼」：
//   int num = 3; と変数化した点に、将来的な変更（最後4文字にするなど）への配慮が感じられます。
//   一方で、str = str.toUpperCase(); と引数を上書きする「破壊的」な書き方は、
//   小さなプログラムでは問題ないものの、規模が大きくなると「どこで値が変わったか」を
//   追いかけるストレス（嫌な予感）を生む種になります。

// ・回答例の「審美眼」：
//   front と back という名前の変数に切り出した点が非常に優れています。
//   「どこからどこまでが前半で、どこが後半か」という意図が明確で、
//   str.substring(0, start) + str.substring(start)... と書くよりも、
//   パズルを組み立てるような安心感（心地よさ）があります。

// ・「バックファイヤー」の懸念：
//   自分のコードの if(str.length() < num) は、numが3の場合、長さ3の文字列が else 側に回ります。
//   結果は同じですが、回答例のように <= 3 と書く方が「3文字以下なら全部大文字」という
//   言葉の説明と直感的に一致し、境界値でのバグ（時限爆弾）を防ぎやすいです。

// ・考え方のポイント：
//   「既存の変数に加工して入れ直す」よりも、「材料（front/back）を揃えてから最後に組み立てる」
//   という意識を持つと、より副作用の少ない、読み手に優しいコードになります。

// ■推奨される書き方（両者の良いとこ取り）
// public String endUp(String str) {
//   int cutPos = 3;
//   if (str.length() <= cutPos) {
//     return str.toUpperCase();
//   }
  
//   int cut = str.length() - cutPos;
//   String front = str.substring(0, cut);
//   String back  = str.substring(cut);
  
//   return front + back.toUpperCase();
// }
