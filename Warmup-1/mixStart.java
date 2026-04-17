// https://codingbat.com/prob/p151713

public boolean mixStart(String str) {
  if(str.length() < 3){
    return false;
  }
  if(str.substring(1, 3).equals("ix")){
    return true;
  }else{
    return false;
  }
}
