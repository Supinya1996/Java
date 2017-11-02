import java.util.*;
public class bmi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your weight (Kg) : ");
		double weight = in.nextDouble();
		System.out.print("Enter your height (cm) : ");
		double height = in.nextDouble();
		bmi(weight,height);		
	}
	
	static void bmi(double weight, double height) {
		String bmi = null;
		double sum = weight / (Math.pow((height/100.0), 2));
		System.out.println("==============================");
		System.out.printf("Your BMI is %.2f ",sum);
		if(sum < 18.5) {
			bmi = "Underweight";
		}else if(sum > 18.5 && sum < 24.9) {
			bmi = "Normal weight";
		}else if(sum > 25.0 && sum < 29.9) {
			bmi = "Over weight";
		}else if(sum > 30.0 && sum < 34.9) {
			bmi = "Obese (Class I)";
		}else if(sum > 35.0 && sum < 39.9) {
			bmi = "Obese (Class II)";
		}else if(sum > 40.0) {
			bmi = "Obese (Class III)";
		}
				
		System.out.println(bmi+" !");
	}
	
	

}