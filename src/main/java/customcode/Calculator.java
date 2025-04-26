package customcode;

public class Calculator {

	    public double sum(double a, double b) {
	    	double sum = a+b;
	    	System.out.println("Sum of the numbers is "+sum);
	        return sum;
	    }

	    public double sub(double a, double b) {
	    	double sub = a-b;
	    	System.out.println("Sub of the numbers is "+sub);
	        return sub;
	    }

	    public double mult(double a, double b) {
	    	double multi = a*b;
	    	System.out.println("Mult of the numbers is "+multi);
	        return multi;
	    }

	    public double div(double a, double b) {
	        if (b != 0) {
	        	double divi = a/b;
	        	System.out.println("Div of the numbers is "+divi);
	            return divi;
	        } else {
	            throw new IllegalArgumentException("Division by zero is not allowed.");
	        }
	    }
}