// https://codingbat.com/prob/p161642

public String backAround(String str) {
  String concatStr = str.substring(str.length()-1, str.length()) + str + str.substring(str.length()-1, str.length());
  return concatStr;
}
