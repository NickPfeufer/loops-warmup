class warmups {

	public static void main(String[] args) {
		int sum = sum(5);
		System.out.println("sum of 1 to 5 is " + sum);
		if (sum == (1+2+3+4+5)){
			System.out.println("huzah, it worked");
		};
		int twotothree = xtotheN(2, 3);
		System.out.println("2 to the 3rd is: " + twotothree);
		if (twotothree == 2*2*2) {
			System.out.println("huzah, it worked");
		}
		int fact = factoral(5);
		System.out.println("5 factoral is: " + fact);
		if (fact == 5*4*3*2) {
			System.out.println("huzah, it worked");
		};

	}

	public static int sum(int end){
		int result =0;
		for (int i = 1; i <= end; i++) {
			result += i;
		};
		return result;
	}

	public static int xtotheN(int x, int n){
		int answer = 1;
		for (int k = 0; k<n; k++) {
			answer *= x;
		};
		return answer;
	}

	public static int factoral(int n){
		int answer = 1;
		for (int j = 1; j<=n; j++) {
			answer *= j;
		}
		return answer;
	}

}