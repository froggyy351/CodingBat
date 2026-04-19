// https://codingbat.com/prob/p177372

public int max1020(int a, int b) {
  if( (10 <= a && a <= 20) && (10 <= b && b <= 20) ){
    if(a <= b){
      return b;
    }else{
      return a;
    }
  }else if(!(10 <= a && a <= 20) && (10 <= b && b <= 20)){
    return b;
  }else if((10 <= a && a <= 20) && !(10 <= b && b <= 20)){
    return a;
  }else {
    return 0;
  }
}
