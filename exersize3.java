class exersize3 {
	
	public static void main(String[] args) {
		etothex(2);
	}

	public static void etothex(double x){
		double n = 1.0;
		double answer = n * x;
		double term = x;
		System.out.println(1);
		System.out.println(term);
		System.out.println(answer);
		System.out.println(2);
		System.out.println(term);		
		System.out.println(answer);
		
		n = 3; 
		for (int i = 2; i < 20; i++) {
			answer += term;
			term = ((x * Math.exp(n-1))/(n-1)) * (x/n);
			n++;
			System.out.println(i+1);
			System.out.println(term);		
			System.out.println(answer);
		};

	}

}
