import java.util.Scanner;
public class QBCalculator {
	
	public static void main(String[] args) {
		double TD;
		double YDS;
		double INT;
		double COMP;
		double ATT;
		double a;
		double b;
		double c;
		double d;
		double PR;
		Scanner input=new Scanner(System.in);
		System.out.println("How many touchdowns have they scored?");
		TD=input.nextDouble();
		System.out.println("How many yards?");
		YDS=input.nextDouble();
		System.out.println("How many interceptions?");
		INT=input.nextDouble();
		System.out.println("How many completions?");
		COMP=input.nextDouble();
		System.out.println("What was the number of passes attempted?");
		ATT=input.nextDouble();
		a=((COMP/ATT)-.3)*5;
		b=((YDS/ATT)-3)*.25;
		c=(TD/ATT)*20;
		d=2.375-(INT/ATT)*25;
		PR=((a+b+c+d)/6)*100;
		System.out.println("This players Passer Rating is "+PR);
	}

}
