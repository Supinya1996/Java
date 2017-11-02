import java.util.*;
public class gpa {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Double> credit = new ArrayList<>();
		ArrayList<Double> grade = new ArrayList<>();

		System.out.println("1.Enter your Grade and Credit");
		System.out.println("2.If you want to stop enter \"0\" and \"0\"");
		System.out.println("*******************************************");
		
		while(true) {
			System.out.print("Enter Grade : ");
			double g = in.nextDouble();
			System.out.print("Enter credit : ");
			double c = in.nextDouble();
			
			if(g == 0 && c == 0) {
				break;
			}else {
				grade.add(g);
				credit.add(c);
			}
			System.out.println("-----------------");
			
		}
		System.out.printf("Your GPA is : %.2f",getGPA(grade,credit));
		
	}
	
	static double getGPA(ArrayList<Double> grade, ArrayList<Double> credit) {
		double sum = 0;
		double e = 0;
		for (int i = 0; i < grade.size(); i++) {
			sum += credit.get(i)*grade.get(i);
			e += credit.get(i);
		}
		return sum/e;
	}

}
