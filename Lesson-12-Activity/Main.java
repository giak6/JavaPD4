class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }

  String creditCardType(String card){
    if(card.substring(0,1).equals("4")){
      return "visa";
    }
    else if(card.substring(0,2).equals("34")|| card.substring(0,2).equals("37")){
      return "American Express";
    }
    else if(card.substring(0,3).equals("36")){
      return "Diner Club";
    }
  }
  
  String pigLatin(String word){
    return word.substring(1)+(word.substring(0,1))+("ay");
  }
}