class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    

  }

 
  double approxPI(int term) {
        double pi = 0.0;

        for (int k = 0; k < term; k++) {
            pi += Math.pow(-1, k) / (2.0 * k + 1);
        }

        pi *= 4;
        return pi;
    }

  
    int term = 5;
    double result = approxPI(term);
    System.out.println(result);
    }
}
  
  
}