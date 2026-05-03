// https://codingbat.com/prob/p140449

public boolean parrotTrouble(boolean talking, int hour) {
  if(talking && (hour < 7 || 20 < hour)){
    return true;
  }else{
    return false;
  }
}
