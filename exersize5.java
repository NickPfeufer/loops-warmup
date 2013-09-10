class exersize5 {


	public static void main(String[] args) {
		hailstone(12);

	}

	public static void hailstone(int x){
	    int iterations = 0;
	    while (x > 1){
	    
		   if (x%2==0 && x>1) {

	        	System.out.print(x);
        	        System.out.println("\teven, next value is"+ x+"/2");
		        x = x/2;
        	    }else if (x%2!=0 && x>1) {

		        System.out.print(x);
	                System.out.println("\todd, next value is" + "3*" + x + " +1");
	                x=(3*x)+1;
	
		    };
		    iterations++;
	    }
            System.out.print(1);
            System.out.println("\tstop calculation. " + iterations + "iterations");

	}


}

