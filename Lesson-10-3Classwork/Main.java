class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){

        
  }

    /*
      Problem 1:      
      Write a function groupSavings that takes number of tickets wanting 
      to purchase. Return the total cost by apply the following discount:
      1 to 8 tickets  : each ticket cost $11,
      9 to 16 tickets : each ticket cost $10.50
      over 16 tickts  : each ticket cost $8.50
    */
  char  groupSavings(int ticket){
    if(ticket >=1 && <= 8)
      return ticket * 11;
    else if (ticket>=9 && ticket<=16)
      return ticket * 10.5;
    else (ticket>=17)
      return ticket * 8.50;
  }   
  
  /*
      Write a function groceryDiscount that takes the total amount spent at 
      a grocery store and the number of cans of beans purchased.
      Depending on the total amount and number of can of
      beans purchase, you get a savings on their total bill.
      Return the savings amount:
        Spent $100 to $200 and purchase at least 3 cans of 
        beans: $10 savings
        Spent over $200 and purchase more than 4 cans 
        of beans: $25 savings
        Otherwise: $0 savings.
    */

    char groceryDiscount(double total, int cans){
        if (total >= 100 && total<= 200 && cans >= 3) {
            return 10.0;
        } else if (total > 200 && cans > 4) {
            return 25.0;
        } else {
            return 0.0;
    }
       

}