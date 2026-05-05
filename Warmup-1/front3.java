// https://codingbat.com/prob/p136351

// 自分のコード
public String front3(String str) {
  
  if(str.length() < 3){
    return str + str + str;
  }
  
  String front3 = str.substring(0, 3);
  return front3 + front3 + front3;
}


// 回答例
public String front3(String str) {
  String front;
  
  if (str.length() >= 3) {
    front = str.substring(0, 3);
  }
  else {
    front = str;
  }

  return front + front + front;
}

// ■front3のフィードバック

// ・自分のコードの評価：
//   論理的には完全に正解しており、動作も問題ありません。
//   むしろ、ガード句（条件を満たさない場合に先にreturnする手法）を使っているため、読みやすさでは自分のコードの方が優れているという見方もできます。

// ・回答例が良いとされる点（構造の整理）：
//   自分のコードは return 文が2箇所に分散していますが、回答例は「まず front に入れる中身を決める」→「最後に1回だけ return する」という流れになっています。
//   出口（return）を1つに絞ることで、後から「3回ではなく5回繰り返すように変更して」と言われた際に、1箇所の修正で済むため、保守性が高いとされます。

// ・考え方の違い：
//   自分のコード：「短い場合」と「普通の場合」で処理そのものを完全に分けて考える。
//   回答例：「繰り返す対象（front）が何か」というデータに着目し、その中身だけをif文で切り分ける。

// ■推奨される書き方（さらに短く書く場合）
// public String front3(String str) {
//   int cutLen = Math.min(str.length(), 3);
//   String front = str.substring(0, cutLen);
//   return front + front + front;
// }
