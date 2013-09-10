import   java.lang.Math.*;

class exersize3 {
	
	public static void main(String[] args) {
		etothex(2);
	}

	public static double etothex(double x){
		double n = 1.0;
		double answer = n * x;
		double term = x;
		double twelth = Math.exp(-12.0);
		System.out.println(answer);
		System.out.println(answer);
		n = 3; 
		while (term > twelth) {
			answer += answer + term;
			term = ((x * Math.exp(n-1))/(n-1)) * (x/n);
			n++;
		System.out.println(answer);
		};

	}

}
