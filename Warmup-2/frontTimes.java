// https://codingbat.com/prob/p101475

// 自分
public String frontTimes(String str, int n) {
  String result = "";
  Boolean flag = str.length()<3;
  
  for(int i=0; i<n; i++){
    if(flag){
      result = result + str.substring(0);
    }else{
      result = result + str.substring(0,3);
    }
  }
  return result;
}

// 回答例
public String frontTimes(String str, int n) {
  int frontLen = 3;
  if (frontLen > str.length()) {
    frontLen = str.length();
  }
  String front = str.substring(0, frontLen);
  
  String result = "";
  for (int i=0; i<n; i++) {
    result = result + front;
  }
  return result;
}

// レビュー結果
// ■frontTimesのフィードバック

// ・自分のコードの「審美眼」：
//   「フラグを立ててループ内で分岐する」という手法は、論理としては明確です。
//   しかし、この書き方には「嫌な予感」が残ります。n回ループするたびに、毎回同じ「flag」の判定を繰り返しているからです。
//   これは「既に答え（どちらを足すべきか）が出ているのに、何度も同じ質問を繰り返す」ような冗長さを感じさせます。

// ・回答例の「審美眼」：
//   「ループに入る前に、繰り返すべき文字列（front）を確定させてしまう」というアプローチが非常に心地よいです。
//   一度決めてしまえば、ループの中は「ただ足すだけ」の純粋な作業に集中できます。
//   「不変なものは外に出し、変化するもの（ループ）を最小限にする」という、協調性の高い構造です。

// ・「バックファイヤー」の懸念：
//   自分のコードにある str.substring(0) は、実は str そのものと同じ意味ですが、
//   もし str が空文字の場合、substring(0, 3) が呼ばれるルートを通るとエラー（IndexOutOfBounds）になります。
//   回答例のように「まず安全な長さ（frontLen）を計算する」ステップを挟むことで、
//   実行時の爆弾を事前に解体できています。

// ・考え方のポイント：
//   「if文」をループの中に入れるのではなく、「ループの材料を作るため」にif文を使う。
//   この順序を意識するだけで、コードの実行効率も読みやすさも劇的に向上します。

// ■推奨される書き方（回答例をさらに洗練）
// public String frontTimes(String str, int n) {
//   // 1. 材料（front）を確定させる
//   int end = Math.min(str.length(), 3);
//   String front = str.substring(0, end);
  
//   // 2. 組み立てる
//   StringBuilder sb = new StringBuilder();
//   for (int i = 0; i < n; i++) {
//     sb.append(front);
//   }
//   return sb.toString();
// }