// https://codingbat.com/prob/p142270

// じぶん
public String stringTimes(String str, int n) {
  
  String strTimes = "";
  for(int i = 0 ;i < n; i++){
    strTimes = strTimes + str;
  }
  
  return strTimes;
}

// かいとう例
public String stringTimes(String str, int n) {
  String result = "";
  for (int i=0; i<n; i++) {
    result = result + str;  // could use += here
  }
  return result;
}

// Geminiのレビュー

// ■stringTimesのフィードバック

// ・自分のコードの「審美眼」：
//   変数名を「strTimes」としたことで、戻り値が「文字列を指定回数繰り返したもの」であるという目的が明確になっています。
//   回答例の「result」は汎用的すぎて、コードが長くなった際に「何の実行結果か」を見失うリスクがありますが、あなたの命名にはその不安がありません。

// ・「バックファイヤー」の懸念：
//   今回のロジック（result = result + str）は、繰り返しの回数 n が非常に大きくなった場合にパフォーマンスが低下する「時限爆弾」を内包しています。
//   JavaのStringは不変（Immutable）であるため、+ で繋ぐたびに新しい文字列オブジェクトをメモリ上に作り直します。
//   n=100万 といった極端なケースでは、動作が著しく重くなる可能性があります。

// ・考え方のポイント：
//   「文字列を何度も繋ぐ」という操作を見たときに、「これ、nが巨大だったら重くなるかもな」という嫌な予感を抱けるかどうかが審美眼の分かれ道です。
//   実務では、このようなループ内での結合には StringBuilder という専用の道具を使うのが一般的です。

// ■推奨される書き方（時限爆弾を取り除いた形）
// public String stringTimes(String str, int n) {
//   // Stringを直接足すのではなく、可変なバッファ（StringBuilder）に貯めていく
//   StringBuilder sb = new StringBuilder();
//   for (int i = 0; i < n; i++) {
//     sb.append(str);
//   }
//   return sb.toString();
// }

// ※今回の CodingBat のような小さな問題ではあなたの書き方で十分ですが、
//   「ループ内での + 結合は副作用の種になる」という感覚を持っておくと、より安全なコードが書けます。