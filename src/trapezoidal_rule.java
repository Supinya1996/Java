import java.util.Scanner;

public class trapezoidal_rule {
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		  double   area , a, b, h;
	      int      n;        
	      System.out.print("Enter a : ");
	      a = in.nextDouble();
	      System.out.print("Enter b : ");
	      b = in.nextDouble();
	      System.out.print("Enter n : ");
	      n = in.nextInt();

	      h = (b-a)/n;
	      area = trap(a, b, n, h);

	      System.out.println("With n = " + n + " trapezoids, our estimate");
	      System.out.print("of the area from " + a + " to " + b);
	      System.out.println(" = " + area);		
	}
	
	 static double trap(double a, double b, int n, double h) {
	       double area , x;
	       int i;
	   
	       area = (f(a) + f(b))/2.0;
	       for (i = 1; i <= n-1; i++) {
	           x = a + i*h;
	           area = area + f(x);
	       }
	       area = area * h;
	   
	       return area;
	   }
	 
	 static double f(double x) {
	      double return_val;  
	      return_val = x*x + 1;
	      return return_val;
	   } 
}
