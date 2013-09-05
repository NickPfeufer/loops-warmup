import java.util.Scanner;
class drugpotency {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter decimal percent change");
		double change = input.nextDouble();
		while(change >= 1 || change <= 0){
			System.out.println("error that number excedes limits");
			System.out.println("enter decimal percent change");
			change = input.nextDouble();			
		};
		System.out.println("enter decimal percent expirered");
		double expirered = input.nextDouble();
		while(expirered >= 100 || expirered < 0){
			System.out.println("error that number excedes limits");
			System.out.println("enter decimal percent expirered");
			expirered = input.nextDouble();			
		};
		drugDecay(change, expirered);
	};


	public static void drugDecay(double change, double expirered){
		double potency = 100.0;
		int month = 0;
		change = 1.0 - change;
		while (potency > expirered){
			System.out.println("Month: " + month + " effectivness: " + potency);
			potency *= change;
		};
		System.out.println("Month: " + month + " effectivness: " + potency + "drug is expirered");		
	};
}