//https://codingbat.com/prob/p192082

public boolean icyHot(int temp1, int temp2) {
  if(temp1 < 0 && temp2 > 100){
    return true;
  }else if(temp2 < 0 && temp1 > 100){
    return true;
  }else{
    return false;
  }
}
