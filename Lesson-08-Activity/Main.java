class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){

  }
  	void print(String print){
		System.out.println(print);

	}

	Double Ftoc(double f){
		double c = (f - 32.0) * 5.0 / 9.0;
		return c;

	}

	Double sphereVolume(double r){
		double s = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
		return s;
	}

	Double coneVolume(double rad, double hei){
		double v = Math.PI * Math.pow(rad, 2) * (hei/3);
		return v;
	}
	
	Double distance(double x1,double x2, double y1, double y2){
		double dis = Math.sqrt(Math.pow(x1-x2, 2))+ (Math.pow(y1-y2, 2)); 
		return dis;
	}
	


	}
)   
  
 
}