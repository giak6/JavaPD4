class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){;
    Car car1 = new Car("bmw",red,430,2026,61300);
    Car car2 = new Car("Lexus",black,SUVs,2025,40000);
    print(car1.model);
    print(car1.value);
    print(car2.model);
    print(car2.value);
  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}