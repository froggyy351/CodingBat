// https://codingbat.com/prob/p125339

// 自分のコード
public boolean lastDigit(int a, int b) {
  
  //10より少ない場合の考慮でif文
  if(a >= 10){ a = a % 10; }
  if(b >= 10){ b = b % 10; }
  
  return a == b;
}


// 回答例
public boolean lastDigit(int a, int b) {
  // True if the last digits are the same
  return(a % 10 == b % 10);
}

// Geminiのフィードバック

// ■lastDigitのフィードバック
// ・結論：回答例の方が「シンプルかつ安全」で優れたコードです。

// ・if文が不要な理由：
//   数学的に % 10（10で割った余り）は、数値が10未満であっても正しく機能します。
//   例：7 % 10 は 7 になります。
//   そのため、「if (a >= 10)」という判定を置かなくても、常に a % 10 と書くだけで1桁目が取得できます。

// ・非破壊的なコード：
//   自分のコードは a = a % 10 と変数を上書きしていますが、
//   回答例のように比較式の中で計算するだけ（return a % 10 == b % 10）に留める方が、
//   元の引数の値を壊さないため、実務ではより安全で好まれる書き方です。

// ・booleanの返し方：
//   「(条件式)」の結果はそのまま true か false になるので、
//   if文で true を返すのではなく、比較式をそのまま return するのがJavaらしい書き方です。

// ■推奨される書き方
// public boolean lastDigit(int a, int b) {
//   return (a % 10 == b % 10);
// }

