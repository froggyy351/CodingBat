// https://codingbat.com/prob/p172021

public int close10(int a, int b) {
  int absA = Math.abs(10 - a);
  int absB = Math.abs(10 - b);
  
  if(absA == absB){
    return 0;
  }else if(absA > absB){
    return b;
  }else{
    // absA < absB
    return a;
  }
}
