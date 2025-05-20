public int dogWalkerShift(int start, int end) {
  int money= 0;
  for (int hour = start; hour <= end; hour++) {
    if (dogs == maxDogs || (hour >= 9 && hour <= 17)) {
      money += (dogs*5) + 3;
    }
    else{
      money += dogs * 5
    }
  }
   return money;
}
