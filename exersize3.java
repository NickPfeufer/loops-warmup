class exersize3 {

    public static void main(String[] args) {
        etothex(2);
    }


    public static void etothex(double x){
        double sum = 1.0;
        double term = x;
        System.out.println("iteration: " + 1);
        System.out.println("term: " + term);
        sum += term;
        System.out.println("sum: " + sum);
        
        for (int n = 2; n <= 20; n++){
            term *= x/n
            sum += term;
            System.out.println("iteration: " + n);
            System.out.println("term: " + term);
            System.out.println("sum: " + sum);
        };

        // };


    }

}
