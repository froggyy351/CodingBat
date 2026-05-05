// https://codingbat.com/prob/p101887

// 自分コード
public int intMax(int a, int b, int c) {
  return Math.max(a, Math.max(b, c));
}

// 回答例
public int intMax(int a, int b, int c) {
  int max;
  
  // First check between a and b
  if (a > b) {
    max = a;
  } else {
    max = b;
  }
  
  // Now check between max and c
  if (c > max) {
    max = c;
  }
  
  return max;
  
  // Could use the built in Math.max(x, y) function which selects the larger
  // of two values.
}

// FB
// ■intMaxのフィードバック

// ・自分のコードの評価：
//   文句なしに「自分のコード」の方が優れています。
//   回答例は if 文の基本を教えるための教育的なコードですが、実務で if 文を重ねて書くのは非効率的です。

// ・自分のコードが良い理由：
//   1. 可読性：Math.max(a, b) という「最大値を取る」という意図が明確で、一目で理解できる。
//   2. 堅牢性：自前で if 文を組み合わせて比較すると、不等号の向き（> か >= か）などの単純なミスが起きやすいが、標準ライブラリを使えばその心配がない。
//   3. 簡潔さ：3つの値の比較を1行で表現できており、コードの保守性が高い。

// ・考え方のポイント：
//   Javaの標準ライブラリ（Mathクラスなど）にある機能は、積極的に使うのが正解です。
//   「自分で論理を組み立てる」よりも「既存の信頼できる道具（メソッド）を組み合わせる」方が、バグが少なくきれいなコードになります。

// ■さらにスマートな書き方
// // あなたのコードで十分完璧ですが、以下のように書くことも一般的です。
// public int intMax(int a, int b, int c) {
//   int tempMax = Math.max(a, b);
//   return Math.max(tempMax, c);
// }