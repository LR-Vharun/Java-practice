package apr_27;
import java.util.Scanner;
public class AvarageOf3nd5Numbers {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter 3 numbers to find the avarage");
	double no1=in.nextDouble();
	double no2=in.nextDouble();
	double no3=in.nextDouble();
	double result=(no1+no2+no3)/3;
	System.out.println("The avareage is "+ result );
	System.out.println("Enter 2 more numbers to find to avarage of 5 numbers");
	double no4=in.nextDouble();
	double no5=in.nextDouble();
	result=(no1+no2+no3+no4+no5)/5;
	System.out.println("The avareage of 5 no is "+ result );
	
	
	}
}
