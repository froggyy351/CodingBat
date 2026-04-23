// https://codingbat.com/prob/p182873

public boolean makes10(int a, int b) {
  if(a == 10 || b ==10){
    return true;
  }else if(a == 10 && b ==10){
    return true;
  }else if(a + b == 10){
    return true;
  }else{
    return false;
  }
}
