import java.util.Scanner;

public class trapezoidal_rule {

	public static void main(String[] args) {	// main
		  Scanner in = new Scanner(System.in);
		  double   area , a, b, h;
	      int      n;
	      
	      // input
	      System.out.print("Enter a : ");
	      a = in.nextDouble();
	      System.out.print("Enter b : ");
	      b = in.nextDouble();
	      System.out.print("Enter n : ");
	      n = in.nextInt();
	      System.out.print("Enter t : ");
	      // end input
	      
	      // calculator
	      h = (b-a)/n;
	      area = trap(a, b, n, h);
	      // end calculator

	      System.out.print("Area [" + a + "," + b +"] from " + n ); // output
	      System.out.println(" = " + area);	// end output
	} // end main
	
	 static double trap(double a, double b, int n, double h) { // calculator Trapezoidal rule
	       double area;
	       double x;
	       int i;
	   
	       area = (f(a) + f(b))/2.0;
	       for (i = 1; i <= n-1; i++) {
	           x = a + i * h;
	           area = area + f(x);
	       }
	       area = area*h;
	   
	       return area;
	   } //end calculator Trapezoidal rule
	 
	 static double f(double x) { // function
	      double return_val;  
	      return_val = 2/(x-4); // edit to change function
	      return return_val;
	   } //end function
	 
	 
}
